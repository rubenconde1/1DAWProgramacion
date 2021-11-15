package Tema2.EjerciciosValue;

public class Primo {
    public static boolean esPrimo (int x) {
    boolean resultado = false;
    int contador = 1;
    
    for (int i = 2; i <= x; i++) {
    if(x % i == 0) {
        contador++;
        }
    }
    if(contador <= 2) {
        resultado = true;
    } else {
        resultado = false;
    }
    return resultado;
}
    public static void main(String[] args) {
        System.out.println(esPrimo(20));
        System.out.println(esPrimo(5));
    }
}
