package Tema2.EjerciciosVoid;

import java.util.Scanner;

public class Positivos2 {
    public static void positivos(int[] numeros) {
        int resultado = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] >= 0) {
                resultado++;
            }
        }
        System.out.println("Positivos: " + resultado);

        return;
    }
    public static void main(String[] args) {
        int[] numeritos = new int [10];
        
        Scanner inputValue = new Scanner(System.in);

        for (int i = 0; i < numeritos.length; i++) {
            System.out.println("Dame un número: ");
            numeritos[i] = inputValue.nextInt();
        }
        positivos(numeritos);
        inputValue.close();
    }
}
