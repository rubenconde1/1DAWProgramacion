package Tema1;

import java.util.Scanner;

public class Ejercicio35 {
    public static void main(String[] args) {
        int suma = 0, i = 0;
        int [] nota = new int [i];
        float promedio = suma / nota.length;
        boolean hayDiez = false;
        Scanner inputValue = new Scanner (System.in);

        System.out.println("Introduce las notas:");

        for (i = 0; i < nota.length; i++) {
            nota [i] = inputValue.nextInt();
            suma += nota[i];

            if(nota[i] == 10) {
                hayDiez = true;
            }
        }
        inputValue.close();

        System.out.println("El promedio es: " + promedio);
        if(hayDiez) {
            System.out.println("Hay un 10");
        } else {
            System.out.println("No hay 10");
        }
        /*do {
            nota [i] = inputValue.nextInt();

            if(nota [i] != -1) {
                suma += nota [i];
                i++;
                if (nota[i] == 10)  {
                    hayDiez = true;
                }
            }
        } while (nota [i] != -1);
        inputValue.close();
        System.out.println("El promedio es: " + suma / nota.length);
        if (hayDiez) {
            System.out.println("Hay un 10");
        } else {
            System.out.println("No hay 10");
        } */
    }
}
