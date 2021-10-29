package Tema2;

import java.util.Scanner;

public class Entrada {
    public static int getInteger () {
       
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce un número:");
        int x = 0;
        
        while (true) {
            if (inputValue.hasNextInt()) {
                x = inputValue.nextInt();
                break;
            
            } else {
                return getInteger();
            }
        }
        
        return x;
    }

    public static double getDouble () {
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce un número decimal:");
        double x = 0.0;

        while (true) {
            if (inputValue.hasNextDouble()) {
                x = inputValue.nextDouble();
                break;

            } else {
                return getDouble();
            }
        }
        return x;
    }
}
