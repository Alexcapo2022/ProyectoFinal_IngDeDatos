
package Datos;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtil {
    //Para conexiones locales el URL no deberia cambiar.
    //Observen que el ultimo nombre que utilizan es el SID que configuran en SQL Developer
    //(podria ser tambien xe para una instalacion local)
    
    public static String url = "jdbc:oracle:thin:@localhost:1521:xe"; 
    //Nombre de usuario para la conexion
    public static String user = "system";
    //Contrasenia para conectarse
    public static String password = "oracle";
    
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(url, user, password);
    }
}
