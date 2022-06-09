package Tema6.EliminarComentarios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EliminarComentariosV1 {
    public static void main(String[] args) {
             
         try {
           BufferedReader lector = new BufferedReader(new FileReader("ProgramaComentarios.java"));
           BufferedWriter escritor = new BufferedWriter(new FileWriter("SinComentarios.java"));
     
           String lineaOrigen = "";
           String lineaDestino = "";
           boolean comentarioDeBloque = false;
           int i = 0;
           
           while ((lineaOrigen = lector.readLine()) != null) {
             
             int longitud = lineaOrigen.length();
     
             if(!comentarioDeBloque)
                 lineaDestino = lineaOrigen;
             else
                 lineaDestino = "";
     
             // Detecta inicio de comentario de bloque 
             if ((i = lineaOrigen.indexOf("/*")) != -1) {
               comentarioDeBloque = true;
               lineaDestino = lineaOrigen.substring(0, i);
               lineaOrigen = lineaOrigen.substring(i+2,longitud);
             }
             
             // Detecta fin de comentario de bloque 
             if (((i = lineaOrigen.indexOf("*/")) != -1) && comentarioDeBloque){
               comentarioDeBloque = false;
               lineaDestino += lineaOrigen.substring(i + 2, longitud);
             }
             // Detecta comentario de línea
             if (((i = lineaOrigen.indexOf("//")) != -1) && !comentarioDeBloque) {
               lineaDestino = lineaOrigen.substring(0, i);
             }
     
             escritor.write(lineaDestino + "\n");
           }
           
           lector.close();
           escritor.close();
     
         } catch (IOException ioe) {
           System.err.println(ioe.getMessage());
         }
       }
}
