import java.util.Scanner;

public class ejercicio23 {
    public static void main(String[] args) {
        int num, i, positive;
        Scanner inputValue = new Scanner (System.in);

        i = 0;
        positive = 0;

        do {

        System.out.println("Enter a number:");
        num = inputValue.nextInt();

        if (num > 0) {
            positive = positive + 1;
        }
        i = i + 1;
        
        System.out.println(positive + " positives");
       
        } while (num != 0);
    }
}