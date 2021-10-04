import java.util.Scanner;

public class ejercicio21 {
    public static void main(String[] args) {
        int año;

        System.out.println("Introduzca un año:");

        Scanner inputValue;
        inputValue = new Scanner (System.in);
        año = inputValue.nextInt();
        inputValue.close();

        if ((año % 4 ==0) && ((año % 100 != 0) || (año % 400 == 0))) {
            System.out.println("Es año bisiesto: " + año);
        } else {
            System.out.println("No es año bisiesto: " + año);
        }
    }
}
