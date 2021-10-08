import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        int n;
        Scanner inputValue = new Scanner (System.in);

        System.out.println("Input a number: ");
        n = inputValue.nextInt();
        
        inputValue.close();

        System.out.println("Resultado:");

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}
