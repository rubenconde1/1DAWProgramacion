package Tema2.EjerciciosValue;

public class LetraDNI {
    public static char letraDni(int dni) {
        char resultado = ' ';
        char [] letras = {'T','R','W','A','G','M','Y','F',
        'P','D','X','B','N','J','Z','S','Q','V',
        'H','L','C','K','E'};

        resultado = letras[dni%23];
        
        return resultado;
    }
    public static void main(String[] args) {
        System.out.println(letraDni(20834126));
    }
}
