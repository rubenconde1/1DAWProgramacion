package Tema6.LeePrimos;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeerPrimos {
    public static void main(String[] args) throws IOException {
        FileInputStream fichero = new FileInputStream("./Tema6/EscribePrimos/primos.dat");
        InputStreamReader reader = new InputStreamReader(fichero);
        BufferedReader br = new BufferedReader(reader);
        
        while (br.ready()) {
            String linea = br.readLine();
            System.out.println(linea);
        }
        br.close();
    }
}
