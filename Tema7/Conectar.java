package Tema7;

import java.sql.*;

/**
 * Conectar con phpmyadmin
 */
public class Conectar {

    public static void main(String[] args) {
        String consulta = "SELECT * FROM cliente";
        String connectionUrl = "jdbc:mysql://192.168.204.129:3306/clientes";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

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
    }
}