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
        
        System.out.println("Escribe que operación quieres hacer: suma, resta, multiplicacion, division ");
        /*Scanner miScanner = new Scanner (System.in);
        op = miScanner.next();
        orden = inputValue.next(); */
        op = inputValue.next();
 
      
        switch (op) {
            case sumar: System.out.print("La suma es: " + (x + y));
                break;
            case restar: System.out.println("La resta es: " + (x - y));
                break;
            case multiplicacion: System.out.println("La multiplicación es: " + (x * y));
                break;
            case division: System.out.println("La división es: " + (x / y)); 
                break;
            default: System.out.println("error");
                inputValue.close();
        }
        
    }
}
