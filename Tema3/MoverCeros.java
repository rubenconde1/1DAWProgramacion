package Tema3;

import java.util.Arrays;

public class MoverCeros {
    public static void main(String[] args) {
        int[] array = {3, 0, 10, 4, 0, 43};

        for (int i = 0; i < array.length -1; i++) {
            if (array[i] == 0) {
                array[i++] = array[i];
                array[i++] = 0;
                break; 
                }
            }
            System.out.println(Arrays.toString(array));
        }
    }
