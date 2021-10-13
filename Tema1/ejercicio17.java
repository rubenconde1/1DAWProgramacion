package Tema1;
import java.util.Scanner;

public class ejercicio17 {
    public static void main(String[] args) {
        byte mes;

        System.out.println("Ingrese un mes: ");

        Scanner inputValue;
        inputValue = new Scanner (System.in);
        mes = inputValue.nextByte();

        inputValue.close();
        
        switch (mes) {
            case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                System.out.println("El mes tiene 31 días");
            break;

            case 2:
                System.out.println("El mes tiene 28 días");
            break;

            case 4:
                case 6:
                case 9:
                case 11:
                System.out.println("El mes tiene 30 días");
            break;

            default: System.out.println("Error");
        }

    }
}
