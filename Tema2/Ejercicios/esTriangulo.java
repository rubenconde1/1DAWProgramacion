package Tema2.Ejercicios;

public class esTriangulo {

    public static boolean esTrianguloVar(int a, int b, int c) {

        boolean resultado = false;
        
        if ((a > (b + c)) || (b > (a + c)) || (c > (a + b))) {
            resultado = false;
        } else {
            resultado = true;
        }
        
        return resultado;
    }
    public static void main(String[] args) {
        boolean prueba1 = esTrianguloVar(5,4,2);
        boolean prueba2 = esTrianguloVar(17, 3, 1);
    }
}
