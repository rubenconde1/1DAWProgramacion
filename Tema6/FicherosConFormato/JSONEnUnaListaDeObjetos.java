package Tema6.FicherosConFormato;

import java.lang.reflect.Type;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class JSONEnUnaListaDeObjetos {
    public static void main(String[] args) {
        final String empleado1JSON = "{\"num\":1, \"nombre\":\"Andreu\",\"departamento\":10, \"edad\":32, \"sueldo\":1000.0}";
        final String empleado2JSON = "{\"num\":2, \"nombre\":\"Bernat\",\"departamento\":20, \"edad\":28, \"sueldo\":1200.0}";
        final String empleadosJSON = "[" + empleado1JSON + "," + empleado2JSON + "]";
        final Gson gson = new Gson();
        final Type tipoListaEmpleados = new TypeToken<List<Empleado>>(){}.getType();
        final List<Empleado> empleados = gson.fromJson(empleadosJSON, tipoListaEmpleados);

        for (Empleado emp : empleados) {
            emp.display();
        }
    }
}
