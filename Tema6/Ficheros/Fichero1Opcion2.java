package Tema6.Ficheros;

import java.io.File;
import java.util.Scanner;

public class Fichero1Opcion2 {
    public static void main(String[] args) {
        File f = new File("/");
        File[] carpeta = f.listFiles();
        System.out.println("Lista de ficheros y directorios: " + f.getAbsolutePath());
        System.out.println("----------------------------------");
        
        for (int i = 0; i < carpeta.length; i++) {
            System.out.println(i + 1 + ".- " + carpeta[i].getName());
        }
        

        Scanner entrada = new Scanner(System.in);
        int numeroFichero = entrada.nextInt();
    }

    public void imprimirDirectorioActual(){

    }
}
