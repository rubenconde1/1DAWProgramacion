package Tema2;

import java.util.Scanner;

public class aceptareto {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner (System.in);
        int numero = inputValue.nextInt();
        inputValue.close();

        for (int i = 0; i < numero; i++) {
            System.out.println("Hola mundo.");
        }
    }
}
