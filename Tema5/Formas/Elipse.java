package Tema5.Formas;

public class Elipse extends Forma {
    private double radioMayor;
    private double radioMenor;

    public Elipse(String color, int x, int y, String nombre, double radioMayor, double radioMenor){
        super(color, x, y, nombre);
        this.radioMayor = radioMayor;
        this.radioMenor = radioMenor;
    }
    
    public void imprimir(){
        super.imprimir();
        System.out.println("Radio: " + radioMayor);
        System.out.println("Radio: " + radioMenor);
    }

    public double calcularArea(){
        return Math.PI * (radioMayor * radioMenor);
    }
}
