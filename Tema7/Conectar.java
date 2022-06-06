package Tema7;

import java.sql.*;
import java.util.Scanner;

/**
 * Conectar con phpmyadmin
 */
public class Conectar {

    public static void main(String[] args) {
        String consulta = "SELECT * FROM cliente";
        String consulta2 = "INSERT INTO cliente (id, nif, nombre, apellidos, email) VALUES (?, ?, ?, ?, ?)";
        String consulta3 = "SELECT count(*) as total from cliente";
        String consulta4 = "UPDATE cliente set nombre='Josep', apellidos='Pedrerol Hurtado', email='josep@pedrerol.com' where id=?";
        String connectionUrl = "jdbc:mysql://192.168.204.140:3306/clientes";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e1) {
            e1.printStackTrace();
        }

        //Devolver total de clientes creados
        try (Connection conn = DriverManager.getConnection(connectionUrl, "phpmyadmin", "phpmyadmin");
        PreparedStatement ps = conn.prepareStatement(consulta3);
        ResultSet rs = ps.executeQuery()){

            while (rs.next()) {
                int total = rs.getInt("total");
                System.out.println("Total: " + total);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }

        //Devolver línea a línea el contenido
        try (Connection conn = DriverManager.getConnection(connectionUrl, "phpmyadmin", "phpmyadmin");
                PreparedStatement ps = conn.prepareStatement(consulta);
                ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                String[] cliente = new String[5];
                cliente[0] = rs.getString("id");
                cliente[1] = rs.getString("nif");
                cliente[2] = rs.getString("nombre");
                cliente[3] = rs.getString("apellidos");
                cliente[4] = rs.getString("email");
                System.out.println("Cliente: " + cliente[0].toString() + "\t" + cliente[1].toString() + "\t" + cliente[2].toString() + "\t" + cliente[3].toString() + "\t" + cliente[4].toString());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        //Insertar valores en la tabla cliente
        try (Connection conn = DriverManager.getConnection(connectionUrl, "phpmyadmin", "phpmyadmin");
            PreparedStatement ps = conn.prepareStatement(consulta2)){

            Scanner scanner = new Scanner(System.in);
            int id;
            String nif;
            String nombre;
            String apellidos;
            String email;
            int contador = 0;
            int opcion = 1;

            while (true) {
                if (opcion == 1) {
                    System.out.print("Inserta id:");
                    id = scanner.nextInt();
                    ps.setInt(1, id);
    
                    System.out.print("Inserta nif:");
                    nif = scanner.next();
                    ps.setString(2, nif);
    
                    System.out.print("Inserta nombre:");
                    nombre = scanner.next();
                    ps.setString(3, nombre);
    
                    System.out.print("Inserta apellidos:");
                    apellidos = scanner.next().concat(" ").concat(scanner.next());
                    ps.setString(4, apellidos);
    
                    System.out.print("Inserta email:");
                    email = scanner.next();
                    ps.setString(5, email);
    
                    ps.executeUpdate();
                    contador++;
                    System.out.println("Se ha creado " + contador + " clientes.");
                    System.out.println("¿Continuar?");
                    System.out.println("1 - Continuar.");
                    System.out.println("2 - Finalizar.");
                    opcion = scanner.nextInt();
                } else {
                    if (opcion == 2) {
                        System.out.println("Finalizado. Se han insertado " + contador + " clientes.");
                        scanner.close();
                        break;
                        }
                    }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        //Update
        try (Connection conn = DriverManager.getConnection(connectionUrl, "phpmyadmin", "phpmyadmin");
        PreparedStatement ps = conn.prepareStatement(consulta4)){

            ps.setInt(1, 15);
            ps.executeUpdate();
            System.out.println("Consulta UPDATE realizada.");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}