package Tema1;
import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        int x;
        int y;

        System.out.println("Ingresa un número: ");
        
        Scanner inputValue;
        inputValue = new Scanner (System.in);
        x = inputValue.nextInt();

        System.out.println("Ingresa otro número: ");
        y = inputValue.nextInt();

        if (x < y) {
            System.out.println(x + ", " + y);
        } else {
            System.out.println(y + ", " + x);
        }
        inputValue.close();
    }
}
