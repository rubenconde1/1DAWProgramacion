package Tema6.GestionContenido;

import java.io.FileOutputStream;
import java.io.IOException;

public class Ejemplo5 {
    public static void main(String[] args) throws IOException {
        String text = "Contenido para el fichero.";
        FileOutputStream f_out = new FileOutputStream("./Tema6/Mezcla/origen1.txt", true);
        for (int i = 0; i < text.length(); i++) {
            f_out.write(text.charAt(i));
        }
        f_out.close();
    }
}
