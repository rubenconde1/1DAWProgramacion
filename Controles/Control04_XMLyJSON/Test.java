package Controles.Control04_XMLyJSON;

import java.io.IOException;
import java.util.ArrayList;

public class Test{
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        ArrayList <Cliente> clientes = new ArrayList<>();

        Cliente cliente1 = new Cliente("10000000x", "Ramón", "Suarez", "1", "ramon@suarez.com");
        Cliente cliente2 = new Cliente("20000000y", "Laura", "Alcántara", "2", "laura@alcantara.com");
        Cliente cliente3 = new Cliente("30000000z", "Pedro", "Piedra", "3", "pedro@piedra.com");

        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);

        PersistenciaCliente persistente = new PersistenciaCliente();

        persistente.write(clientes);
        clientes = persistente.read();

        // persistente.writeXML(clientes);
        // persistente.leerOBJ();

        persistente.crearObjetoCliente(clientes);
        persistente.leerObjetoCliente();
    }
}
