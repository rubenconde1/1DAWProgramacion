package Tema4;

public class CompararIgnoreCase {
    public static void main(String[] args) {
        String Cadena1 = Utilidades.leerCadena("Introduce una cadena");
        String Cadena2 = Utilidades.leerCadena("Introduce una cadena");

        int longitudCadena1 = Cadena1.compareToIgnoreCase(Cadena2);
        int longitudCadena2 = Cadena2.compareTo(Cadena1);

        if (longitudCadena1 > longitudCadena2) {
            System.out.println("La Cadena 1 es mayor por " + longitudCadena1 + " carácteres");
        }

        if (longitudCadena2 > longitudCadena1) {
            System.out.println("La Cadena 2 es mayor por " + longitudCadena2 + " carácteres");
        }

        if (longitudCadena1 == longitudCadena2) {
            System.out.println("Las Cadenas son iguales");
        }
    }
}
