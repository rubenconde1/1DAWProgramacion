import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        int n, i;
        boolean primo = false;
        Scanner inputValue = new Scanner (System.in);

        n = inputValue.nextInt();
        inputValue.close();

        for (i = n; i > 0; i++) {
            if (n % i == 0) {
                i--;
            }
        }
        if (primo) {
            System.out.println("El número es primo");
        } else {
            System.out.println("El número no es primo");
        }
    }
}
