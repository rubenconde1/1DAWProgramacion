package Controles;

import java.util.Scanner;

public class SoluciónControl01 {
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        int numLados = 0;
        double longitud = 0;
        double perimetro = 0;

        System.out.println( "Dime....");
        numLados = lector.nextInt();
        lector.close();
        if (numLados == 3 || numLados == 4) {
            System.out.println("Dime la longitud...");
            perimetro = numLados * longitud;

            switch (numLados) {
                case 3:
                System.out.println(perimetro);
                break;
                case 4:
                System.out.println(perimetro);
                break;
                default:
            }
        }
    }
}
