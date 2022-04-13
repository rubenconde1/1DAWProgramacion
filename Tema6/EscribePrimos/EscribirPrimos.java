package Tema6.EscribePrimos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirPrimos {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("./Tema6/EscribePrimos/primos.dat"));

        for (int i = 1; i <= 500; i++) {
            if (esPrimo(i)) {
                bw.write(String.valueOf(i) + "\n");
            }
        }
        bw.close();
    }

    public static boolean esPrimo(int x){
        for (int i = 2; i < x; i++) {
        if ((x%i) == 0) {
            return false;
            }
        }
        return true;
    }
}
