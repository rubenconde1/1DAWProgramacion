package Controles.Control03;

public class Ordenador {

    private String formato;
    private String color;
    private Teclado teclado;


    //getters//
    public String getFormato() {
        return formato;
    }

    public String getColor() {
        return color;
    }

    //setters//
    

    //constructores//
    public Ordenador() {
        formato = "No asignado";
        color = "No asignado";
    }

    public Ordenador(String formato, String color) {
        this.color = color;
        this.formato = formato;
        teclado.imprimirTeclado();
    }
}
