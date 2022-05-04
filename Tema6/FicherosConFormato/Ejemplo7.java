package Tema6.FicherosConFormato;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Ejemplo7 {
    public static void main(String[] args) throws IOException{
        RandomAccessFile f = new RandomAccessFile("./Tema6/FicherosConFormato/Empleados3.dat", "r");
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Qué registro? (-1 para salir): ");        
        int num = sc.nextInt();
        char[] nombre = new char[20];
        while (num != -1) {
            f.seek(40 * (num-1));
            System.out.println("Núm.: " + f.readInt());
            for (int i = 0; i < 10; i++) {
                nombre[i] = f.readChar();
            }
            System.out.println("Nombre: " + new String(nombre));
            System.out.println("Departamento: " + f.readInt());
            System.out.println("Edad: " + f.readInt());
            System.out.println("Sueldo: " + f.readDouble());
            System.out.println();
            System.out.println("¿Qué registro? (-1 para salir): ");
            num = sc.nextInt();
        }
        f.close();
        sc.close();
    }
}
