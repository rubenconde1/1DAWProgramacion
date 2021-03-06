package Tema6.GestionContenido;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class Ejemplo3 {
    public static void main(String[] args) throws IOException {
        FileInputStream f1 = new FileInputStream("./Tema6/Mezcla/origen1.txt");
        String ent_1 = "Esto es un array de bytes con caracteres raros: á ç ñ";
        ByteArrayInputStream f2 = new ByteArrayInputStream(ent_1.getBytes());
        SequenceInputStream f_in = new SequenceInputStream(f1, f2);
        int c = f_in.read();

        while (c != -1) {
            System.out.println((char) c);
            c = f_in.read();
        }
        f_in.close();
        f1.close();
        f2.close();
    }
}
