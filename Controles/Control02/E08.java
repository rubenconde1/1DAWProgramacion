package Controles.Control02;

import java.util.Scanner;

public class E08 {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        float numero, nDecimal;

        System.out.println("Ingrese un numero:");
        numero = inputValue.nextFloat();
        inputValue.close();
        
        nDecimal = numero % 1;

        if (nDecimal < 0) {
            nDecimal = nDecimal * (-1);
        }
        System.out.println(nDecimal);

    }
}
