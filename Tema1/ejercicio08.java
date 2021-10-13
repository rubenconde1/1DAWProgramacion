package Tema1;
import java.util.Scanner;

public class ejercicio08 {
    public static void main(String[] args) {
        //Define variables
        short age;

        //Begin the program
        System.out.print("Introduce tu edad: ");
        
        Scanner inputValue = new Scanner (System.in);
        age = inputValue.nextShort();
        
        if (age>=18){
            System.out.println("Eres mayor de edad");
        }

        inputValue.close();
    }

}
