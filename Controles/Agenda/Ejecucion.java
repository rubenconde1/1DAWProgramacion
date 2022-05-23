package Controles.Agenda;

import java.io.IOException;
import java.io.Serializable;

public class Ejecucion implements Serializable{
    public static void main(String[] args) throws IOException{
        Agenda agenda = new Agenda();

        agenda.pedirUsuarios();
    }
}
