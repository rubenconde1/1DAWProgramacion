package Tema1;
import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        int n;

        System.out.println("Input number:");

        Scanner inputValue = new Scanner (System.in);
        n = inputValue.nextInt();

        inputValue.close();
        
        for (int i = 1; i <= 10; i++)
            System.out.println(n + " * " + i + " = " + n * i);
    }
}
