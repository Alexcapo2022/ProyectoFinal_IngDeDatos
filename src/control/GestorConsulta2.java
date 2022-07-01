/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import Datos.JdbcUtil;
import Modelo.Agendar;
import Modelo.Consulta2;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Alexander Cruz
 */
public class GestorConsulta2 {
    public ArrayList<Consulta2> ListConsulta2a(){
        ArrayList<Consulta2> Consulta2 = new ArrayList();
        try{
            Connection conn = JdbcUtil.getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT A.usuario AS \"USUARIO\",av.codigo_averia as \"CODIGO_AVERIA\",av.hora_llegada AS \"HORA_LLEGADA\",s.tecnologia AS \"TECNOLOGIA\",s.tipo_paquete AS \"TIPO_PAQUETE\",\n" +
            "s.estado AS \"ESTADO\",av.estado_averia AS \"ESTADO_AVERIA\"\n" +
            "FROM ASESOR A\n" +
            "INNER JOIN AVERIA AV\n" +
            "ON a.dni_asesor = av.dni_asesor\n" +
            "INNER JOIN SERVICIO S\n" +
            "ON av.codigo_averia = s.codigo_averia\n" +
            "WHERE ESTADO_AVERIA='EN PROCESO'");
            while(rs.next()){
                String Nombre = rs.getString("USUARIO");
                String cod = rs.getString("CODIGO_AVERIA");
                String HORA = rs.getString("HORA_LLEGADA");
                String TEC = rs.getString("TECNOLOGIA");
                String PAQ = rs.getString("TIPO_PAQUETE");           
                String ESTADO = rs.getString("ESTADO");
                String ESTADO_AVERIA = rs.getString("ESTADO_AVERIA");
                
                Consulta2 user = new Consulta2(Nombre,cod,HORA,TEC,PAQ,ESTADO,ESTADO_AVERIA);
                Consulta2.add(user);
                }
        }
            catch(SQLException ex){
                        System.out.println(ex.getMessage());
                        System.out.println("ERROR EN LISTADO");
                    }
        return Consulta2;
    }
    public ArrayList<Consulta2> ListConsulta2b(){
        ArrayList<Consulta2> Consulta2 = new ArrayList();
        try{
            Connection conn = JdbcUtil.getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT A.usuario AS \"USUARIO\",av.codigo_averia as \"CODIGO_AVERIA\",av.hora_llegada AS \"HORA_LLEGADA\",s.tecnologia AS \"TECNOLOGIA\",s.tipo_paquete AS \"TIPO_PAQUETE\",\n" +
            "s.estado AS \"ESTADO\",av.estado_averia AS \"ESTADO_AVERIA\"\n" +
            "FROM ASESOR A\n" +
            "INNER JOIN AVERIA AV\n" +
            "ON a.dni_asesor = av.dni_asesor\n" +
            "INNER JOIN SERVICIO S\n" +
            "ON av.codigo_averia = s.codigo_averia\n" +
            "WHERE ESTADO_AVERIA='NO ATENDIDO'");
            while(rs.next()){
                String Nombre = rs.getString("USUARIO");
                String cod = rs.getString("CODIGO_AVERIA");
                String HORA = rs.getString("HORA_LLEGADA");
                String TEC = rs.getString("TECNOLOGIA");
                String PAQ = rs.getString("TIPO_PAQUETE");           
                String ESTADO = rs.getString("ESTADO");
                String ESTADO_AVERIA = rs.getString("ESTADO_AVERIA");
                
                Consulta2 user = new Consulta2(Nombre,cod,HORA,TEC,PAQ,ESTADO,ESTADO_AVERIA);
                Consulta2.add(user);
                }
        }
            catch(SQLException ex){
                        System.out.println(ex.getMessage());
                        System.out.println("ERROR EN LISTADO");
                    }
        return Consulta2;
    }
    public ArrayList<Consulta2> ListConsulta2c(){
        ArrayList<Consulta2> Consulta2 = new ArrayList();
        try{
            Connection conn = JdbcUtil.getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT A.usuario AS \"USUARIO\",av.codigo_averia as \"CODIGO_AVERIA\",av.hora_llegada AS \"HORA_LLEGADA\",s.tecnologia AS \"TECNOLOGIA\",s.tipo_paquete AS \"TIPO_PAQUETE\",\n" +
            "s.estado AS \"ESTADO\",av.estado_averia AS \"ESTADO_AVERIA\"\n" +
            "FROM ASESOR A\n" +
            "INNER JOIN AVERIA AV\n" +
            "ON a.dni_asesor = av.dni_asesor\n" +
            "INNER JOIN SERVICIO S\n" +
            "ON av.codigo_averia = s.codigo_averia\n" +
            "WHERE ESTADO_AVERIA='FINALIZADO'");
            while(rs.next()){
                String Nombre = rs.getString("USUARIO");
                String cod = rs.getString("CODIGO_AVERIA");
                String HORA = rs.getString("HORA_LLEGADA");
                String TEC = rs.getString("TECNOLOGIA");
                String PAQ = rs.getString("TIPO_PAQUETE");           
                String ESTADO = rs.getString("ESTADO");
                String ESTADO_AVERIA = rs.getString("ESTADO_AVERIA");
                
                Consulta2 user = new Consulta2(Nombre,cod,HORA,TEC,PAQ,ESTADO,ESTADO_AVERIA);
                Consulta2.add(user);
                }
        }
            catch(SQLException ex){
                        System.out.println(ex.getMessage());
                        System.out.println("ERROR EN LISTADO");
                    }
        return Consulta2;
    }
    
}
