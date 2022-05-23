package Controles.Agenda;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Agenda implements Serializable{
    ArrayList<Usuario> listado = new ArrayList<>();

    public void pedirUsuarios() throws IOException {
        Scanner lector = new Scanner(System.in);

        System.out.println("Creación de usuario...");
        System.out.println("Introduce nombre del usuario:");
        String nombre = lector.next();
        System.out.println("Introduce apellidos del usuario:");
        String apellidos = lector.next();
        System.out.println("Introduce email del usuario:");
        String email = lector.next();
        System.out.println("Introduce teléfono del usuario:");
        int telefono = lector.nextInt();
        Usuario user = new Usuario(nombre, apellidos, email, telefono);
        listado.add(user);

        lector.close();
        imprimirListadoTexto();

    }

    public void imprimirListadoTexto() throws FileNotFoundException, IOException {
        String dirFichero = "./Controles/Agenda/agenda.dat";
        try {
            File agenda = new File(dirFichero);
            FileWriter writer = new FileWriter(agenda.getAbsoluteFile(), true);
            for (Usuario usuarios : listado) {
                String usuario = usuarios.getNombre() + "\t" + usuarios.getApellidos() +
                        "\t" + usuarios.getEmail() + "\t\t" + usuarios.getTelefono() + "\n";
                writer.write(usuario);
            }
            writer.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        imprimirListadoObjetos();
    }

    public void imprimirListadoObjetos() throws FileNotFoundException, IOException {
        String dirFicheroObjetos = "./Controles/Agenda/agendaObjetos.dat";
        ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(dirFicheroObjetos, true));

        for (Usuario usuarios : listado) {
            Usuario user = new Usuario(usuarios.getNombre(), usuarios.getApellidos(), usuarios.getEmail(), usuarios.getTelefono());
            salida.writeObject(user);
        }
        salida.close();
    }
}
