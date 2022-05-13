package Controles.Control04_XMLyJSON;

import java.io.Serializable;

public class Persona implements Serializable{
    protected String nif;
    protected String nombre;
    protected String apellidos;
    
    //Constructor
    public Persona(String nif, String nombre, String apellidos) {
        this.nif = nif;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    
    //Getters y Setters
    public String getNif() {
        return nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    
}
