package Tema1;

import java.util.Scanner;

public class Ejercicio39 {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        int numero = 0;

        System.out.println("Introduce un número natural:");
        numero = inputValue.nextInt();
        inputValue.close();

        for (int i = 1; i <= numero; i++) {
          if (numero % i == 0) {
              System.out.println("El número es divisible por:");
              System.out.println(i);
          }   
        }
    }
}
