package Controles.Control04_XMLyJSON;

public class Cliente extends Persona{
    private String id;
    private String email;
    
    //Constructor
    public Cliente(String nif, String nombre, String apellidos, String id, String email) {
        super(nif, nombre, apellidos);
        this.id = id;
        this.email = email;
    }

    
    //Getters y Setters
    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    
    //Métodos
    @Override
    public String toString() {
        return "id:\t" + id + 
            "nif:\t" + nif + 
            "nombre:\t" + nombre +
            "apellidos:\t" + apellidos + 
            "email:\t" + email;
    }

}
