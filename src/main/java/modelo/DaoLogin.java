package modelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import DB.conexion;


public class DaoLogin {

 public static int validar(String user, String pass) {
     Connection conexion;
     conexion con = new conexion();

     PreparedStatement prepared;
     ResultSet resultset;
     String useres = "";
     int numero = 0;
     String consulta = "SELECT * FROM persona WHERE user = ? AND pass = ?"; 
     try {

         conexion = con.getConnection();
         prepared = conexion.prepareStatement(consulta);
         prepared.setString(1, user);
         prepared.setString(2, pass);
         resultset = prepared.executeQuery();
         while (resultset.next()) {
             user = resultset.getString("user"); 
         }
         if (user.equals("admin")) {
        	 numero = 1;
         } else {
        	 numero = 0;
         }
     } catch (Exception ex) {
         ex.printStackTrace();
         return numero;
     }
     return numero;
 }
}
