package Tema6.GestionContenido;

import java.io.FileInputStream;
import java.io.IOException;

public class Ejemplo4 {
    public static void main(String[] args) throws IOException {
        FileInputStream f_in = new FileInputStream("./Tema6/Mezcla/origen1.txt");
        byte[] buffer = new byte[30];
        int n = f_in.read(buffer);

        while (n != -1) {
            for (int i = 0; i < n; i++) {
                System.out.println((char) buffer[i]);
                System.out.println("");
                n = f_in.read(buffer);
            }
            f_in.close();
        }
    }
}
