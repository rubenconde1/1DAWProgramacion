package Tema6.Ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejemplo2 {
    public static void main(String[] args) throws IOException {
        System.out.println("Introduce un directorio");
        String entrada = new BufferedReader(new InputStreamReader(System.in)).readLine();
        File f = new File(entrada);
        System.out.println("Lista de ficheros y directorios del directorio: " + entrada);
        System.out.println("-------------------------------------------------");
        for (String e : f.list()) {
            System.out.println(e);
            
        }
    }
}
