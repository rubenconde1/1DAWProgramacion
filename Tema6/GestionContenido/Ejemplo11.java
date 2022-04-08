package Tema6.GestionContenido;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Ejemplo11 {
    public static void main(String[] args) throws IOException {
        PrintStream f_out = new PrintStream(new FileOutputStream("./Tema6/GestionContenido/origen11.txt"));

        float a = (float) 5.25;
        String b = "Hola.";
        f_out.print(b);
        f_out.println("Qué tal?");
        f_out.println(a + 3);
        f_out.printf("El número %d en hexadecimal es %x", 27, 27);

        f_out.close();
    }
}
