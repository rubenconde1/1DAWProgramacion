package Tema3;

import java.util.Arrays;

public class Iguales {
    public static void main(String[] args) {
        int[] array = new int [10];
        Utilidades.rellenaArray(array, 0, 10);
        int[] arrayCopiada = array.clone();
        boolean iguales = true;
        
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(arrayCopiada));
       
        if (array.length != arrayCopiada.length) {
            System.out.println("No son iguales");
        } else {
        for (int i = 0; i < arrayCopiada.length; i++) {
            if (array[i] != arrayCopiada[i]) {
                iguales = false;
                break;
            }
        }
        if(iguales) {
            System.out.println("Son iguales");
            } else {System.out.println("No son iguales");}
        }
    }
}
