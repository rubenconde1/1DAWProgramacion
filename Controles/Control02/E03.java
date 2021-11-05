package Controles.Control02;

import java.util.Scanner;

public class E03 {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        double promedio = 0, nota1, nota2, nota3, nota4;

        nota1 = inputValue.nextDouble();
        nota2 = inputValue.nextDouble();
        nota3 = inputValue.nextDouble();
        nota4 = inputValue.nextDouble();
        inputValue.close();
        
        promedio = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("El promedio es: " + promedio);



        

    }
}
