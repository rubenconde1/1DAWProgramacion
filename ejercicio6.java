import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        float radio;
        final double PI = 3.14159;
        double area;
        double perimetro;

        System.out.println("Ingresa el radio");
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        radio = inputValue.nextFloat();

        area = PI * radio * radio;
        perimetro = 2 *PI * radio;

        System.out.println(area);
        System.out.println(perimetro);
        inputValue.close();

    }
}
