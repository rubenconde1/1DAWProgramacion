package Tema5.cutreCloud;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class Media implements ParserXML {
    private int id;
    private static int idGenerator = 1;
    private String nombre;
    private String contenido;
    private MediaType tipo;
    private Usuario usuario;
    public static ArrayList<Media> arrayMedia = new ArrayList<>();
    private static int contador = 0;

    //Constructor
    public Media(String nombre, String contenido, MediaType tipo, Usuario usuario) {
        if (this.nombreUnico(nombre)) {
            this.id = idGenerator++;
            this.nombre = nombre;
            arrayMedia.add(this);
        } else {
            this.id = -1;
            this.nombre = "Nombre duplicado: " + nombre;
        }
        this.contenido = contenido;
        this.tipo = tipo;
        this.usuario = usuario;
    }
    

    //Getters y Setters
    public int getIdMedia() {
        return id;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public MediaType getTipo() {
        return tipo;
    }

    public void setTipo(MediaType tipo) {
        this.tipo = tipo;
    }
    public Usuario getUsuario_id() {
        return usuario;
    }

    public static ArrayList<Media> getArrayUsuario_id() {
        return arrayMedia;
    }

    //Métodos
    private boolean nombreUnico (String nombre) {
        boolean esUnico = true;
        for (Media nombres : arrayMedia) {
            if (nombre.equals(nombres.getNombre())) {
                esUnico = false;
                break;
            }
        }
        return esUnico;
    }

    public static void eliminarPorNombre (String nombre) {
        int index = 0;
        for (Media listado : arrayMedia) {
            if (nombre.equals(listado.getNombre())) {
                index = listado.getIdMedia();
            }
        }
        arrayMedia.remove(index);
    }

    public static void eliminarTipoConcreto (MediaType tipo) {
        Iterator<Media> iterator = arrayMedia.iterator();

        while (iterator.hasNext()) {
            Media elemento = iterator.next();

            if (elemento.tipo.equals(tipo)) {
                iterator.remove();
            }
        }
    }

    public static void eliminarTodosUsuariosID (int id) {
        Iterator<Media> it = arrayMedia.iterator();

        while (it.hasNext()) {
            Media media = it.next();

            if (media.usuario.getId() == id) {
                it.remove();
            }
        }
    }

    public String generateXML(){

        String xml = "<media>\n";
        xml += "<id>" + id + "</id>\n";
        xml += "<nombre>" + nombre + "</nombre>\n";
        xml += "<contenido>" + contenido + "</contenido>\n";
        xml += "<tipo>" + tipo + "</tipo>\n";
        xml += usuario.generateXML();
        xml += "</media>\n";

        return xml;
    }


    public void writeXML() {
        PrintWriter contenido = null;
        String textoImprimir = generateXML();

        try {
            if (contador == 0) {
                contenido = new PrintWriter("Tema5/cutreCloud/Media/datosMedia.txt");
                contador++;
            } else {
                contenido = new PrintWriter("Tema5/cutreCloud/Media/datosMedia"+ contador +".txt");
            contador++;
            }
        } catch (Exception e) {
            System.out.println("No se ha podido crear el fichero: " + e.getMessage());
        }
        Objects.requireNonNull(contenido).println(textoImprimir);
        contenido.close();
    }

    //Asignar un campo Media cada vez que se crea un Usuario. 
    /*public void vincularIdUsuario(){
        
    }*/
}