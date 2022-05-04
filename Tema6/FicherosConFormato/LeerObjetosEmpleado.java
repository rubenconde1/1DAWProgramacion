package Tema6.FicherosConFormato;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LeerObjetosEmpleado {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        ObjectInputStream f = new ObjectInputStream(new FileInputStream("./Tema6/FicherosConFormato/Empleados.obj"));
        
        Empleado e;

        try {
            while (true) {
                e = (Empleado) f.readObject();
                System.out.println("Número: " + e.getNum());
                System.out.println("Nombre: " + e.getNombre());
                System.out.println("Departamento: " + e.getDepartamento());
                System.out.println("Edad: " + e.getEdad());
                System.err.println("Sueldo: " + e.getSueldo());
                System.out.println();
            }
        } catch (EOFException eof) {
            f.close();
        }
    }
}
