package Tema6.GestionContenido;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ejemplo12 {
    public static void main(String[] args) throws IOException {
        BufferedReader f_ent = new BufferedReader(new FileReader("./Tema6/GestionContenido/origen1.txt"));
            PrintWriter f_sal = new PrintWriter(new FileWriter("./Tema6/GestionContenido/origen1_salida.txt"));
            String cad = f_ent.readLine();
            int i = 0;
            while (cad != null) {
                i++;
                f_sal.println(i + ".- " + cad);
                cad = f_ent.readLine();
            }
            f_sal.close();
            f_ent.close();
    }
}
