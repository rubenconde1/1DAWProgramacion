package Controles.Control03;

public class Teclado {

    private String color;
    private int numeroTeclas;
    private String conectividad;
    private String idioma;
    private String formato;
    private static int contadorTeclados = 0;
    

    //getters//

    public String getColor() {
        return color;
    }


    public int getNumeroTeclas() {
        return numeroTeclas;
    }


    public String getConectividad() {
        return conectividad;
    }


    public String getIdioma() {
        return idioma;
    }

    
    public String getFormato() {
        return formato;
    }

    //constructores//
    public Teclado() {
        color = "No asignado";
        numeroTeclas = 0;
        conectividad = "No asignado";
        idioma = "No asignado";
        formato = "No asignado";

        nuevoTeclado();
    }

    public Teclado(String color, int numeroTeclas, String conectividad, String idioma, String formato) {
        this.color = color;
        this.numeroTeclas = numeroTeclas;
        this.conectividad = conectividad;
        this.formato = formato;

        nuevoTeclado();
    }
    
    
    static void nuevoTeclado() {
        contadorTeclados++;
    }

    public void imprimirContadorTeclados() {
        System.out.println(contadorTeclados);
    }

    public void imprimirTeclado() {
        System.out.println(getColor());
        System.out.println(getNumeroTeclas());
        System.out.println(getConectividad());
        System.out.println(getFormato());
    }


    //setters//

    public void setParametroIdioma(String language) {
        if (idioma.length() <= 2) {
            idioma = language;
        } else {System.out.println("El idioma supera los tres carácteres de entrada.");}
    }

}
