import java.util.Scanner;

public class ejercicio22 {
    public static void main(String[] args) {
        int positivos, num, i;

        Scanner inputValue;
        inputValue = new Scanner (System.in);
        System.out.println("Introduce 10 números: ");
        inputValue.close();

        i = 0;
        while (i < 10) {
            num = inputValue.nextInt();
            if (num >= 0) {
                positivos = positivos + 1;
            }
        }
        i = i + 1;
    }
}
