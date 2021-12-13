package Tema4;

import java.util.Arrays;
import java.util.Scanner;

public class Longitud {
    public static void main(String[] args) {
        String Cadena = Utilidades.leerCadena("Ingrese una cadena");

        String[] arrayPalabras = Cadena.split(" ");
        System.out.println(Arrays.toString(arrayPalabras));
        System.out.print("Ingrese los carácteres:");
        Scanner inputValue = new Scanner(System.in);
        int caracteres = inputValue.nextInt();
        int caracteresPalabra;
        inputValue.close();

        /*for (int i = 0; i < arrayPalabras.length; i++) {
            int caracteresPalabra = arrayPalabras.length;

            for (int j = 0; j < arrayPalabras.length; j++) {
                if (caracteresPalabra == arrayPalabras.length) {
                    System.out.println(arrayPalabras[i]);
                }
            }
        }
    }*/
    for (int i = 0; i < arrayPalabras.length; i++) {
        for (int j = 0; j < arrayPalabras.length; j++) {
            
        }
        
            if (caracteresPalabra == caracteres) {
                System.out.println(arrayPalabras[i]);
            }
        }
    }
}

