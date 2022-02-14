package Tema5.PracticaExamen2T;

public class Arrays {
    public static void main(String[] args) {
        int[] arrayNumeros = new int [1000];
        int multiplo3 = 3;
        int multiplo7 = 7;

        for (int i = 0; i < arrayNumeros.length; i += 2) {
            arrayNumeros[i] = multiplo3;
            multiplo3 = multiplo3 + 3;
        }

        for (int i = 1; i < arrayNumeros.length; i += 2) {
            arrayNumeros[i] = multiplo7;
            multiplo7 =  multiplo7 + 7;
        }

        for (int i = 13; i < arrayNumeros.length; i += 13) {
            System.out.println(arrayNumeros[i]);
        }
    }
}
