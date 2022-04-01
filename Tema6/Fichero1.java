package Tema6;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Fichero1 {
    static File f = new File(".");
    //Listar la ruta.
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

    //Imprimir los archivos del directorio actual.
    public static void imprimirDirectorioActual() throws IOException{
        System.out.println("Directorio actual: " + f.getCanonicalPath()+"\n");
        System.out.println("Lista de ficheros y directorios del directorio: ");
        System.out.println("--------------------------------------------------\n");   

        //Listar ficheros
        File[] ficheros = f.listFiles();
        System.out.println("0.- Directorio Padre");

        for (int i = 0; i < ficheros.length; i++) {
            Arrays.sort(ficheros);
            System.out.println(i+1 + ".- " + ficheros[i].getName());
        }

        System.out.println("Introduce una opción (-1 para salir):\n"); 
    }
    
    public static void getParent() throws IOException {
            File ficheroActual = new File(f.getCanonicalPath());
            f = ficheroActual.getParentFile();
    } 

    public static void main(String[] args) throws IOException {
        int numero = 0;
        Scanner scanner = new Scanner(System.in);
        listRoots();
        
        do {
            imprimirDirectorioActual();
            numero = Integer.parseInt(scanner.nextLine());
            switch (numero) {
                case 0:
                    getParent();
                    break;

                case (!= 0):
            
                default:
                    break;
            }
            
        } while (numero != -1);
        System.out.println("El programa se ha cerrado.");
        scanner.close(); 
    }

}

// while (numero != -1) {
//     try {
//         System.out.println("Selecciona un número para continuar:");

//         numero = Integer.parseInt(scanner.nextLine());
//         switch (numero) {
//             case 0:
//                 //Ir al directorio padre.
//                 break;
//             case -1:
//                 System.out.println("Se ha cerrado el programa.");
//                 break;
        
//             default:
//                 break;
//         }
//     } catch (Exception e) {
//         System.out.println("Se ha producido un error.");
//     }
// }