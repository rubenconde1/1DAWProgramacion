package Tema6;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Fichero1 {
    
    public static File[] listRoots() {
        
        File raiz[] = File.listRoots();
        if (raiz != null) {
            System.out.print("Directorio raíz: ");
            for (int i = 0; i < raiz.length; i++) {
                System.out.println(raiz[i].getPath() + " " + "\n");
            }
        } else {
            System.out.println("No hay raíz.");
        }
        
        return raiz;
    }

    public static void imprimirDirectorioActual() throws IOException{
        ArrayList<String> ficheros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int numero = -2;

        File f = new File(".");
        System.out.println("Directorio actual: " + f.getCanonicalPath()+"\n");
        System.out.println("Lista de ficheros y directorios del directorio: ");
        System.out.println("--------------------------------------------------\n");

        for (String e : f.list()) {
            ficheros.add(e);
            Collections.sort(ficheros);
        }
        //Imprimir el array con un fori.
        for (int i = 0; i < array.length; i++) {
            
        }
        System.out.println(ficheros);

        while (numero != -1) {
            try {
                System.out.println("Selecciona un número para continuar. Pulse -1 para salir.");

                numero = Integer.parseInt(scanner.nextLine());
                switch (numero) {
                    case 0:
                        //Ir al directorio padre.
                        break;
                    case -1:
                        System.out.println("Se ha cerrado el programa.");
                        break;
                
                    default:
                        break;
                }
            } catch (Exception e) {
                System.out.println("Se ha producido un error.");
            }
            scanner.close();
        }
    }
    
    public static void main(String[] args) throws IOException {
        listRoots();
        imprimirDirectorioActual();
    }
}