package Controles.Control02;

import java.util.Scanner;

public class E02 {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        double radio = 0, perimetro = 0, area = 0;

        System.out.println("Ingrese el radio:");
        radio = inputValue.nextDouble();
        inputValue.close();

        area = Math.PI * radio * radio;
        perimetro = 2 * Math.PI * radio;

        System.out.println("Perimetro: " + perimetro);
        System.out.println("Área: " + area);
    }
}
