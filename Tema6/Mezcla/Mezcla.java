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

        File fichero1 = new File("./Tema6/Mezcla/origen1.txt");
        File fichero2 = new File(".Tema6/Mezcla/origen2.txt");
        File destino = new File("./Tema6/Mezcla/destino.txt");
        unificarFicheros(fichero1, fichero2, destino);
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
