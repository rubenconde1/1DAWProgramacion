package Tema2.EjerciciosVoid;

import java.util.Scanner;

public class Mayor {
    public static void mayor (int edad) {
        Scanner inputValue = new Scanner(System.in);

        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
            inputValue.close();
        } else{}
    }
    public static void main(String[] args) {
        mayor(12);
    }
}
