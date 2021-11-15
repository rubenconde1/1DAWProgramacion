package Tema2.EjerciciosValue;

public class esDivisible {

    public static boolean esDivisibleVar(int n, int m) {
        boolean resultado = false;

        /*resultado = ((n % m) == 0);

        return resultado;*/
        return (n % m) == 0;
    }
    public static void main(String[] args) {
        boolean prueba1 = esDivisibleVar(4,2);
        boolean prueba2 = esDivisibleVar(4,3);
        boolean prueba3 = esDivisibleVar(3,4);
        boolean prueba4 = esDivisibleVar(2,8);
    }
}
