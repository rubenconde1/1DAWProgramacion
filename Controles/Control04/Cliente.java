package Controles.Control04;

public class Cliente extends Persona{
    //Atributos clase Cliente
    private int id;
    private String email;

    //Constructor clase Cliente
    public Cliente(int id, String nif, String nombre, String apellidos, String email) {
        super(nif, nombre, apellidos);
        this.id = id;
        this.email = email;
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

    //Métodos de la clase
    @Override
    public String toString() {
        return "Datos Cliente \n" + "ID: \t" + id +"\n" + "NIF: \t" + nif + "\n" + "Nombre: \t" + nombre + "\n" + "Apellidos: \t" + apellidos + "\n" + "Email: \t" + email;
    }

    
}
