package Tema3;

import java.util.Scanner;

public class Eliminar {
        public static void main(String[] args) {
            Scanner inputValue = new Scanner(System.in);
            int[] array = {3, 2, 10, 34, 95};
            int valorIntroducido;

            System.out.println("Introduce un valor del array");
            valorIntroducido = inputValue.nextInt();
            inputValue.close();

            for (int i = 0; i < array.length; i++) {
                if (valorIntroducido == array[i]) {
                    array[i] = array[4];
                }
            }
            System.out.println(array);
    }
}