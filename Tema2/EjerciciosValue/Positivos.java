package Tema2.EjerciciosValue;


public class Positivos {
    public static int positivos (int[] array) {
        int positivo = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
            positivo++;
            }
        }
        return positivo;
    } 
    public static void main(String[] args) {
        int[] array = {3, 10, -6, 9, 100, -45, -83, 323};
        System.out.println(positivos(array));
    }
}
