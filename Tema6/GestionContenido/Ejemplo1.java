package Tema6.GestionContenido;

import java.io.FileInputStream;
import java.io.IOException;

public class Ejemplo1 {
    public static void main(String[] args) throws IOException {
        FileInputStream f_in = new FileInputStream("./Tema6/Mezcla/origen1.txt");
        int c = f_in.read();
        while (c != -1) {
            System.out.println((char) c);
            c = f_in.read();
        }
        f_in.close();
    }
}
