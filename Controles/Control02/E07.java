package Controles.Control02;

import java.util.Scanner;

public class E07 {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        int t, h, hFutura;

        System.out.println("Hora actual:");
        t = inputValue.nextInt();
        System.out.println("Cantidad de horas:");
        h = inputValue.nextInt();
        inputValue.close();

        hFutura = h + t;
        while(hFutura>24) {
            hFutura -= 24;
        }

        System.out.println("En " + h + " horas, el reloj marcara las " + hFutura);
    }
}
