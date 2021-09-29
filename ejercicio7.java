import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        double precioReal;
        double precioRebajado;
        double descuento;

        System.out.println("Introduce el precio rebajado");

        Scanner inputValue;
        inputValue = new Scanner (System.in);
        precioRebajado = inputValue.nextFloat();

        System.out.println("Introduce el precio real");
        precioReal = inputValue.nextFloat();

        descuento = (precioRebajado - precioReal) / precioRebajado * 100;
        System.out.println("El descuento es:" + descuento + "%");
    }
}
