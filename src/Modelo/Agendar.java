package Modelo;

/**
 * @author Fer
 */
public class Agendar {
    private String NombreT;
    private int DniA;
    private int DniT;
    private String Disponibilidad;
    private String Compañia;
    private String Especializacion;
    
    public Agendar() {
        this.NombreT = "";
        this.DniA = 0;
        this.DniT = 0;
        this.Disponibilidad = "";
        this.Compañia="";
        this.Especializacion="";
    }

    public Agendar(String NombreT, int DniA, int DniT, String Disponibilidad, String Compañia, String Especializacion) {
        this.NombreT = NombreT;
        this.DniA = DniA;
        this.DniT = DniT;
        this.Disponibilidad = Disponibilidad;
        this.Compañia = Compañia;
        this.Especializacion = Especializacion;
    }

    public String getNombreT() {
        return NombreT;
    }

    public void setNombreT(String NombreT) {
        this.NombreT = NombreT;
    }

    public int getDniA() {
        return DniA;
    }

    public void setDniA(int DniA) {
        this.DniA = DniA;
    }

    public int getDniT() {
        return DniT;
    }

    public void setDniT(int DniT) {
        this.DniT = DniT;
    }

    public String getDisponibilidad() {
        return Disponibilidad;
    }

    public void setDisponibilidad(String Disponibilidad) {
        this.Disponibilidad = Disponibilidad;
    }

    public String getCompañia() {
        return Compañia;
    }

    public void setCompañia(String Compañia) {
        this.Compañia = Compañia;
    }

    public String getEspecializacion() {
        return Especializacion;
    }

    public void setEspecializacion(String Especializacion) {
        this.Especializacion = Especializacion;
    }

    @Override
    public String toString() {
        return "Agendar{" + "NombreT=" + NombreT + ", DniA=" + DniA + ", DniT=" + DniT + ", Disponibilidad=" + Disponibilidad + ", Compa\u00f1ia=" + Compañia + ", Especializacion=" + Especializacion + '}';
    }

    

    
}
