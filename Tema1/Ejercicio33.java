package Tema1;

import java.util.Scanner;
public class Ejercicio33 {
public static void main(String[] argv) {
final char[] LETRAS = {'T','R','W','A','G','M','Y','F',
'P','D','X','B','N','J','Z','S','Q','V',
'H','L','C','K','E' };
Scanner inputValue = new Scanner(System.in);
int dni;
System.out.println("Introduce el DNI:");
dni = inputValue.nextInt();
inputValue.close();
System.out.println("La letra es: " + LETRAS[dni % 23]);
}
}