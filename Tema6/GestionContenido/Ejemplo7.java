package Tema6.GestionContenido;

import java.io.FileReader;
import java.io.IOException;

public class Ejemplo7 {
    public static void main(String[] args) throws IOException{
        FileReader f_in = new FileReader("./Tema6/Mezcla/origen1.txt");
        int c = f_in.read();
        while (c != -1) {
            System.out.println((char) c);
            c = f_in.read();
        }
        f_in.close();
    }
}
