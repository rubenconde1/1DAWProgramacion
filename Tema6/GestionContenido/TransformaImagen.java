package Tema6.GestionContenido;

import java.io.File;
import java.io.IOException;

//Constructor para el Ejercicio 1
public class TransformaImagen {
    File f = null;

    public TransformaImagen (File fEnt) {
        //Control de existencia del fichero y control de la extensión .bmp (sacar mensaje de error)
        if (!fEnt.exists()) {
            System.out.println("El archivo no existe.");
        } else {
            if (fEnt.getName().substring(fEnt.getName().indexOf(".")).equals(".bmp")) {
                f = fEnt;
            }
        }
    }

    public void transformaNegativo() throws IOException {
        //Transformar a negativo y guardar como *_n.bmp

    }

    public void transformaOscuro() throws IOException {
        //Transformar a una imagen más oscura y guardar como *_o.bmp

    }

    public void transformaBlancoNegro() throws IOException {
        //Transformar a una imagen en blanco y negro y guardar como *_bn.bmp

    }

    private String getNombreSinExtension() {
        //Devuelve el nombre del archivo f sin extensión

    }
}
