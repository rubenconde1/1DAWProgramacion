package Tema3;

import java.util.Arrays;

public class SumaIgual {
    public static void main(String[] args) {
        int[] array = new int [10];
        int numero = 12;
        Utilidades.rellenaArray(array, -10, 10);

        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if(array[i] + array[j] == numero) {
                    System.out.println("Se sumaría: " + array[i] + " + " + array[j]);
                }
            }
        }
    }
}
