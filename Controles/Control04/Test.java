package Controles.Control04;

import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException{
        File fichero = new File("./Controles/Control04/clientes.dat");
        Cliente cliente01 = new Cliente(1, "12345678Z", "Ramón", "Cajal", "ramon@cajal.com");
        Cliente cliente02 = new Cliente(2, "12345678T", "Paula", "Mañez", "paula@manez.com");
        PersistenciaCliente persistente = new PersistenciaCliente();

        persistente.writer(cliente01);
        persistente.reader(fichero);
        cliente01.toString();
    }
}
