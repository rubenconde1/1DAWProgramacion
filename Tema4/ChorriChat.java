package Tema4;

import java.util.Scanner;

public class ChorriChat {
    public static void main(String[] args) {
        /*String[] saludo = {"hola", "buenos dias", "buenas"};
        String[] bucle = {"Mm, es un tema interesante", "No he entendido lo que dices", "No hablo tu idioma"};
        String[] despedida = {"Chao", "ta luego", "adios", "bye"};*/
        Scanner inputValue = new Scanner(System.in);
        String usuario = "";
        do{
            usuario = inputValue.nextLine();
            System.out.println(esSaludo(usuario));
        }
        while ((usuario == "hola") || (usuario == "buenos dias") || (usuario == "buenas"));
    }
        
    public static String esSaludo(String usuario) {
        String saludoChorri = "";

        if (usuario.equals("hola") || usuario.equals("buenos dias") || usuario.equals("buenas")) {
            saludoChorri = "Hola, soy Chorri, tu asistente";
        } else {
            saludoChorri = "Eres un maleducado";
        }
        return saludoChorri;
    }
        
}