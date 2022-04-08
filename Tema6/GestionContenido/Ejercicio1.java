package Tema6.GestionContenido;

import java.io.File;
import java.io.IOException;

public class Ejercicio1 {
    public static void main(String[] args) throws IOException {
        File f = new File("./Tema6/GestionContenido/penyagolosa.bmp");

        TransformaImagen ti = new TransformaImagen(f);

        ti.transformaNegativo();
        ti.transformaOscuro();
        ti.transformaBlancoNegro();
    }
}
