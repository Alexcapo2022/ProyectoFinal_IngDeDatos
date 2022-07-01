
package control;
import Modelo.*;
import java.sql.Connection;
import Datos.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
public class GestorUsuario {
    protected Usuario[] ClaseUsuario;
    protected static final int MAX = 300;
    protected int n;
    
    public GestorUsuario() {
        ClaseUsuario = new Usuario[MAX];
        this.n = 0;
    }
    public int longitud() {
        return n;
    }
    public Usuario iesimo(int pos) {
        if (pos >= 0 && pos < n) {
            return ClaseUsuario[pos];
        }
        return null;
    }
    public ArrayList<Usuario> ListUsuarios(){
        ArrayList<Usuario> Usuario = new ArrayList();
        try{
            Connection conn = JdbcUtil.getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM USUARIO");
            while(rs.next()){
                int DNI = rs.getInt("DNI_USUARIO");
                String nombre = rs.getString("NOMBRE");
                int TELEFONO = rs.getInt("TELEFONO");
                String CORREO = rs.getString("CORREO");
                String SEGMENTO_SOCIAL = rs.getString("SEGMENTO_SOCIAL");//
                String CODIGO_CLIENTE = rs.getString("CODIGO_CLIENTE");
                Usuario user = new Usuario(DNI,nombre, TELEFONO, CORREO,SEGMENTO_SOCIAL,CODIGO_CLIENTE);
                Usuario.add(user);
                }
        }
            catch(SQLException ex){
                        System.out.println(ex.getMessage());
                        System.out.println("ERROR EN LISTADO");
                    }
        return Usuario;
    }
    
    public static void registrarUsuario(Usuario usuario) throws Exception{
        Connection conn = JdbcUtil.getConnection();
        String sql = "INSERT INTO USUARIO VALUES(?,?,?,?,?,?)";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1,usuario.getDNI());
        pst.setString(2, usuario.getNombre());
        pst.setInt(3, usuario.getTelefono());
        pst.setString(4, usuario.getCorreo());
        pst.setString(5, usuario.getSegmento_social());
        pst.setString(6, usuario.getCodigo_cliente());
        pst.executeUpdate();
        pst.close();
        conn.close();
    }
    
    public static void eliminarUsuario(int DNI) throws Exception{
        Connection conn = JdbcUtil.getConnection();
        String sql = "DELETE FROM USUARIO WHERE DNI_USUARIO = ?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1, DNI);
        pst.executeUpdate();
        pst.close();        
        conn.close();
    }
    public static void actualizarCorreo(String correo, int dni) throws Exception{
        //Obtener el objeto conexion
        Connection conn = JdbcUtil.getConnection();
        //Definir la sentencia (como cadena)
        String sql = "UPDATE USUARIO SET CORREO = ? WHERE DNI_USUARIO = ?";
        //Crear objeto Statement (PreparedStatement -> con parametros)
        PreparedStatement pst = conn.prepareStatement(sql);
        //Asignar valores a los parametros (indices a partir de 1)
        //Asignar el primer parametro (numerico con decimales)
        pst.setString(1, correo);
        //Asignar el segundo parametro(entero)
        pst.setInt(2, dni);
        //Ejecutar la consulta
        pst.executeUpdate();
        //Liberar recursos
        pst.close();        
        conn.close();
    }          
}
