import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        int n;

        Scanner inputValue = new Scanner (System.in);

        System.out.println("Input a number: ");
        n = inputValue.nextInt();
        
        inputValue.close();

        System.out.println("Resultado:");

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++)
                System.out.print(j);
                System.out.println("");
        }
    }
}
