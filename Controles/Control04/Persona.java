package Controles.Control04;

public class Persona{
    //Atributos clase Persona
    protected String nif;
    protected String nombre;
    protected String apellidos;

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
    
    //Constructor clase Persona
    public Persona(String nif, String nombre, String apellidos) {
        this.nif = nif;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
}
