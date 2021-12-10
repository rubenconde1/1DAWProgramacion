package Tema3;

import java.util.Arrays;

public class MoverCeros {
    public static void main(String[] args) {
        int[] array = {3, 0, 10, 4, 0, 43};
        int[] arrayVacia = new int [6];
        int j = 0;
        System.out.println(Arrays.toString(array));

        for (int i = array.length; i >= 0; i--) {
            if (array[i] != 0) {
                arrayVacia[j] = array[i];
                j++;
            }
        }
    }
}
