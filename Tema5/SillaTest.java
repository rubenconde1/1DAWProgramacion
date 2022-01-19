package Tema5;

import java.awt.Point;

public class SillaTest {
    public static void main(String[] args) {

        Silla silla1 = new Silla("azul", 4, true, 10, "acero");
        Silla silla2 = new Silla("verde", 3, false, 6, "plástico");
        Silla silla3 = new Silla("naranja", 6, true, 10, "madera");
        silla3.setCoordenadas(new Point(0,1));

        
    }
}
