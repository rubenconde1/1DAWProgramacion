package Controles.Control04;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) throws IOException{
        File fichero = new File("./Controles/Control04/clientes.dat");
        Cliente cliente01 = new Cliente(1, "12345678Z", "Ramón", "Cajal", "ramon@cajal.com");
        Cliente cliente02 = new Cliente(2, "12345678T", "Paula", "Mañez", "paula@manez.com");
        PersistenciaCliente persistente = new PersistenciaCliente();
        ArrayList<Cliente> listadoClientesImpreso = new ArrayList<Cliente>();
        
        listadoClientesImpreso.add(cliente01);
        listadoClientesImpreso.add(cliente02);
        persistente.writer(listadoClientesImpreso);
        persistente.reader(fichero);
        cliente01.toString();
        cliente02.toString();
    }
}
