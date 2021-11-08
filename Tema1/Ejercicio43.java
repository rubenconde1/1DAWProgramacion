package Tema1;
import java.util.Scanner;

public class Ejercicio43 {
    public static void main(String[] args) {
       Scanner inputValue = new Scanner(System.in);
       double dividend, divisor;
       
       System.out.println("Enter dividend:");
       dividend = inputValue.nextDouble();
       System.out.println("Enter divisor:");
       divisor = inputValue.nextDouble();
       inputValue.close();

       while (dividend >= divisor) {
           dividend = dividend - divisor;
       }
       System.out.println(dividend);
    }
}
