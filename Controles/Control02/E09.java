package Controles.Control02;

import java.util.Scanner;

public class E09 {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        double Nc, Nl, Nf = 60, certamen1, certamen2, certamen3 = 0;

        System.out.println("Ingrese nota certamen 1:");
        certamen1 = inputValue.nextInt();
        System.out.println("Ingrese nota certamen 2:");
        certamen2 = inputValue.nextInt();
        System.out.println("Ingrese nota laboratorio:");
        Nl = inputValue.nextDouble();
        inputValue.close();


        Nc = ((certamen1 + certamen2 + certamen3) / 3 );
        //Nf = (Nc * 0.7) + (Nl * 0.3);
        //Nf - (Nl * 0.3) = (Nc * 0.7);
        Nc = Nf - (Nl * 0.3) / 0.7;

        //Despejo certamen 3
        //Nc * 3 = (c1 + c2 + c3) -> 3Nc = - C1 - C2 - C3 ->
        certamen3 = (-certamen1 - certamen2) + (Nc * 3);

        System.out.println("Necesita nota " + certamen3 + "en el certamen 3");
    }
}
