package Controles.Control02;

import java.util.Scanner;

public class E01 {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);

        System.out.println("Ingrese su nombre");
        String nombre = inputValue.nextLine();
        inputValue.close();

        System.out.println("Hola, " + nombre);
    }
}
