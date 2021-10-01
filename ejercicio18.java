import java.util.Scanner;

public class ejercicio18 {
    public static void main(String[] args) {
        int horas, minutos, segundos, tiempoAñadido;

        System.out.println("Introduzca el número de horas: ");
        System.out.println("Introduzca el número de minutos: ");
        System.out.println("Introduzca el número de segundos: ");

        Scanner inputValue;
        inputValue = new Scanner (System.in);
        horas = inputValue.nextInt();
        minutos = inputValue.nextInt();
        segundos = inputValue.nextInt();
        inputValue.close();

        tiempoAñadido = segundos + 1;

        if (tiempoAñadido >= 60) {
            segundos = 0;
            minutos = minutos + 1;
        } else {
            if (segundos < 60) {
                segundos = segundos + 1;
            }
        }
        if (minutos >= 60) {
            minutos = 0;
            horas = horas + 1;
        } else {
            if (minutos < 60) {
                minutos = minutos + 1;
            }
        }
        System.out.println("La hora es: " + horas + ":" + minutos + ":" + segundos);
    }
}
