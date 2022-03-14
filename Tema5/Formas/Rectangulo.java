package Tema5.Formas;

public class Rectangulo extends Forma{
    private double ladoMenor;
    private double ladoMayor;

    public Rectangulo(String color, int x, int y, String nombre, double ladoMayor, double ladoMenor){
        super(color, x, y, nombre);
        this.ladoMenor = ladoMenor;
        this.ladoMayor = ladoMayor;
    }

    public void imprimir(){
        super.imprimir();
        System.out.println("Lado: " + ladoMayor);
        System.out.println("Lado: " + ladoMenor);
    }

    public double calcularArea(){
        double area;
        area = ladoMayor * ladoMenor;
        System.out.println("El área es: " + area);
        return area;
    }

    public void calcularPerimetro(){
        double perimetro;
        perimetro = (2 * ladoMenor) + (2 * ladoMayor);
        System.out.println("El perímetro es: " + perimetro);
    }

    public void cambiarTamaño(int factor){
        double nuevaForma;
        double areaRectangulo = calcularArea();
        nuevaForma = factor * areaRectangulo;
        System.out.println("El tamaño se ha modificado en: " + factor);
        System.out.println("El área ahora es: " + nuevaForma);
    }
}
