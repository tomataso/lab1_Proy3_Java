import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {


        menuPrincipal();

    }

    public static void menuPrincipal() {

        int opcion;

        OrdenarNums orden = new OrdenarNums();


        while (true) {
            System.out.println("*-----------------------------------*");
            System.out.println("Menú Principal:");
            System.out.println("1. Ejercicio #1: Algoritmo sencillo.");
            System.out.println("2. Ejercicio #2: Orientacion a objetos.");
            System.out.println("4. Salir.");
            System.out.print("Digite una opción: ");

            opcion = input.nextInt();

            switch (opcion) {
                case 1:

                    //Ordenar lista de números
                    orden.ordenar();

                    break;
                case 2:
                    //Password
                    menuPass();

                    break;

                case 4:
                    System.out.println("Saliendo...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción invalidad, intente otra vez.");
            }

        }

    }

    public static void menuPass() {
        int opcion;
        {
            System.out.println("Menú Paswword:");
            System.out.println("1. Generar una contraseña de 8 digitos.");
            System.out.println("2. Generar una contraseña con longitud personalizada.");
            System.out.println("4. Salir");
            System.out.print("Digite una opción: ");

            opcion = input.nextInt();

            switch (opcion) {
                case 1:

                    System.out.println("1. Generar una contraseña de 8 digitos (Valores por defecto).");
                    Password pass = new Password();
                    pass.generarPassword();
                    System.out.println("+/-/-/-/-/-/+");
                    System.out.println("Contraseña generada: " + pass.getContrasenna());
                    System.out.println("¿Es fuerte? = " + pass.esFuerte());
                    break;
                case 2:
                    System.out.println("2. Generar una contraseña con longitud personalizada.");

                    System.out.println("Digite la longitud deseada.");
                    int longUsuario = input.nextInt();

                    Password passLongPersonalizada = new Password(longUsuario);
                    passLongPersonalizada.generarPassword();
                    System.out.println("+/-/-/-/-/-/+");
                    System.out.println("Contraseña generada: " + passLongPersonalizada.getContrasenna());
                    System.out.println("¿Es fuerte? = " + passLongPersonalizada.esFuerte());

                    break;

                case 4:
                    System.out.println("Saliendo...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción invalidad, intente otra vez.");
            }

        }


    }
}