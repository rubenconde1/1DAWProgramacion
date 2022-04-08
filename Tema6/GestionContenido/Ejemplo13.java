package Tema6.GestionContenido;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ejemplo13 {
    public static void main(String[] args) throws IOException{
        InputStreamReader f_ent = new InputStreamReader(new FileInputStream("./Tema6/GestionContenido/13.txt"), "UTF-8");
        OutputStreamWriter f_sal = new OutputStreamWriter(new FileOutputStream("./Tema6/GestionContenido/13_ISO.txt"), "ISO-8859-1");

            int car = f_ent.read();
            while (car != -1) {
                f_sal.write(car);
                car = f_ent.read();
            }
            f_sal.close();
            f_ent.close();
    }
}
