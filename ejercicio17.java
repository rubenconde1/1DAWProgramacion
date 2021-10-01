import java.util.Scanner;

public class ejercicio17 {
    public static void main(String[] args) {
        String mes;

        System.out.println("Ingrese un mes: ");

        Scanner inputValue;
        inputValue = new Scanner (System.in);
        mes = inputValue.next();

        switch (mes) {
            /*case enero, marzo, mayo, julio, agosto, octubre, diciembre : System.out.println("El mes tiene 31 días");
            break;
            case febrero: System.out.println("El mes tiene 28 días");
            break;
            case abril, junio, septiembre, noviembre: System.out.println("El mes tiene 30 días");
            break;
            default: System.out.println("Ingrese un mes válido"); */

            case "enero": System.out.println("El mes tiene 31 días");
            break;
            case "febrero": System.out.println("El mes tiene 28 días");
            break;
            case "marzo": System.out.println("El mes tiene 31 días");
            break;
            case "abril": System.out.println("El mes tiene 30 días");
            break;
            case "mayo": System.out.println("El mes tiene 31 días");
            break;
            case "junio": System.out.println("El mes tiene 30 días");
            break;
            case "julio": System.out.println("El mes tiene 31 días");
            break;
            case "agosto": System.out.println("El mes tiene 31 días");
            break;
            case "septiembre": System.out.println("El mes tiene 30 días");
            break;
            case "octubre": System.out.println("El mes tiene 31 días");
            break;
            case "noviembre": System.out.println("El mes tiene 30 días");
            break;
            case "diciembre": System.out.println("El mes tiene 31 días");
            break;
            
        }
        inputValue.close();
    }
}
