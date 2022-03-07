package Tema5.cutreCloud;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class Usuario implements ParserXML {
    private int id;
    private String email;
    private String password;
    public static ArrayList<Usuario> arrayUsuarios = new ArrayList<>();
    private static int idGenerator = 1;
    private static int contador = 0;

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

    public static void eliminarUsuarioPorEmail (String email) {
        for (Usuario listado : arrayUsuarios) {
            if (listado.email.equals(email)) {
                arrayUsuarios.remove(listado);
                break;
            }
        }
    }

    public static void eliminarUsuariosDominio (String dominio) {
        Iterator<Usuario> it = arrayUsuarios.iterator();

        while (it.hasNext()) {
            Usuario user = it.next();

            if (user.email.endsWith(dominio)) {
                arrayUsuarios.remove(user);
            }
        }
    }

    public String generateXML(){

        String xml = "<usuario>\n";
        xml += "<id>" + id + "</id>\n";
        xml += "<password>" + password + "</password>\n";
        xml += "<email>" + email + "</email>\n";
        xml += "</usuario>\n";

        return xml;
    }

    public void writeXML() {
        PrintWriter imprimir = null;
        String textoImprimir = generateXML();

        try {
            if (contador == 0) {
                imprimir = new PrintWriter("datosUsuario.txt");
                contador++;
            } else {
            imprimir = new PrintWriter("datosUsuario"+ contador +".txt");
            contador++;
            }
        } catch (Exception e) {
            System.out.println("No se ha podido crear el fichero: " + e.getMessage());
        }
        Objects.requireNonNull(imprimir).println(textoImprimir);
        imprimir.close();
    }
}
