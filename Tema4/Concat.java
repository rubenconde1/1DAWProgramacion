package Tema4;

public class Concat {
    public static void main(String[] args) {
        String Cadena1 = Utilidades.leerCadena("Introduce una cadena");
        String Cadena2 = Utilidades.leerCadena("Introduce una cadena");
        String Cadena = "";

        Cadena = Cadena.concat(Cadena1 + " " + Cadena2);
        System.out.println(Cadena);
    }
}
