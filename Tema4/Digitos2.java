package Tema4;

public class Digitos2 {
    public static void main(String[] args) {
        String Cadena = Utilidades.leerCadena("Introduce una cadena");
        int contador = 0;

        for (int i = 0; i < Cadena.length(); i++) {
            char numeros = Cadena.charAt(i);
            if (Character.isDigit(numeros) == true) {
                contador++;
            }
        }
        System.out.println(contador);
    }
}
