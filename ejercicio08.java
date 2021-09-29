import java.util.Scanner;

public class ejercicio08 {
    public static void main(String[] args) {
        int age;

        System.out.print("Introduce tu edad: ");
        
        Scanner inputValue;
        inputValue = new Scanner (System.in);
        age = inputValue.nextInt();
        
        if (age>=18){
            System.out.println("Eres mayor de edad");
        }

        inputValue.close();
    }

}
