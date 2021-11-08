package Tema1;
import java.util.Scanner;

public class Ejercicio42 {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        System.out.print("Enter number 1:");
        int x, y, mult;

        x = inputValue.nextInt();

        System.out.print("Enter number 2:");
        y = inputValue.nextInt();
        inputValue.close();

        mult = x;
        for (int i = 1; i < y; i++) {
            mult = mult + x;   
        }
        System.out.println(mult);
    }
}