package Tema5.Formas;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Forma forma = new Forma("Azul", 4, 5, "forma1");
        Rectangulo rectangulo1 = new Rectangulo("Rojo", 2, 4, "rectangulo1", 5, 3);
        Elipse elipse1 = new Elipse("Negro", 5, 7, "elipse1", 4, 5);
        Cuadrado cuadrado1 = new Cuadrado("Verde", 3, 1, "cuadrado1", 4);
        Circulo circulo1 = new Circulo("Amarillo", 7, 7, "circulo1", 7);

        ArrayList<Forma> listado = new ArrayList<>();
        listado.add(forma);
        listado.add(rectangulo1);
        listado.add(elipse1);
        listado.add(cuadrado1);
        listado.add(circulo1);

        for (Forma formas : listado) {
            System.out.println(formas);
        }

        forma.imprimir();
        rectangulo1.imprimir();
        elipse1.imprimir();
        cuadrado1.imprimir();
        circulo1.imprimir();


    }
}
