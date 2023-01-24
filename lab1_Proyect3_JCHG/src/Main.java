import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcion;

        OrdenarNums orden = new OrdenarNums();

        while (true) {
            System.out.println("Menú Principal:");
            System.out.println("1. Ejercicio 1: Algoritmo sencillo");
            System.out.println("2. Ejercicio 2: Orientacion a objetos");
            System.out.println("4. Salir");
            System.out.print("Enter your choice: ");

            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    //

                    orden.ordenar();

                    break;
                case 2:
                    //
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion invalidad, intente otra vez.");
            }
        }
    }
}