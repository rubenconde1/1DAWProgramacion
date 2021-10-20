package Tema1;
import java.util.Scanner;

public class ejercicio23 {
    public static void main(String[] args) {
        int number, i, positive;
        Scanner inputValue = new Scanner (System.in);

        i = 0;
        positive = 0;

        do {

        System.out.println("Enter a number:");
        number = inputValue.nextInt();

        if (number > 0) {
            positive = positive + 1;
        }
        i = i + 1;

        System.out.println(positive + " positives");
       
        } while (number != 0);
    
        inputValue.close();
    }
}

//Corregido