package Tema3;

import java.util.Arrays;

public class Comunes {
    public static void main(String[] args) {
        int[] arrayPrincipal = new int [10];
        int[] arraySecundaria = new int [10];

        Utilidades.rellenaArray(arrayPrincipal, -10, 10);
        Utilidades.rellenaArray(arraySecundaria, -10, 10);

        System.out.println(Arrays.toString(arrayPrincipal));
        System.out.println(Arrays.toString(arraySecundaria));

    
        for (int i = 0; i < arrayPrincipal.length; i++) {
            for (int j = 0; j < arraySecundaria.length; j++) {
                if (arrayPrincipal[i] == arraySecundaria[j]) {
                    System.out.println("Números repetidos: " + arrayPrincipal[i]);
                }
            }
        }
    }
}
