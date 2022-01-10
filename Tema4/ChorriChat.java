package Tema4;

import java.util.Scanner;

public class ChorriChat {
    public static void main(String[] args) {
        /*String[] saludo = {"hola", "buenos dias", "buenas"};
        String[] bucle = {"Mm, es un tema interesante", "No he entendido lo que dices", "No hablo tu idioma"};
        String[] despedida = {"Chao", "ta luego", "adios", "bye"};*/
        Scanner teclado = new Scanner(System.in);
        String usuario = "";

        do{
            usuario = teclado.nextLine();
            System.out.println(esSaludo(usuario));
        }
        while (!(usuario.contains("hola") || usuario.contains("buenos dias") || usuario.contains("buenas")));
        teclado.close();
    }
        
    public static String esSaludo(String saludoUsuario) {
        String saludoChorri = "";

        if (saludoUsuario.contains("hola") || saludoUsuario.contains("buenos dias") || saludoUsuario.contains("buenas")) {
            saludoChorri = "Hola, soy Chorri, tu asistente";
        } else {
            saludoChorri = "Eres un maleducado";
        }
        return saludoChorri;
    }
        
}