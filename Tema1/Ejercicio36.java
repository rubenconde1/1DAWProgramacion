package Tema1;
import java.util.Scanner;

public class Ejercicio36 {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner (System.in);
        int i, max;
        int [] numeros = new int [10];

        for (i = 0; i < numeros.length; i++) {
            System.out.print("numeros[" + i + "] = ");
            numeros [i] = inputValue.nextInt();
        }
        inputValue.close();

        max = numeros [0];
        if (max < numeros[i]) {
            max = numeros [i];
        }
        System.out.println(max);
    }
}
