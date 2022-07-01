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
public class GestorAsesor {
    protected Asesor [] ClaseAsesor;
    protected static final int MAX = 300;
    protected int n;
    
    public GestorAsesor() {
        ClaseAsesor = new Asesor[MAX];
        this.n = 0;
    }
    public int longitud() {
        return n;
    }
    public Asesor iesimo(int pos) {
        if (pos >= 0 && pos < n) {
            return ClaseAsesor[pos];
        }
        return null;
    }
    public ArrayList<Asesor> ListAsesores(){
        ArrayList<Asesor> Asesor = new ArrayList();
        try{
            Connection conn = JdbcUtil.getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM ASESOR");
            while(rs.next()){
                int DNI = rs.getInt("DNI_ASESOR");
                String correo = rs.getString("CORREO_EMPRESA");
                int cel = rs.getInt("CELULAR");
                String nombre = rs.getString("NOMBRE");
                String usuario = rs.getString("USUARIO");//
                String contraseña = rs.getString("CONTRASEÑA");
                Asesor user = new Asesor(DNI,correo, cel, nombre,usuario,contraseña);
                Asesor.add(user);
                }
        }
            catch(SQLException ex){
                        System.out.println(ex.getMessage());
                        System.out.println("ERROR EN LISTADO");
                    }
        return Asesor;
    }
    
    public static void registrarAsesor(Asesor asesor) throws Exception{
        Connection conn = JdbcUtil.getConnection();
        String sql = "INSERT INTO ASESOR VALUES(?,?,?,?,?,?)";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1,asesor.getDNI_ASESOR());
        pst.setString(2, asesor.getCorreoEmpresa());
        pst.setInt(3, asesor.getCelAsesor());
        pst.setString(4, asesor.getNombreAsesor());
        pst.setString(5, asesor.getUsuario());
        pst.setString(6, asesor.getContraseña());
        pst.executeUpdate();
        pst.close();
        conn.close();
    }
    
    public static void eliminarAsesor(int DNI) throws Exception{
        Connection conn = JdbcUtil.getConnection();
        String sql = "DELETE FROM ASESOR WHERE DNI_ASESOR = ?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1, DNI);
        pst.executeUpdate();
        pst.close();        
        conn.close();
    }
    public static void actualizarData(String correo,int Celular,String contraseña, int dni) throws Exception{
        //Obtener el objeto conexion
        Connection conn = JdbcUtil.getConnection();
        //Definir la sentencia (como cadena)
        String sql = "UPDATE ASESOR SET CORREO_EMPRESA = ?,CELULAR = ? ,CONTRASEÑA = ? WHERE DNI_ASESOR = ?";
        //Crear objeto Statement (PreparedStatement -> con parametros)
        PreparedStatement pst = conn.prepareStatement(sql);
        //Asignar valores a los parametros (indices a partir de 1)
        //Asignar el primer parametro (numerico con decimales)
        pst.setString(1, correo);
        //Asignar el segundo parametro(entero)
        pst.setInt(2, Celular);
        pst.setString(3, contraseña);
        pst.setInt(4, dni);
        //Ejecutar la consulta
        pst.executeUpdate();
        //Liberar recursos
        pst.close();        
        conn.close();
    }          
}
    

