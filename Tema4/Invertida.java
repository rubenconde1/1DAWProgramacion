package Tema4;

import java.lang.reflect.Array;

public class Invertida {
    public static void main(String[] args) {
        String cadena  = Utilidades.leerCadena("Ingrese una cadena");
        System.out.println(cadena);

        String[] cadenaArray = Utilidades.dividirEnPalabras(cadena);
        String[] invertido = new String [100];

        for (int i = Array.getLength(cadenaArray); i < cadenaArray.length; i--) {
            cadenaArray[i] = invertido
        }

        
        


    }
}
