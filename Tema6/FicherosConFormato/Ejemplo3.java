package Tema6.FicherosConFormato;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;

public class Ejemplo3 {
    public static void main(String[] args) throws IOException{
        RandomAccessFile f = new RandomAccessFile("./Tema6/FicherosConFormato/Empleados.dat", "r");
        f.seek(56);
        System.out.println("Número: " + f.readInt());        
        System.out.println("Nombre: " + f.readUTF());
        System.out.println("Departamento: " + f.readInt());
        System.out.println("Edad: " + f.readInt());
        System.out.println("Sueldo: " + f.readDouble());
        f.close();
    }
}
