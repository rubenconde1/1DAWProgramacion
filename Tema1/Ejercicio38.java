package Tema1;

import java.util.Scanner;

public class Ejercicio38 {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        String [] cadena = new String [100];
        int vocalNoAcentuada = 0;

        System.out.println("Introduce un texto:");
        cadena[100] = inputValue.nextLine();
        inputValue.close();

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt == 'a' || cadena.charAt == 'e' || cadena.charAt == 'i') {
                vocalNoAcentuada++;
            }
        } 
        System.out.println("La cadena de texto contiene " + vocalNoAcentuada + " vocales no acentuadas.");
    }
}
