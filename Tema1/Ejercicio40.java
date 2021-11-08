package Tema1;

public class Ejercicio40 {
    public static void main(String[] args) {
        int t,  n1 = 1, n2 = 1;

        System.out.println("Los 40 primeros términos son:");
        System.out.print(n1 + ", " + n2);
        for (int i = 3; i <= 40; i++) {
            t = n1 + n2;
            System.out.print(", " + t);
            n1 = n2;
            n2 = t;        
        }
    }
}
