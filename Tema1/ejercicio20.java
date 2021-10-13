package Tema1;
import java.util.Scanner;

public class ejercicio20 {
    public static void main(String[] args) {
        float precio,descuento, precioFinal;
        
        System.out.println("Ingrese el precio: ");

        Scanner inputValue;
        inputValue = new Scanner (System.in);
        precio = inputValue.nextFloat();
        inputValue.close();
        
        if (precio <= 6) {
            descuento = 0;
        } else {
            if (precio < 60) {
                descuento = precio * 0.05f;
            } else {
                    descuento =  precio * 0.1f;
                }
            }
        precioFinal = precio - descuento;
        System.out.println("El precio final es: " + precioFinal);
    }
}
