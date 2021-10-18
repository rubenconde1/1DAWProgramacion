package Tema1;

import java.util.Scanner;

public class Ejercicio30 {
    public static void main(String[] args) {
        String palabra;
        boolean palindromo = true;
        Scanner inputValue = new Scanner (System.in);

        System.out.println("Introduzca una palabra:");
        palabra = inputValue.nextLine();
        inputValue.close();

        for (int i = 0, j = palabra.length() - 1; i <= j; i++, j--) {
            if (palabra.charAt(i) != palabra.charAt(j)) {
                palindromo = false;
            }
        }
        if (palindromo == true) {
            System.out.println("La palabra: " + palabra + "," + " es palíndromo");
        } else {System.out.println("La palabra: " + palabra + "," + " no es palíndromo");
    }
    }
}
