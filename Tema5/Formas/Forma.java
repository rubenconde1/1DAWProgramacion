package Tema5.Formas;

/**
 * Forma
 */

 import java.awt.Point;

public class Forma {

    private String color;
    private Point coordenada;
    private String nombre;

    public Forma(String color, int x, int y, String nombre) {
        this.color = color;
        this.coordenada = new Point(x,y);
        this.nombre = nombre;
    }

    //Getters y Setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Point getCoordenada() {
        return coordenada;
    }

    public void setCoordenada(Point coordenada) {
        this.coordenada = coordenada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //Métodos
    public void imprimir(){
        System.out.println("Color: " + color);
        System.out.printf("Centro: (%d, %d)\n", coordenada.x, coordenada.y);
        System.out.println("Nombre: " + nombre);
    }

    public void moverForma(int x, int y){
        this.coordenada = new Point(x, y);
    }

    public void crearFormas(){

    }
}