package Tema1;
import java.util.Scanner;

public class Ejercicio43 {
    public static void main(String[] args) {
       Scanner inputValue = new Scanner(System.in);
       double dividend, divisor;
       int contador = 0;
       
       System.out.println("Enter dividend:");
       dividend = inputValue.nextDouble();
       System.out.println("Enter divisor:");
       divisor = inputValue.nextDouble();
       inputValue.close();

       while (dividend >= divisor) {
           dividend = dividend - divisor;
           contador++;
       }
       System.out.println(dividend);
       System.out.println("El número de restas ha sido: " + contador);
       
    }
}
