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
        System.out.println(fichero.getName());
        System.out.println("Número de palabras: " + encontrarPalabras(fichero));
        System.out.println("Número de líneas: " + encontrarLineas(fichero));
        System.out.println("Número de carácteres: " + encontrarLetras(fichero));
        System.out.println("Porcentaje de vocales: " + encontrarVocales(fichero));
    }
    
    public static int encontrarPalabras(File fichero) throws IOException{
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fichero));
            String linea = reader.readLine();

            while (linea != null) {
                String[] palabras = linea.split(" ");
                contadorPalabras += palabras.length;
                linea = reader.readLine();
            }
            reader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return contadorPalabras;
    }

    public static int encontrarLineas(File fichero) throws IOException {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fichero));
            contadorLineas = (int)reader.lines().count();
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return contadorLineas;
    }

    public static int encontrarLetras(File fichero) throws IOException {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fichero));
            String linea = reader.readLine();

            while (linea != null) {
                contadorLetras += linea.length();
                linea = reader.readLine();
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return contadorLetras;
    }

    public static double encontrarVocales(File fichero) throws IOException{
        int contadorVocales = 0;
        
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fichero));
            String linea = reader.readLine();
            
            while (linea != null) {
                for (int i = 0; i < linea.length(); i++) {
                    if (i == 'a') {
                        contadorVocales++;
                    }
                }
                linea = reader.readLine();
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        porcentajeVocales = (contadorVocales / contadorLetras);
        return  porcentajeVocales;
    }
}
