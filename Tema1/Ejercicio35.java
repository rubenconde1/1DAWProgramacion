package Tema1;

import java.util.Scanner;

public class Ejercicio35 {
    public static void main(String[] args) {
    int[] notas = new int [100];
    int suma = 0, i = 0;
    boolean hayDiez = true;
    Scanner inputValue = new Scanner(System.in);

    System.out.println("Introduce las notas:");
    while (notas[i] != -1) {
        notas[i] = inputValue.nextInt();
        if (notas[i] != -1) {
            suma += notas[i];
            i++;
            if (notas[i] == 10) {
                hayDiez = true;
            }
        }
    }
    inputValue.close();
    System.out.println("El promedio es: " + suma / i);
    if (hayDiez == true) {
        System.out.println("Hay un 10");
    } else {System.out.println("No hay 10");}
}
}