package Tema5.cutreCloud;

import java.util.ArrayList;

public class Media {
    private int id;
    private static int idGenerator = 1;
    private String nombre;
    private String contenido;
    private MediaType tipo;
    private Usuario usuario_id;
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
        this.usuario_id = getUsuario_id();
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
        return usuario_id;
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

    public void eliminarPorNombre (String nombre) {
        int index = 0;
        for (Media listado : arrayMedia) {
            if (nombre.equals(listado.getNombre())) {
                index = listado.getIdMedia();
            }
        }
        arrayMedia.remove(index);
    }

    public void eliminarTipoConcreto (MediaType tipo) {
        int index = 0;
        for (Media listado : arrayMedia) {
            if (tipo.equals(listado.getTipo())) {
                index = arrayMedia.indexOf(this);
            }
        }
        arrayMedia.remove(index);
    }

    //Asignar un campo Media cada vez que se crea un Usuario. 
    /*public void vincularIdUsuario(){
        
    }*/
}
