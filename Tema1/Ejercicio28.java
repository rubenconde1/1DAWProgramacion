package Tema1;
import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        int n, i = 0;
        boolean primo = false;
        Scanner inputValue = new Scanner (System.in);

        System.out.println("Introduce un valor:");
        n = inputValue.nextInt();
        inputValue.close();

        for (n = i; i > 0; i++) {
            if (i % n == 0) {
                primo = false;
            }
        }
        if (primo) {
            System.out.println("El número es primo");
        } else {
            System.out.println("El número no es primo");
        }
    }
}
