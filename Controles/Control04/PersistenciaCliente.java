package Controles.Control04;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class PersistenciaCliente {
    File fichero = new File("./Controles/Control04/clientes.dat");
    private static ArrayList<Cliente> listadoClientes = Cliente.getDatosCliente();
    private static ArrayList<String> listadoLeidoClientes = new ArrayList<String>();
    
    //Método de la clase write
    public void writer(ArrayList<Cliente> datosCliente) throws IOException{
        try {
            PrintWriter writer = new PrintWriter(fichero);

        for (Cliente clienteAEscribir : listadoClientes) {
            //La función println me imprime cada elemento en diferente línea.
            writer.println(clienteAEscribir);
        }
        writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void reader(File fichero) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fichero));
        String lineaCliente = reader.readLine();
        
        while (lineaCliente != null) {
            listadoLeidoClientes.add(lineaCliente);
            lineaCliente = reader.readLine();
            System.out.println();
        }
        reader.close();
        System.out.println(listadoLeidoClientes);
    }
}
