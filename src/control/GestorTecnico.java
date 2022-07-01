/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import Modelo.Usuario;
import Modelo.*;
import java.sql.Connection;
import Datos.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Alexander Cruz
 */
public class GestorTecnico {
    protected Tecnico [] ClaseTecnico;
    protected static final int MAX = 300;
    protected int n;
    
    public GestorTecnico() {
        ClaseTecnico = new Tecnico[MAX];
        this.n = 0;
    }
    public int longitud() {
        return n;
    }
    public Tecnico iesimo(int pos) {
        if (pos >= 0 && pos < n) {
            return ClaseTecnico[pos];
        }
        return null;
    }
    public ArrayList<Tecnico> ListTecnicos(){
        ArrayList<Tecnico> Tecnico = new ArrayList();
        try{
            Connection conn = JdbcUtil.getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM TECNICO");
            while(rs.next()){
                int DNI = rs.getInt("DNI_TECNICO");
                String nombre = rs.getString("NOMBRE");
                int CELULAR = rs.getInt("CELULAR");
                String COMPANIA = rs.getString("COMPAÑIA");
                String ESPECIALIZACION = rs.getString("ESPECIALIZACION");//
                Tecnico user = new Tecnico(DNI,nombre, CELULAR, COMPANIA,ESPECIALIZACION);
                Tecnico.add(user);
                }
        }
            catch(SQLException ex){
                        System.out.println(ex.getMessage());
                        System.out.println("ERROR EN LISTADO");
                    }
        return Tecnico;
    }
    public static void registrarTecnico(Tecnico tecnico) throws Exception{
        Connection conn = JdbcUtil.getConnection();
        String sql = "INSERT INTO TECNICO VALUES(?,?,?,?,?)";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1,tecnico.getDNI_TECNICO());
        pst.setString(2, tecnico.getNombreTecnico());
        pst.setInt(3, tecnico.getCelTecnico());
        pst.setString(4, tecnico.getCompañia());
        pst.setString(5, tecnico.getEspecialización());
        pst.executeUpdate();
        pst.close();
        conn.close();
    }
    public static void eliminarUsuario(int DNI) throws Exception{
        Connection conn = JdbcUtil.getConnection();
        String sql = "DELETE FROM TECNICO WHERE DNI_TECNICO = ?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1, DNI);
        pst.executeUpdate();
        pst.close();        
        conn.close();
    }
    public static void actualizarDatos(String compania,int cel,String especializacion, int dni) throws Exception{
        //Obtener el objeto conexion
        Connection conn = JdbcUtil.getConnection();
        //Definir la sentencia (como cadena)
        String sql = "UPDATE TECNICO SET COMPAÑIA = ?,CELULAR = ? ,ESPECIALIZACION = ? WHERE DNI_TECNICO = ?";
        //Crear objeto Statement (PreparedStatement -> con parametros)
        PreparedStatement pst = conn.prepareStatement(sql);
        //Asignar valores a los parametros (indices a partir de 1)
        //Asignar el primer parametro (numerico con decimales)
        pst.setString(1, compania);
        pst.setInt(2, cel);
        pst.setString(3, especializacion);
        //Asignar el segundo parametro(entero)
        pst.setInt(4, dni);
        //Ejecutar la consulta
        pst.executeUpdate();
        //Liberar recursos
        pst.close();        
        conn.close();
    }
    //probando
    
}
