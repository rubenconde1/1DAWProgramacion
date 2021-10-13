package Tema1;
import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        int x, y;

        System.out.println("Escribe un número: ");

        Scanner inputValue;
        inputValue = new Scanner (System.in);
        x = inputValue.nextInt();

        System.out.println("Escribe otro número ");
        y = inputValue.nextInt();

        if (x < y) {
            System.out.println("El número mayor es: " + y);
        } else {
            System.out.println("El número mayor es: " + x);
        }
        inputValue.close();
    }
}
