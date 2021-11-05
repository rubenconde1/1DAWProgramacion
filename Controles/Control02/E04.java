package Controles.Control02;

import java.util.Scanner;

public class E04 {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        int longitud = 0;
        double conversor = 0, pulgada = 2.54;

        System.out.println("Ingrese longitud:");
        longitud = inputValue.nextInt();
        inputValue.close();

        conversor = longitud / pulgada;
        System.out.println(longitud + " cm" + " = " + conversor + " in");


    }
}
