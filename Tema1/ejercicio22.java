package Tema1;
import java.util.Scanner;
public class ejercicio22 {
    public static void main (String argv[]) {
        int positives, i, num;

        System.out.println("Ingrese 10 números: ");
        Scanner inputValue;
        inputValue = new Scanner(System.in);

        i = 0;
        positives = 0;
        while (i < 10) {
            num = inputValue.nextInt();
            if (num >= 0) {
                positives = positives + 1;
            }
            i = i + 1;
        }
        System.out.println(positives + " positives");
        inputValue.close();
    }
}

//Corregido