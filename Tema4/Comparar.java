package Tema4;

public class Comparar {
    public static void main(String[] args) {
        String Cadena1 = Utilidades.leerCadena("Introduce una cadena");
        String Cadena2 = Utilidades.leerCadena("Introduce una cadena");

        int longitudCadena1 = Cadena1.compareTo(Cadena2);
        int longitudCadena2 = Cadena2.compareTo(Cadena1);
            
            if (longitudCadena1 > longitudCadena2) {
                System.out.println("Cadena 1 es mayor");
            
            } 
            if (longitudCadena1 < longitudCadena2) {
                System.out.println("Cadena 2 es mayor");
            
            }
            if (longitudCadena1 == longitudCadena2) {  
            System.out.println("Son iguales");
            
            }
        } 
    }
