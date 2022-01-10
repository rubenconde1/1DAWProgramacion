package Tema4;

public class Parentesis {
    public static void main(String[] args) {
        String Cadena = Utilidades.leerCadena("Ingrese una cadena de texto:");
        
        if (esCorrecta(Cadena)) {
            System.out.println("La cadena está bien parentizada");
        } else {
            System.out.println("La cadena no está bien parentizada");
        }
    }

    public static boolean esCorrecta (String Cadena) {
        int comprobar = 0;

        for (char letra : Cadena.toCharArray()) {
            if (letra == '(') {
                comprobar++;
            } else if (letra == ')') {
                comprobar--;
            }
            if (comprobar == -1) {
                return false;
            }
        }
        return (comprobar == 0);
    }
}

