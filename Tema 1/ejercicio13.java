import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {
        int x, y;
        int orden;

        System.out.println("Escribe un número: ");

        Scanner inputValue;
        inputValue = new Scanner (System.in);
        x = inputValue.nextInt();

        System.out.println("Escribe un segundo número: ");
        y = inputValue.nextInt();

        System.out.println("Escriba 1 si quiere ascendente, escriba 2 si quiere descendente");
        orden = inputValue.nextInt();
        inputValue.close();

        switch (orden) {
            case 1:
                if (x < y) {
                    System.out.println("Los números ordenados de manera ascendente son: " + x + ", " + y);
                } else {
                    System.out.println("Los números ordenados de manera ascendente son: " + y + ", " + x);
                }
                break;
            case 2:
                if (x < y) {
                    System.out.println("Los números ordenados de manera descendente son: " + y + ", " + x);
                } else {
                    System.out.println("Los números ordenados de manera ascendente son: " + x + ", " + y);
                }
                break;
                default: System.out.println("ERROR");
        }
    }
}
