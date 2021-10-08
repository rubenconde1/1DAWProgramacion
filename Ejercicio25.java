import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        int n, fact = 1;
        System.out.println("Enter a number:");

        Scanner inputValue = new Scanner (System.in);
        n = inputValue.nextInt();

        inputValue.close();
        
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + n + " is " + fact);
    }
}
