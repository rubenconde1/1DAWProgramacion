package Tema1;
import java.util.Scanner;

public class ejercicio14 {
    public static void main(String[] args) {
        
        //Declaración de variables
        Scanner inputValue = new Scanner (System.in);
        byte nota = 0;

        //Programa principal
        System.out.println("Introduce la nota:");
        nota = inputValue.nextByte();

        inputValue.close();

        if ((nota >= 0) && (nota < 3)) {
            System.out.println("Muy deficiente");
        } else if ((nota >= 3) && (nota < 5)) {
            System.out.println("Insuficiente");
       
        } else if ((nota >= 5) && (nota < 6)) {
            System.out.println("Suficiente");
       
        } else if ((nota >= 6) && (nota < 7)) {
            System.out.println("Bien");
        
        } else if ((nota >= 7) && (nota < 9)) {
            System.out.println("Notable");
        
        } else if ((nota >= 9) && (nota <= 10)) {
            System.out.println("Sobresaliente");
        }else {
            System.out.println("Incorrecta");
        }
    }
}
//Corregido