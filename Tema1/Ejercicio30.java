package Tema1;

import java.util.Scanner;

public class Ejercicio30 {
    public static void main(String[] args) {
        String palabra;
        boolean palindromo;
        Scanner inputValue = new Scanner (System.in);

        System.out.println("Introduzca una palabra:");
        palabra = palabra.toLowerCase();
        inputValue.close();

        for (int i = 0, j = palabra.length() - 1; i <= j; i++, j--) {
            if (palabra.charAt(i) != palabra.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
