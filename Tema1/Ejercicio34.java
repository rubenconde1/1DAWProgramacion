package Tema1;

import java.util.Scanner;

public class Ejercicio34 {
    public static void main(String[] args) {
        final char[] digitoControl = {'T','R','W','A','G','M','Y','F',
    'P','D','X','B','N','J','Z','S','Q','V',
    'H','L','C','K','E' };
        final char[] letra = {'X','Y','Z'};
    Scanner inputValue = new Scanner(System.in);
    int nie;

    System.out.println("Introduce el NIE:");
    nie = inputValue.nextInt();
    inputValue.close();
    System.out.println("El NIE es: " + letra[nie % 3] + nie + digitoControl[nie % 23]);
    }
}
