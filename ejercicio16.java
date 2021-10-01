import java.util.Scanner;

public class ejercicio16 {
    public static void main(String[] args) {
        int x, y;
        String op;

        System.out.println("Introduce dos valores");
        System.out.println("Introduce el primer valor: ");

        Scanner inputValue;
        inputValue = new Scanner (System.in);
        x = inputValue.nextInt();

        System.out.println("Introduce el segundo valor: ");
        y = inputValue.nextInt();
        
        System.out.println("Escribe que operación quieres hacer: +, -, *, / ");
        /*Scanner miScanner = new Scanner (System.in);
        op = miScanner.next();
        orden = inputValue.next(); */
        op = inputValue.next();

        if (op == "suma") {
            System.out.println("La suma es: " + (x + y) );
        } else {
            System.out.println("nada");
        }
        inputValue.close();
    }
}
