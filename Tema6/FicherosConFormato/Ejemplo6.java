package Tema6.FicherosConFormato;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ejemplo6 {
    public static void main(String[] args) throws IOException{
        DataOutputStream f = new DataOutputStream(new FileOutputStream("./Tema6/FicherosConFormato/Empleados3.dat"));
        
        String[] nombres = {"Andreu    ", "Bernat    ", "Claudia   ", "Damián    ", "Juan      "};
        int[] departamentos = {10, 20, 10, 10, 10};
        int[] edades = {32, 28, 26, 40, 30};
        double[] sueldos = {1000.0, 1200.0, 1400.0, 1300.0, 1200.0};

        for (int i = 0; i < 5; i++) {
            f.writeInt(i + 1);
            f.writeChars(nombres[i]);
            f.writeInt(departamentos[i]);
            f.writeInt(edades[i]);
            f.writeDouble(sueldos[i]);
        }
        f.close();
    }
}
