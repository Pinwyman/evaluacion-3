package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {
    
    Connection conexion;
    
    public Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection("localhost:3306/persona?serverTimezone=UTC", "root", "root");
            return conexion;
        } catch (Exception ex) {
              ex.printStackTrace();
            throw new SQLException("Error al establecer la conexión: " + ex.getMessage());
        }
   
    }
}
