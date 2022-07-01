/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import Datos.JdbcUtil;
import Modelo.Agendar;
import Modelo.Consulta3;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Alexander Cruz
 */
public class GestorConsulta3 {
    public ArrayList<Consulta3> ListConsulta3(){
        ArrayList<Consulta3> Consulta3 = new ArrayList();
        try{
            Connection conn = JdbcUtil.getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT asE.USUARIO AS \"USUARIO\" ,u.nombre AS \"NOMBRE\",s.codigo_servicio AS \"CODIGO_SERVICIO\"\n" +
",a.codigo_averia AS \"CODIGO_AVERIA\",s.tipo_paquete AS \"TIPO_PAQUETE\",p.averia_pendiente AS \"AVERIA_PENDIENTE\",d.departamento, d.provincia,d.distrito AS \"DISTRITO\", 'Calle  ' || d.calle || ' Mz. ' || d.mz || ' Lote  ' || d.lote || '  Urb. ' || d.urbanziacion AS \"DIRECCION\" \n" +
"FROM USUARIO U \n" +
"INNER JOIN PERTENECER P\n" +
"ON U.DNI_USUARIO = P.DNI_USUARIO\n" +
"INNER JOIN SERVICIO S\n" +
"ON P.CODIGO_SERVICIO = S.CODIGO_SERVICIO\n" +
"INNER JOIN DIRECCION D\n" +
"ON S.CODIGO_SERVICIO = D.CODIGO_SERVICIO\n" +
"INNER JOIN AVERIA A\n" +
"ON s.codigo_averia = A.CODIGO_averia\n" +
"inner join ASESOR ASE\n" +
"on A.DNI_ASESOR = asE.DNI_ASESOR\n" +
"WHERE p.averia_pendiente='SI'");
            while(rs.next()){
                String usu = rs.getString("USUARIO");
                String NOM = rs.getString("NOMBRE");
                int codS = rs.getInt("CODIGO_SERVICIO");
                String CODA = rs.getString("CODIGO_AVERIA");             
                String TIPO = rs.getString("TIPO_PAQUETE");
                String pen = rs.getString("AVERIA_PENDIENTE");
                String DEP = rs.getString("DEPARTAMENTO");
                String PROV = rs.getString("PROVINCIA");
                String DISTRITO = rs.getString("DISTRITO");
                String DIREC = rs.getString("DIRECCION");
                
                Consulta3 user = new Consulta3(usu,NOM,codS,CODA,TIPO,pen,DEP,PROV,DISTRITO,DIREC );
                Consulta3.add(user);
                }
        }
            catch(SQLException ex){
                        System.out.println(ex.getMessage());
                        System.out.println("ERROR EN LISTADO");
                    }
        return Consulta3;
    }
    public ArrayList<Consulta3> ListConsulta3b(){
        ArrayList<Consulta3> Consulta3 = new ArrayList();
        try{
            Connection conn = JdbcUtil.getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT asE.USUARIO AS \"USUARIO\" ,u.nombre AS \"NOMBRE\",s.codigo_servicio AS \"CODIGO_SERVICIO\"\n" +
                ",a.codigo_averia AS \"CODIGO_AVERIA\",s.tipo_paquete AS \"TIPO_PAQUETE\",p.averia_pendiente AS \"AVERIA_PENDIENTE\",d.departamento, d.provincia,d.distrito AS \"DISTRITO\", 'Calle  ' || d.calle || ' Mz. ' || d.mz || ' Lote  ' || d.lote || '  Urb. ' || d.urbanziacion AS \"DIRECCION\" \n" +
                "FROM USUARIO U \n" +
                "INNER JOIN PERTENECER P\n" +
                "ON U.DNI_USUARIO = P.DNI_USUARIO\n" +
                "INNER JOIN SERVICIO S\n" +
                "ON P.CODIGO_SERVICIO = S.CODIGO_SERVICIO\n" +
                "INNER JOIN DIRECCION D\n" +
                "ON S.CODIGO_SERVICIO = D.CODIGO_SERVICIO\n" +
                "INNER JOIN AVERIA A\n" +
                "ON s.codigo_averia = A.CODIGO_averia\n" +
                "inner join ASESOR ASE\n" +
                "on A.DNI_ASESOR = asE.DNI_ASESOR\n" +
                "WHERE p.averia_pendiente='NO'");
            while(rs.next()){
                String usu = rs.getString("USUARIO");
                String NOM = rs.getString("NOMBRE");
                int codS = rs.getInt("CODIGO_SERVICIO");
                String CODA = rs.getString("CODIGO_AVERIA");             
                String TIPO = rs.getString("TIPO_PAQUETE");
                String pen = rs.getString("AVERIA_PENDIENTE");
                String DEP = rs.getString("DEPARTAMENTO");
                String PROV = rs.getString("PROVINCIA");
                String DISTRITO = rs.getString("DISTRITO");
                String DIREC = rs.getString("DIRECCION");
                
                Consulta3 user = new Consulta3(usu,NOM,codS,CODA,TIPO,pen,DEP,PROV,DISTRITO,DIREC );
                Consulta3.add(user);
                }
        }
            catch(SQLException ex){
                        System.out.println(ex.getMessage());
                        System.out.println("ERROR EN LISTADO");
                    }
        return Consulta3;
    }
}
