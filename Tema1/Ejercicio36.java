package Tema1;
import java.util.Scanner;

public class Ejercicio36 {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner (System.in);
        int i,j=1;
        double max = 0;
        double [] numeros = new double [10];

        System.out.println("Introduce diez números:");
        for (i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese número " + j++ + ":");
            numeros [i] = inputValue.nextDouble();
            inputValue.close();
        }
        max = numeros[0];
        
        for (i = 1; i < numeros.length; i++) {
            if (numeros[i] > max)
            max = numeros[i];
        }
        
        System.out.println("Número máximo: " + max);
    }
}
