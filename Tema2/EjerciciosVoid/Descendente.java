package Tema2.EjerciciosVoid;

public class Descendente {
    public static void descendente (double x, double y) {
        if (x > y) {
            System.out.println(x + ", " + y);
        } else {
            System.out.println(y + ", " + x);
        }
    }
    public static void main(String[] args) {
        descendente(3.7, 23);
    }
}
