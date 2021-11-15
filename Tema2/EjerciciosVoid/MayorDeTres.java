package Tema2.EjerciciosVoid;

import java.util.Scanner;

public class MayorDeTres {
    public static void mayorDeTres (double[] numeros) {
        double max = 0;
        max = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > max) {max = numeros[i];}

        }
        System.out.println("El valor mayor es: " + max);
    }
    public static void main(String[] args) {
        double [] numeros = new double [3];
        Scanner inputValue = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce un número: ");
            numeros[i] = inputValue.nextDouble();
        }
        inputValue.close();
        mayorDeTres(numeros);
    }
}
