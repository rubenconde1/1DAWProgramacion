import java.util.Scanner;

public class ejercicio19 {
    public static void main(String[] args) {
        double horas, precio, bruto, neto, tasas;

        System.out.println("Introduce las horas: ");

        Scanner inputValue;
        inputValue = new Scanner (System.in);
        horas = inputValue.nextInt();

        System.out.println("Introduce el precio: ");
        precio = inputValue.nextInt();

        inputValue.close();

        if (horas > 35) {
            bruto = 35 * precio + (horas - 35) * precio * 1.5;
        } else {
            bruto = horas * precio;
        }
        System.out.println("Salario bruto: " + bruto);

        if (bruto > 500) {
            if (bruto > 900) {
                tasas = 400 * 0.25 + (bruto - 900) * 0.45;
            } else {
                tasas = (bruto - 500) * 0.25;
            }
        } else {
            tasas = 0;
        }
        neto = bruto - tasas;
        System.out.println("Tasas: " + tasas);
        System.out.println("Neto: " + neto);
    }
}
