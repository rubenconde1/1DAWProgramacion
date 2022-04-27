package Tema6.EstadisticaTexto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EstadisticaTexto {
    int contadorPalabras;
    int contadorLineas;
    int contadorLetras;
    double porcentajeVocales;
    double porcentajeConsonantes;
    double porcentajeEspacios;
    double porcentajeTabuladores;
    List linias = new ArrayList<>();
    
    public static void main(String[] args) throws IOException{
        File fichero = new File("./Tema6/EstadisticaTexto/Texto.txt");
        
    }
    
    public double encontrarVocales(File fichero) throws IOException{
        int contadorVocales = 0;
        String linia = "";
        char[] vocales = {'a','e','i','o','u','A','E','I','O','U'};
        char[] vocalesLinea = linia.toCharArray();
        BufferedReader reader = new BufferedReader(new FileReader(fichero));

        try {
            if (reader != null) {
                while ((linia = reader.readLine()) != null) {
                    linias.add(linia);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        for (int i = 0; i < vocalesLinea.length; i++) {
            for (int j = 0; j < vocales.length; j++) {
                if (vocalesLinea[i] == vocales[j]) {
                    contadorVocales++;
                }
            }
        }

        return contadorVocales;
    }
}
