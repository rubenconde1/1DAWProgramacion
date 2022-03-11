package Tema5.cutreCloud;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

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
                imprimir = new PrintWriter("Tema5/cutreCloud/Usuarios/datosUsuario.txt");
                contador++;
            } else {
            imprimir = new PrintWriter("Tema5/cutreCloud/Usuarios/datosUsuario"+ contador +".txt");
            contador++;
            }
        } catch (Exception e) {
            System.out.println("No se ha podido crear el fichero: " + e.getMessage());
        }
        Objects.requireNonNull(imprimir).println(textoImprimir);
        imprimir.close();
    }

    //Crear método que recupere los datos del fichero XML.
    public static void loadXML(){
        File folder = new File("Tema5/cutreCloud/Usuarios");
        arrayUsuarios.clear();

        for (File xmlFile : folder.listFiles()) {
            arrayUsuarios.add(getLoadSingleXML(xmlFile));
        }
    }

    private static Usuario getLoadSingleXML(File xmlFile) {
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder;
        Document doc;
        Usuario newUser = null;

        try {
            dBuilder = dbFactory.newDocumentBuilder();
            doc = dBuilder.parse(xmlFile);
            String email = doc.getElementsByTagName("email").item(0).getTextContent();
            String password = doc.getElementsByTagName("password").item(0).getTextContent();
            newUser = new Usuario(email, password);
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) { 
            e.printStackTrace();
        }
        return newUser;
    }
}