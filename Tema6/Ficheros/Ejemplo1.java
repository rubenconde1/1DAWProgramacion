package Tema6.Ficheros;

import java.io.File;

public class Ejemplo1 {
    public static void main(String[] args) {
        //Abre el directorio actual '.'
        File f = new File(".");
        System.out.println("Listado de ficheros en el directorio actual.");
        System.out.println("--------------------------------------------");
        
        //recorre la lista de ficheros (recordar que un directorio es un tipo especial de fichero)

        for (String e : f.list()) {
            System.out.println(e);
        }
    }
}
