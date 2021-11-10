package Tema2.Ejercicios;

public class Potencia {
    public static double potencia (double x, int n) {
    double elevado = Math.pow(x, n);
    return elevado;
    }
    public static void main(String[] args) {
        System.out.println(potencia(2.4, 3));
    }
}
