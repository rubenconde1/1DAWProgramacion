import java.util.Scanner;
class ejercico5 {
   public static void main(String[] args) {
        float a;
        float b;
        float suma;
        float resta;
        float multiplicacion;
        float division;

        System.out.println("Ingresa dos valores");
        Scanner inputValue;
        inputValue = new Scanner (System.in);
        a = inputValue.nextFloat();
        b = inputValue.nextFloat();

        suma = a + b;
        System.out.println(suma);

        resta = a - b;
        System.out.println(resta);

        multiplicacion = a * b;
        System.out.println(multiplicacion);

        division = a / b;
        System.out.println(division);

    }
}