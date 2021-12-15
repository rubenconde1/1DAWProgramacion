package Tema4;

import java.util.Arrays;

public class Longitud3 {
    public static void main(String[] args) {
        String Cadena = Utilidades.leerCadena("Ingrese una cadena");
        int caracteres = Utilidades.leerEntero("Ingrese cuántos carácteres");
        int contador = 0;

        String[] arrayPalabras = Utilidades.dividirEnPalabras(Cadena);
        System.out.println(Arrays.toString(arrayPalabras));

        for (int i = 0; i < arrayPalabras.length; i++) {
            String palabra = arrayPalabras[i];
            int caracteresPalabra = palabra.length();

            if (caracteresPalabra < caracteres) {
                contador++;
            }
            
        }
        if (contador == arrayPalabras.length) {
            System.out.println("Todas las cadenas son cortas");
        } else {
            System.out.println("Hay alguna palabra larga en caso contrario");
        }
    }
}
