package Tema3;

public class Duplicados {
    static int[] lista;

    static boolean numero(int num) {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == num) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] array = {1, 3, 50, 39, 4, 3};
        int count;
        lista = new int [array.length];

        for (int i = 0; i < array.length; i++) {
            count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                    if (numero(array[i])) {
                        lista[i] = array[i];
                    }
                }
            }
            if(count > 1) {
                System.out.println(lista[i] + " se repite: " + count);
            }
        }
    }
}
