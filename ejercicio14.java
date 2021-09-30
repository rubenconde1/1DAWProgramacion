import java.util.Scanner;

public class ejercicio14 {
    public static void main(String[] args) {
        int x;

        System.out.println("Ingrese su nota: ");

        Scanner inputValue;
        inputValue = new Scanner (System.in);
        x = inputValue.nextInt();

        if (x < 3) {
            System.out.println("Muy deficiente");
        } else {
            if (x < 5) {
                System.out.println("Insuficiente");
            } else {
                if (x < 6) {
                    System.out.println("Suficiente");
                } else {
                    if (x < 7) {
                        System.out.println("Bien");
                    } else {
                        if (x < 9) {
                            System.out.println("Notable");
                        } else {
                            System.out.println("Sobresaliente");
                        }
                    }
                }
            }
        }
            
        inputValue.close();
    }
}
