package Tema1;

import java.util.Scanner;

public class Ejercicio37 {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        int i, j = 1;
        double max = 0, min = 0;
        double [] numeros = new double [10];

        System.out.println("Introduce 10 números: ");
        for (i = 0; i < numeros.length; i++) {
            System.out.println("Número " + j++ + ":");
            numeros[i] = inputValue.nextDouble();    
        }

        max = numeros[0];
        min = numeros[0];
        for (i = 1; i < numeros.length; i++) {
            if (numeros[i] > max) {max = numeros[i];}
            if (numeros[i] < min) {min = numeros[i];}
        }
        System.out.println("Número máximo: " + max + "\n" + "Número mínimo: " + min);
    }
}
