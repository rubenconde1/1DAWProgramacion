package Tema1;
import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        int numero, i = 0;
        boolean primo = true;
        Scanner inputValue = new Scanner (System.in);

        System.out.println("Introduce un valor:");
        numero = inputValue.nextInt();
        inputValue.close();

        for (i = 2; i <= numero; i++) {
            primo = true;
            for(int j = 3; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    primo = false;
            }
        }
        if (primo == true) {
        System.out.println("El número es primo.");
        } else {
        System.out.println("El número no es primo.");
    
          }
     }
}
}