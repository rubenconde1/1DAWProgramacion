package Tema1;

import java.util.Scanner;

public class Ejercicio38 {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner (System.in);
        String cadena;
        int contador = 0;

        System.out.println("Introduce una cadena de texto:");
        cadena = inputValue.nextLine();
        inputValue.close();
        for (int i = 0; i < cadena.length(); i++) {
            if ((cadena.charAt(i)=='a') || (cadena.charAt(i)=='e') || (cadena.charAt(i)=='i') || (cadena.charAt(i)=='o') || (cadena.charAt(i)=='u')) {
                contador++;
            }
        }
        System.out.println("El númnero de vocales es: " + contador);
    }
}
