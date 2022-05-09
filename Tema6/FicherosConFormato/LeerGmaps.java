package Tema6.FicherosConFormato;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import com.google.gson.Gson;

public class LeerGmaps {
    public static void main(String[] args) throws IOException{
        final Gson gson = new Gson();
        final InputStream f = new FileInputStream("./Tema6/FicherosConFormato/gmaps.json");
        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(f));
        GeoResponse g = gson.fromJson(bufferedReader, GeoResponse.class);
        for (GeoResponse.Result r : g.results) {
            System.out.println(r.formatted_address);
        }
        bufferedReader.close();
    }
}
