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
import java.io.Serializable;
import java.util.ArrayList;

public class PersistenciaCliente implements Serializable {
    private static final String direccionFichero = "./Controles/Control04_XMLyJSON/clientes.dat";
    private static final String direccionFicheroSalida = "./Controles/Control04_XMLyJSON/clientes.obj";

    public void write(ArrayList<Cliente> clientes) {
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

    public ArrayList<Cliente> read() throws IOException {
        ArrayList<Cliente> listado = new ArrayList<Cliente>();

        FileReader reader = new FileReader(direccionFichero);
        BufferedReader buffReader = new BufferedReader(reader);

        try {
            String linea;

            while ((linea = buffReader.readLine()) != null) {
                String[] trozos = linea.split(",");
                Cliente cliente = new Cliente(trozos[1], trozos[2], trozos[3], trozos[0], trozos[4]);
                listado.add(cliente);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listado;
    }

    //Crear fichero cliente.obj y leerlo
    public void crearObjetoCliente(ArrayList<Cliente> clientes) throws IOException {
        ObjectOutputStream f = new ObjectOutputStream(new FileOutputStream(direccionFicheroSalida));

        for (Cliente copiaClientes : clientes) {
            Cliente e = new Cliente(copiaClientes.getNif(), copiaClientes.getNombre(), copiaClientes.getApellidos(), copiaClientes.getId(), copiaClientes.getEmail());
            f.writeObject(e);
        }
        f.close();
    }

    public void leerObjetoCliente() throws FileNotFoundException, IOException, ClassNotFoundException{
        ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(direccionFicheroSalida));

        try {
            Cliente e;
           while (true) {
               e = (Cliente) entrada.readObject();
               System.out.println("ID: " + e.getId());
               System.out.println("NIF: " + e.getNif());
               System.out.println("Nombre: " + e.getNombre());
               System.out.println("Apellidos: " + e.getApellidos());
               System.out.println("Email: " + e.getEmail());
               System.out.println();
           } 
        } catch (EOFException eof) {
            entrada.close();
        }
    }

    public void escribirXML(ArrayList<Cliente> clientes) {

    }
}