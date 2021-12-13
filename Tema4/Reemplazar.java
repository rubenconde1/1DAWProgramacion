package Tema4;

public class Reemplazar {
    public static void main(String[] args) {
        String Cadena1 = Utilidades.leerCadena("Ingrese una cadena");
        char letra1 = Utilidades.leerCaracter("Ingrese un carácter");
        char letra2 = Utilidades.leerCaracter("Ingrese un carácter");

        Cadena1 = Cadena1.replace(letra1, letra2);

        System.out.println(Cadena1);

    }
}
