package Tema4;

public class Ends {
    public static void main(String[] args) {
        String Cadena1 = Utilidades.leerCadena("Ingrese una cadena");
        String Cadena2 = Utilidades.leerCadena("Ingrese una cadena");

        System.out.println(Cadena1.endsWith(Cadena2));
    }
}
