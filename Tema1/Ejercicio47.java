package Tema1;

import java.util.Scanner;

public class Ejercicio47 {
    public static void main(String[] args) {
        String[] cadenas = new String[5];
        System.out.println("Introduce 5 cadenas de texto:");
        Scanner inputValue = new Scanner(System.in);

        for (int i = 0; i < cadenas.length; i++) {
            cadenas[i] = inputValue.next();
        }
        inputValue.close();
        System.out.println("*********");
        System.out.println("* " + cadenas[0] + "  *");
        System.out.println("* " + cadenas[1] + "  *");
        System.out.println("* " + cadenas[2] + "    *");
        System.out.println("* " + cadenas[3] + "    *");
        System.out.println("* " + cadenas[4] + " *");
        System.out.println("*********");
    }
}
