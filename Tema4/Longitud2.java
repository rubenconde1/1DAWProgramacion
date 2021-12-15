package Tema4;

import java.util.Arrays;

public class Longitud2 {
    public static void main(String[] args) {
        String Cadena = Utilidades.leerCadena("Ingrese una cadena");
        int caracteres = Utilidades.leerEntero("Ingrese los carácteres:");

        String[] arrayPalabras = Utilidades.dividirEnPalabras(Cadena);
        System.out.println(Arrays.toString(arrayPalabras));

        for (int i = 0; i < arrayPalabras.length; i++) {
            String palabra = arrayPalabras[i];
            int caracteresPalabra = palabra.length();

            if (caracteresPalabra == caracteres) {
                System.out.println(arrayPalabras[i]);
            }
        }
    }
}
