package Tema1;

public class Ejercicio32 {
    public static void main(String[] args) {
    
        int[] n = new int[10];
        int i;
        
        System.out.println("Introduce 10 números");
    
        for (i = 0; i < 10; i++) {
          n[i] = Integer.parseInt(System.console().readLine());
        }
        
        System.out.println("\nLos números introducidos, al revés, son los siguientes:");
        for (i = 9; i >= 0; i--) {
          System.out.println(n[i]);
        
        }
    }
}
