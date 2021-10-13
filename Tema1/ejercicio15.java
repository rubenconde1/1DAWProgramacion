package Tema1;
import java.util.Scanner;

public class ejercicio15 {
    public static void main (String argv[]) {
        //Declaración de variables
        int grade;
        Scanner inputValue;

        //Inicio del programa
        System.out.println("Introduce un número del 1 al 10: ");

        inputValue = new Scanner(System.in);
        grade = inputValue.nextInt();

        switch (grade) {
            case 1: System.out.println("uno");
                break;
            case 2: System.out.println("dos");
                break;
            case 3: System.out.println("tres");
                break;
            case 4: System.out.println("cuatro");
                break;
            case 5: System.out.println("cinco");
                break;
            case 6: System.out.println("seis");
                break;
            case 7: System.out.println("siete");
                break;
            case 8: System.out.println("ocho");
                break;
            case 9: System.out.println("nueve");
                break;
            case 10: System.out.println("diez");
                break;
            default: System.out.println("ERROR");
        }
        inputValue.close();
    }
}
//Corregido