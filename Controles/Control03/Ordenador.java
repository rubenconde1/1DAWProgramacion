package Controles.Control03;

public class Ordenador {

    private String formato;
    private String color;
    private Teclado teclado;
    private Ordenador pcConectado = null;


    //getters//
    public String getFormato() {
        return formato;
    }

    public String getColor() {
        return color;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public Ordenador getPcConectado() {
        return pcConectado;
    }

    //setters//
    

    //constructores//
    public Ordenador() {
        formato = "No asignado";
        color = "No asignado";
        this.teclado = new Teclado();
    }

    public Ordenador(String formato, String color, Teclado teclado) {
        this.color = color;
        this.formato = formato;
        this.teclado = teclado;
    }

    public void conectar (Ordenador pcConectado) {
        if (pcConectado != null) {
            this.pcConectado = pcConectado;
        }
    }
}
