import java.util.Arrays;
import java.util.Scanner;

public class OrdenarNums {

    public void ordenar()
    {

        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[5];

        System.out.println("Digite 5 números:");
        for (int i = 0; i < 5; i++) {

            int contador = i + 1;

            System.out.println("Este es el número #" + contador );
            numeros[i] = entrada.nextInt();
        }

        Arrays.sort(numeros);

        System.out.println("Lista ordenada");
        for (int num : numeros) {


            System.out.println(num);


    }

    }
}
