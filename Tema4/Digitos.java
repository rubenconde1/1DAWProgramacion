package Tema4;

public class Digitos {
    public static void main(String[] args) {
        String Cadena = Utilidades.leerCadena("Ingrese una cadena");
        int contador = 0;

        for (int i = 0; i < Cadena.length(); i++) {
            char numeros = Cadena.charAt(i);
            if (Character.isDigit(numeros) == true) {
                contador++;
            }
            //System.out.println(Character.isDigit(letra;));
        }
        System.out.println(contador);
    }
}
