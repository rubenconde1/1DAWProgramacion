package Controles.Control04;

import java.util.ArrayList;

public class Cliente extends Persona{
    //Atributos clase Cliente
    private int id;
    private String email;
    private static ArrayList<Cliente> datosCliente = new ArrayList<>();

    //Constructor clase Cliente
    public Cliente(int id, String nif, String nombre, String apellidos, String email) {
        super(nif, nombre, apellidos);
        this.id = id;
        this.email = email;
        datosCliente.add(this);
    }

    //Getters y Setters
    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static ArrayList<Cliente> getDatosCliente() {
        return datosCliente;
    }

    //Métodos de la clase
    @Override
    public String toString() {
        return "Datos Cliente \n" + "ID: \t" + id +"\n" + "NIF: \t" + nif + "\n" + "Nombre: \t" + nombre + "\n" + "Apellidos: \t" + apellidos + "\n" + "Email: \t" + email + ".";
    }

    
}
