package Tema6.Mezcla;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Mezcla {
    public static void main(String[] args) throws IOException {
        //Dirección entera: /home/INFORMATICA/alu10193045/Escriptori/Programación/
        //Ruta de los ficheros origen y de destino.
        String rutaFichero1 = "./Tema6/Mezcla/origen1.txt";
        String rutaFichero2 = ".Tema6/Mezcla/origen2.txt";
        String rutaDestino = "./Tema6/Mezcla/destino.txt";

        File fichero1 = new File(rutaFichero1);
        System.out.println(fichero1.getName());
        File fichero2 = new File(rutaFichero2);
        File destino = new File(rutaDestino);
        System.out.println(fichero2.getName());
        System.out.println(destino.getName());
    }

    public static void unificarFicheros(File fichero1, File fichero2, File destino) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fichero1));
        BufferedReader br2 = new BufferedReader(new FileReader(fichero2));

        BufferedWriter bw = new BufferedWriter(new FileWriter(destino));

        copiar(bw, br);
        copiar(bw, br2);
    }

    private static void copiar (BufferedWriter bw, BufferedReader br) throws IOException {
        String linea = br.readLine();
        while (linea != null) {
            bw.write(linea);
             linea = br.readLine();
        }
    }
}
