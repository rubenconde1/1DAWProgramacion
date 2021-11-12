package Tema2.Ejercicios;


public class Positivos {
    public static int positivos (int[] array) {
        int positivos1 = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
            positivos1++;
            }
        }
        return positivos1;
    } 
    public static void main(String[] args) {
        int[] array = {3, 10, -6, 9, 100, -45, -83, 323};
        System.out.println(positivos(array));
    }
}
