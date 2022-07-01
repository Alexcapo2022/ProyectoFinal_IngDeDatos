package control;

import Datos.JdbcUtil;
import Modelo.Agendar;
import Modelo.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Fer
 */
public class GestorAgendar {
    protected Agendar [] claseAgendar;
    protected static final int MAX = 100;
    protected int contarAgendar;

    public GestorAgendar() {
        claseAgendar = new Agendar [MAX];
        this.contarAgendar = 0;
    }
// cantidad
    public int Longitud (){
        return contarAgendar;
    }

    
// bota la POSicion
    public Agendar Iesimo (int pos){ 
        if (pos >= 0 && pos < contarAgendar) {
            return claseAgendar [pos];
        }
        return null;
    }
    public ArrayList<Agendar> ListAgendar(){
        ArrayList<Agendar> Agendar = new ArrayList();
        try{
            Connection conn = JdbcUtil.getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT tecnico.nombre AS \"TECNICO\",TECNICO.\"COMPAÑIA\" as \"COMPAÑIA\",tecnico.especializacion AS \"ESPECIALIZACION\",DNI_ASESOR,DNI_TECNICO,DISPONIBILIDAD\n" +
            "FROM AGENDAR INNER JOIN ASESOR USING (DNI_ASESOR)\n" +
            "INNER JOIN TECNICO USING (DNI_TECNICO) WHERE DISPONIBILIDAD='SI'");
            while(rs.next()){
                String Nombre = rs.getString("TECNICO");
                String compa = rs.getString("COMPAÑIA");
                String espe = rs.getString("ESPECIALIZACION");
                int DNIA = rs.getInt("DNI_ASESOR");
                int DNIT = rs.getInt("DNI_TECNICO");             
                String DISPO = rs.getString("DISPONIBILIDAD");
                
                Agendar user = new Agendar(Nombre,DNIA,DNIT,compa,espe,DISPO);
                Agendar.add(user);
                }
        }
            catch(SQLException ex){
                        System.out.println(ex.getMessage());
                        System.out.println("ERROR EN LISTADO");
                    }
        return Agendar;
    }
    public ArrayList<Agendar> ListAgendar2(){
        ArrayList<Agendar> Agendar = new ArrayList();
        try{
            Connection conn = JdbcUtil.getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT tecnico.nombre AS \"TECNICO\",TECNICO.\"COMPAÑIA\" as \"COMPAÑIA\",tecnico.especializacion AS \"ESPECIALIZACION\",DNI_ASESOR,DNI_TECNICO,DISPONIBILIDAD\n" +
"FROM AGENDAR INNER JOIN ASESOR USING (DNI_ASESOR)\n" +
"INNER JOIN TECNICO USING (DNI_TECNICO) WHERE DISPONIBILIDAD='NO'");
            while(rs.next()){
                String Nombre = rs.getString("TECNICO");
                String compa = rs.getString("COMPAÑIA");
                String espe = rs.getString("ESPECIALIZACION");
                int DNIA = rs.getInt("DNI_ASESOR");
                int DNIT = rs.getInt("DNI_TECNICO");             
                String DISPO = rs.getString("DISPONIBILIDAD");
                
                Agendar user = new Agendar(Nombre,DNIA,DNIT,compa,espe,DISPO);
                Agendar.add(user);
                }
        }
            catch(SQLException ex){
                        System.out.println(ex.getMessage());
                        System.out.println("ERROR EN LISTADO");
                    }
        return Agendar;
    }
}
