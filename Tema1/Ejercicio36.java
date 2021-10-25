package Tema1;
import java.util.Scanner;

public class Ejercicio36 {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner (System.in);
        int i, max = 0, min = 0;
        int [] numeros = new int [10];

        System.out.println("Introduce diez números:");
        for (i = 1; i <= 10; i++) {
            System.out.println("Ingrese número " + i + ":");
            numeros [i] = inputValue.nextInt();
            if (min != 0 && max != 0) {
                if (numeros[i] > max) {
                    max = numeros[i];
                }
                if (numeros[i] < min) {
                    min = numeros[i];
                }
            } else {
                min = numeros[i];
                max = numeros[i];
            }
        }
        System.out.println("Número máximo: " + max);
    }
}
