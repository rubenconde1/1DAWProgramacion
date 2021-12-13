package Tema4;

public class LastIndexOf {
    public static void main(String[] args) {
        String Cadena1 = Utilidades.leerCadena("Ingrese una cadena");
        String Cadena2 = Utilidades.leerCadena("Ingrese una cadena");

        System.out.println(Cadena1.lastIndexOf(Cadena2));
    }
}
