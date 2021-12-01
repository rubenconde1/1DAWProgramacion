package Tema3;

import java.util.Arrays;

public class ParesImpares {
    public static void main(String[] args) {
        int[] array = new int [10];
        Utilidades.rellenaArray(array, 0, 20);

        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i] + " el número es par");
            } else {System.out.println(array[i] + " es impar");}
        }
    }
}
