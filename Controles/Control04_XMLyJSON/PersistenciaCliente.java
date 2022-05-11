package Controles.Control04_XMLyJSON;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class PersistenciaCliente {
    private static final String direccionFichero= "./Controles/Control04_XMLyJSON/clientes.dat";

    public void write(ArrayList<Cliente> clientes){
        try {
            FileWriter writer = new FileWriter(direccionFichero);
            BufferedWriter buffWriter = new BufferedWriter(writer);

            for (Cliente cliente : clientes) {
                String linea = cliente.getId() + ", " +
                cliente.getNif() + ", " +
                cliente.getNombre() + ", " +
                cliente.getApellidos() + ", " +
                cliente.getEmail() + "\n";

                buffWriter.write(linea);
            }
            buffWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Cliente> read() throws IOException{
        ArrayList<Cliente> listado = new ArrayList<Cliente>();

        FileReader reader = new FileReader(direccionFichero);
        BufferedReader buffReader = new BufferedReader(reader);

        try {
            String linea;

            while ((linea = buffReader.readLine()) != null) {
                String[] trozos = linea.split(",");
                Cliente cliente = new Cliente(trozos[0], trozos[1], trozos[2], trozos[3], trozos[4]);
                listado.add(cliente);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listado;
    }

    public void writeXML(ArrayList<Cliente> clientes) throws IOException{
        String direccionObjeto = "./Controles/Control04_XMLyJSON/Cliente.obj";
        ObjectOutputStream f = new ObjectOutputStream(new FileOutputStream(direccionObjeto));
        
        Cliente e;
        for (Cliente listadoClientes : clientes) {
            e = new Cliente(listadoClientes.getNif(), listadoClientes.getNombre(), listadoClientes.getApellidos(), listadoClientes.getId(), listadoClientes.getEmail());
        }
        f.close();
    }

    //---------------------------------------------------------------
    public void leerOBJ() throws IOException{
        ObjectInputStream f = new ObjectInputStream(new FileInputStream("./Controles/Control04_XMLyJSON/Cliente.obj"));

        Cliente prueba;
        try {
            while (true) {
                prueba = (Cliente) f.readObject();
                System.out.println("Nif: " + prueba.getNif() + "Nombre: " + prueba.getNombre() + "Apellidos: " + prueba.getApellidos() + "Email: " + prueba.getEmail());
            }
        } catch (EOFException) {
            f.close();
        }
    }
}
