package Tema5.cutreCloud;

import java.util.ArrayList;

public class Usuario implements Interfaz {
    private int id;
    private String email;
    private String password;
    public static ArrayList<Usuario> arrayUsuarios = new ArrayList<>();
    private static int idGenerator = 1;

    //Constructor
    public Usuario(String email, String password) {
        this.id = idGenerator++;

        if(this.emailUnico(email)) {
            this.email = email;
            arrayUsuarios.add(this);
        } else {
            this.email = "Correo duplicado: " + email;
            arrayUsuarios.add(this);
        }
        this.password = password;
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
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    //Métodos
    private boolean emailUnico(String email){
        boolean esUnico = true;

        for (Usuario usuario : arrayUsuarios) {
            if(email.equals(usuario.getEmail())) {
                esUnico = false;
                break;
            }
        }
        return esUnico;
    }

    public void eliminarUsuarioPorEmail (String email) {
        int index;
        for (Usuario listado : arrayUsuarios) {
            if (email.equals(listado.getEmail())) {
                index = arrayUsuarios.indexOf(this);
                arrayUsuarios.remove(index);
                break;
            }
        }
    }

    public void eliminarUsuariosDominio (String dominio) {
        String email = "";
        int index;
        for (Usuario listado : arrayUsuarios) {
            email = listado.getEmail();
            if (email.contains(dominio)) {
                index = arrayUsuarios.indexOf(this);
                arrayUsuarios.remove(index);
                break;
            }
        }
    }

    public void parserXML(){

        System.out.println("<usuario>");   
        for (Usuario listado : arrayUsuarios) {
            
            System.out.println("<id>" + listado.getId() + "</id>");
            System.out.println("<email>" + listado.getEmail() + "</email>");
            System.out.println("<password>" + listado.getPassword() + "</password");
        }
            System.out.println("</usuario>");
    }
}
