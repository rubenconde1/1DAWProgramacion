package Tema6.ContarPalabra;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CuentaPalabras {
    public static void main(String[] args) throws IOException {
        //Creamos un fichero que almacene el contenido
        File fichero = new File("./Tema6/ContarPalabra/palabras.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(fichero));
        String cadena ="";
        Scanner lector = new Scanner(System.in);

        System.out.println("Introduce un texto: ");
        cadena = lector.nextLine();
        
        bw.write(cadena);
        bw.close();

        //Contamos las palabras que se repiten
        String palabra = "";

        System.out.println("Introduce una palabra para contar: ");
        palabra = lector.next();
        

        int contador = 0;

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.substring(i).startsWith(palabra)) {
                contador++;
            }    
        }
        lector.close();
        System.out.println("La palabra " + palabra + " se repite " + contador + " veces.");
    }
}
