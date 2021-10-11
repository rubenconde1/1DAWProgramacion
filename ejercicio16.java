import java.util.Scanner;

public class ejercicio16 {
    public static void main(String[] args) {
        int x, y;
        int op;

        System.out.println("Introduce dos valores");
        System.out.println("Introduce el primer valor: ");

        Scanner inputValue;
        inputValue = new Scanner (System.in);
        x = inputValue.nextInt();

        System.out.println("Introduce el segundo valor: ");
        y = inputValue.nextInt();
        
        System.out.println("Escribe el número de la operación correspondiente: (1)suma, (2)resta, (3)multiplicacion, (4)division ");
 
        op = inputValue.nextInt();
 
      
        switch (op) {
            case 1: System.out.print("La suma es: " + (x + y));
                break;
            case 2: System.out.println("La resta es: " + (x - y));
                break;
            case 3: System.out.println("La multiplicación es: " + (x * y));
                break;
            case 4: System.out.println("La división es: " + (x / y)); 
                break;
            default: System.out.println("error");
                inputValue.close();
        }
        
    }
}
//Corregido