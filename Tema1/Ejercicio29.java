package Tema1;

public class Ejercicio29 {
    public static void main(String[] args) {
    int i = 0, j = 0;
    boolean primo;

    for (i = 3; i <= 100; i++) {
        primo = true;
        for (j = 2; j < i; j++) {
            if (i % j == 0) {
                primo = false;
            }
        }
        if (primo) {
            System.out.println(i);
        }
        }
    }
}