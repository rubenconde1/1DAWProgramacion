package Controles;

import java.util.Scanner;

public class Control01 {
    public static void main(String[] args) {
        int n;
        double longitud = 0;
        Scanner inputValue = new Scanner (System.in);

        System.out.println("Dime el número de lados del polígono");
        n = inputValue.nextInt();
        
    

        if ((n == 3) || (n == 4)) {
            System.out.println("Dime la longitud del lado del polígono:");
            longitud = inputValue.nextDouble();
            inputValue.close();

            if (n == 3) {
                System.out.println("El perímetro del triángulo es: " + n * longitud);
            } else {
                System.out.println("El perímetro del cuadrado es: " + n * longitud);
            }
        } else {
            System.out.println("Valor inválido");
        }
    }
}
