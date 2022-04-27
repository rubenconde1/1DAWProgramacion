package Tema6.EstadisticaTexto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class EstadisticaTexto {
    public static int contadorPalabras;
    public static int contadorLineas;
    public static int contadorLetras;
    public static double porcentajeVocales;
    public static double porcentajeConsonantes;
    public static double porcentajeEspacios;
    public static double porcentajeTabuladores;
    
    public static void main(String[] args) throws IOException{
        File fichero = new File("./Tema6/EstadisticaTexto/Texto.txt");
        System.out.println(encontrarPalabras(fichero));
    }
    
    public static int encontrarPalabras(File fichero) throws IOException{
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fichero));
            String linia = reader.readLine();

            while (linia != null) {
                String[] palabras = linia.split(" ");
                contadorPalabras += palabras.length;
                linia = reader.readLine();
            }
            reader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return contadorPalabras;
    }

    public static double encontrarVocales(File fichero) throws IOException{
        double contadorVocales = 0;


        return contadorVocales;
    }
}
