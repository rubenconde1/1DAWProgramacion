package Tema1;
import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        int valor;

        System.out.println("Ingrese un valor: ");

        Scanner inputValue;
        inputValue = new Scanner (System.in);
        valor = inputValue.nextInt();

        if (valor >= 0) {
            System.out.println("El valor es positivo");
        } else {
            System.out.println("El valor es negativo");
        }
        inputValue.close();
    }
}