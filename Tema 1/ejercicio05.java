import java.util.Scanner;
class ejercico5 {
   public static void main(String[] args) {
        int a, b;
        int suma, resta, multiplicacion, division;

        System.out.println("Ingresa dos valores");
        Scanner inputValue;
        inputValue = new Scanner (System.in);
        b = inputValue.nextInt();
        a = inputValue.nextInt();

        suma = a + b;
        System.out.println(suma);

        resta = a - b;
        System.out.println(resta);

        multiplicacion = a * b;
        System.out.println(multiplicacion);

        division = a / b;
        System.out.println(division);
        inputValue.close();
    }
}