package Tema5;

import java.awt.Point;

public class Silla {
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

        String[] colores = {"Amarillo", "Azul", "Marrón", "Negro", "Verde"};
        int[] patas = {1, 2, 3, 4, 5};
        boolean[] respaldo = {true, false};
        int[] comodidad = {1, 2, 3, 4, 5, 6 ,7, 8, 9, 10};
        String[] materiales = {"Acero", "Aluminio", "Madera", "Plástico"};

        color = colores[(int)(Math.random()*(colores.length-1)+0)];
    }
}
