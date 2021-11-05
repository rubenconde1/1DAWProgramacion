package Controles.Control02;

import java.util.Scanner;

public class E06 {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        int a, b;
        double hipotenusa;

        System.out.println("Ingrese cateto a:");
        a = inputValue.nextInt();
        System.out.println("Ingrese cateto b:");
        b = inputValue.nextInt();
        inputValue.close();
        
        hipotenusa = Math.sqrt((a * a) + (b * b));

        System.out.println("La hipotenusa es " + hipotenusa);

    }
}
