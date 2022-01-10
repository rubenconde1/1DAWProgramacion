package Tema4;

public class AnalizaString {
    public static void main(String[] args) {
        String Cadena = "Hola, mundo 2022";
        int contadorDigito = 0;
        int contadorLetra = 0;
        int contadorOtros = 0;

        System.out.println(Cadena);

        for (int i = 0; i < Cadena.length(); i++) {
            char caracter = Cadena.charAt(i);
                if (Character.isDigit(caracter) == true) {
                    contadorDigito++;    
                }

                if (Character.isLetter(caracter) == true) {
                    contadorLetra++;

                } else {
                    contadorOtros = Cadena.length() - (contadorDigito + contadorLetra);  
            }
        }
        System.out.println("La Cadena tiene " + contadorDigito + " números.");
        System.out.println("La Cadena tiene " + contadorLetra + " letras.");
        System.out.println("La Cadena tiene " + contadorOtros + " otros.");
    }
}
