package Tema6.GestionContenido;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
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
        FileInputStream reader = new FileInputStream(this.f);
        File salida = new File("./Tema6/GestionContenido/" + getNombreSinExtension() + "_n.bpm");
        FileOutputStream writer = new FileOutputStream(salida);

        byte[] paleta = new byte[54];

        reader.read(paleta);
        writer.write(paleta);

        int b = 0;
        b = reader.read();

        while (b != -1) {
            writer.write((char)(255-b));  
            b = reader.read();  
        }
        writer.close();
        reader.close();
    }

    public void transformaOscuro() throws IOException {
        //Transformar a una imagen más oscura y guardar como *_o.bmp
        FileInputStream reader = new FileInputStream(this.f);
        File salida = new File("./Tema6/GestionContenido/" + getNombreSinExtension() + "_o.bpm");
        FileOutputStream writer = new FileOutputStream(salida);

        byte[] paleta = new byte [54];
        
        int o = 0;

        reader.read(paleta);
        writer.write(paleta);

        o = reader.read();

        while (o != -1) {
            writer.write((char)(o/2));
            o = reader.read();
        }
        writer.close();
        reader.close();
    }

    public void transformaBlancoNegro() throws IOException {
        //Transformar a una imagen en blanco y negro y guardar como *_bn.bmp
        FileInputStream reader = new FileInputStream(this.f);
        File salida = new File("./Tema6/GestionContenido/" + getNombreSinExtension() + "_bn.bpm");
        FileOutputStream writer = new FileOutputStream(salida);

        byte[] paleta = new byte [54];

        int r = 0;
        int g = 0;
        int b = 0;

        reader.read(paleta);
        writer.write(paleta);

        r = reader.read();
        
        while (r != -1) {
            g = reader.read();
            b = reader.read();

            int media = (r+g+b)/3;

            writer.write((char)(media));
            writer.write((char)(media));
            writer.write((char)(media));
            r = reader.read();
        }
        reader.close();
        writer.close();
    }

    private String getNombreSinExtension() {
        //Devuelve el nombre del archivo f sin extensión
        String nombreFichero = f.getName();
        int pos = nombreFichero.lastIndexOf(".");
        if (pos > 0) {
            nombreFichero = nombreFichero.substring(0, pos);
        }
        return nombreFichero;
    }
}