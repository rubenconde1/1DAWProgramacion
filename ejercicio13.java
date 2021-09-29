import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {
        int x, y;
        boolean orden;

        System.out.println("Escribe un número: ");

        Scanner inputValue;
        inputValue = new Scanner (System.in);
        x = inputValue.nextInt();

        System.out.println("Escribe un segundo número: ");
        y = inputValue.nextInt();

        System.out.println("ascendente o descendente");
        orden = inputValue.nextBoolean();

        if (orden = "ascendente") {
            if (x < y) {
                System.out.println(x + ", " + y);
            } else {
                System.out.println(y + ", " + x);
            }
            }
        } else {
        
        if (orden = "descendente") {
                if (x < y) {
                    System.out.println(y + ", " + x);
                } else {
                    System.out.println(x + ", " + y);
                }
            }
        }
    }
}
