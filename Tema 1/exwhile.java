public class exwhile {
    public static void main(String[] args) {
        int i;

        for (i = 0; i < 10; i++) {
            System.out.println("Hola: " + i);
        }

        int j = 0;

        while (i < 10) {
            System.out.println("Hola: " + j);
            j++;    
        }
        
        i = 0;
        do {
            System.out.println("Hola: " + 1);
            i++;
        }
            while (i < 10);
                
        }
 }

