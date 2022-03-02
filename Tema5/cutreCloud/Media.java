package Tema5.cutreCloud;

import java.util.ArrayList;
import java.util.Iterator;

public class Media implements ParserXML {
    private int id;
    private static int idGenerator = 1;
    private String nombre;
    private String contenido;
    private MediaType tipo;
    private Usuario usuario;
    public static ArrayList<Media> arrayMedia = new ArrayList<>();

    //Constructor
    public Media(String nombre, String contenido, MediaType tipo, Usuario usuario_id) {
        this.id = idGenerator++;
        if (this.nombreUnico(nombre)) {
            this.nombre = nombre;
            arrayMedia.add(this);
        } else {
            this.nombre = "Nombre duplicado: " + nombre;
        }
        this.contenido = contenido;
        this.tipo = tipo;
        this.usuario = getUsuario_id();
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
    //     System.out.println("<media>");
    //     for (Media listado : arrayMedia) {
    //         System.out.println("<id>" + listado.getIdMedia() + "</id>");
    //         System.err.println("<nombre>" + listado.getNombre() + "</nombre>");
    //         System.out.println("<contenido>" + listado.getContenido() + "</contenido>");
    //         System.out.println("<tipo>" + listado.getTipo() + "</tipo>");
    //         System.out.println("<usuario_id>" + listado.getUsuario_id() + "</usuario_id>");
    //     }
    //     System.out.println("</media>");
    // }

    //Asignar un campo Media cada vez que se crea un Usuario. 
    /*public void vincularIdUsuario(){
        
    }*/
}