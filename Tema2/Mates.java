package Tema2;

public class Mates {
    static double suma (double x, double y) {
        return x + y;
    }
    static double resta (double x, double y){
        return x - y;
    }
    static double multiplicacion (double x, double y) {
        return x * y;
    }
    static double division (double x, double y) {
        return x / y;
    }

    public static double areaCirculo (double radio) {
        return Math.PI * radio * radio;
    }

    public static void main(String[] args) {
        System.out.println("La suma es = " + suma (3, 5) + "\n" + "La resta es = " + resta (3, 5) + "\n" + "La multiplicación es = " + multiplicacion(10, 5) + "\n" + "La división es = " + division(12, 4) + "\n" + "El área del círculo es = " + areaCirculo(5));
    }
}
