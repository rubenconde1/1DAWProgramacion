package Tema6.FicherosConFormato;

import com.google.gson.Gson;
import Tema6.FicherosConFormato.Empleado;

public class JSONEnUnObjeto {
    public static void main(String[] args) {
        final String json = "{\"num\":46,\"nombre\":\"Miguel\", \"departamento\":10, \"edad\":20, \"sueldo\":1200.00}";
        final Gson gson = new Gson();
        final Empleado empleado = gson.fromJson(json, Empleado.class);
        empleado.display();
    }
}
