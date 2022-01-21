package Tema5;

import java.awt.Point;

public class Silla {

    private static String[] colores = {"Amarillo", "Azul", "Marrón", "Negro", "Verde"};
    private static String[] materiales = {"Acero", "Aluminio", "Madera", "Plástico"};


    //Atributos de colores//
    private String color;
    private int numeroPatas;
    private boolean tieneRespaldo;
    private int nivelComodidad;
    private String material;
    private Point coordenadas;

    //Getters

    public int getNivelComodidad() {
        return nivelComodidad;
    }

    public String getColor() {
        return color;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public boolean isTieneRespaldo() {
        return tieneRespaldo;
    }

    public String getMaterial() {
        return material;
    }

    public Point getCoordenadas() {
        return coordenadas;
    }

    //Setters

    public void setNivelComodidad(int nuevoNivelComodidad) {
        nivelComodidad = nuevoNivelComodidad;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public void setTieneRespaldo(boolean tieneRespaldo) {
        this.tieneRespaldo = tieneRespaldo;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setCoordenadas(Point coordenadas) {
        this.coordenadas = coordenadas;
    }

    //----------------------------------------------------------//

    public static String colorAleatorio() {
        int min = 0;
        int max = colores.length - 1;

        int aleatorio = (int) (Math.random() * (max - min + 1) + min);

        return colores[aleatorio];
    }

    public static String materialAleatorio() {
        int min = 0;
        int max = materiales.length - 1;

        int aleatorio = (int) (Math.random() * (max - min + 1) + min);

        return materiales[aleatorio];
    }

    public static int numeroPatasAleatorio() {
        int min = 0;
        int max = 6;

        int aleatorio = (int) (Math.random() * (max - min + 1) + min);

        return aleatorio;
    }

    public static boolean tieneRespaldoAleatorio() {
        int min = 0;
        int max = 1;

        int aleatorio = (int) (Math.random() * (max - min + 1) + min);

        if (aleatorio == 0) {
            return false;
        } else {
            return true;
        }
    }

    public static Point coordenadasAleatorio() {
        Point punto = new Point();

        int min = 0;
        int max = 100;

        int x = (int) (Math.random() * (max - min + 1) + min);
        int y = (int) (Math.random() * (max - min + 1) + min);

        punto.setLocation(x, y);
        
        return punto;
    }

    public static int nivelComodidadAleatorio() {
        int min = 0;
        int max = 10;

        int aleatorio = (int) (Math.random() * (max - min + 1) + min);

        return aleatorio;
    }



    public Silla (String colorSilla, byte numeroPatasSilla, boolean tieneRespaldoSilla, byte nivelComodidadSilla, String materialSilla, Point localizacion) {
        color = colorSilla;
        numeroPatas = numeroPatasSilla;
        tieneRespaldo = tieneRespaldoSilla;
        nivelComodidad = nivelComodidadSilla;
        material = materialSilla;
        coordenadas = localizacion;
    }

    public Silla (String colorSilla, byte numeroPatasSilla, boolean tieneRespaldoSilla, byte nivelComodidadSilla, String materialSilla) {
        color = colorSilla;
        numeroPatas = numeroPatasSilla;
        tieneRespaldo = tieneRespaldoSilla;
        nivelComodidad = nivelComodidadSilla;
        material = materialSilla;
    }

    public Silla() {
        //Generador de Sillas aleatorias//

        this.color = Silla.colorAleatorio();
        this.material = Silla.materialAleatorio();
        this.numeroPatas = Silla.numeroPatasAleatorio();
        this.tieneRespaldo = Silla.tieneRespaldoAleatorio();
        this.nivelComodidad = Silla.nivelComodidadAleatorio();
        this.coordenadas = Silla.coordenadasAleatorio();
    }
}
