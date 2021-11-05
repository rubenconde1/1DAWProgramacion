package Controles.Control02;

public class E05 {
    public static void main(String[] args) {
        int numero;

        System.out.println("Ingrese numero:");
        numero = Integer.parseInt(System.console().readLine());

        for (int i = 3; i >= 0; i--) {
            System.out.println(numero);
        }
    }
}
