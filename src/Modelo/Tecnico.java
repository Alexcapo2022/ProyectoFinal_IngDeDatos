/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Alexander Cruz
 */
public class Tecnico {
    int DNI_TECNICO;
    String NombreTecnico;
    int CelTecnico;
    String Compañia;
    String Especialización;
    
    public Tecnico(){
        this.DNI_TECNICO=0;
        this.NombreTecnico="";
        this.CelTecnico=0;
        this.Compañia="";
        this.Especialización="";
    }

    public Tecnico(int DNI_TECNICO, String NombreTecnico, int CelTecnico, String Compañia, String Especialización) {
        this.DNI_TECNICO = DNI_TECNICO;
        this.NombreTecnico = NombreTecnico;
        this.CelTecnico = CelTecnico;
        this.Compañia = Compañia;
        this.Especialización = Especialización;
    }

    public int getDNI_TECNICO() {
        return DNI_TECNICO;
    }

    public void setDNI_TECNICO(int DNI_TECNICO) {
        this.DNI_TECNICO = DNI_TECNICO;
    }

    public String getNombreTecnico() {
        return NombreTecnico;
    }

    public void setNombreTecnico(String NombreTecnico) {
        this.NombreTecnico = NombreTecnico;
    }

    public int getCelTecnico() {
        return CelTecnico;
    }

    public void setCelTecnico(int CelTecnico) {
        this.CelTecnico = CelTecnico;
    }

    public String getCompañia() {
        return Compañia;
    }

    public void setCompañia(String Compañia) {
        this.Compañia = Compañia;
    }

    public String getEspecialización() {
        return Especialización;
    }

    public void setEspecialización(String Especialización) {
        this.Especialización = Especialización;
    }

    @Override
    public String toString() {
        return "Tecnico{" + "DNI_TECNICO=" + DNI_TECNICO + ", NombreTecnico=" + NombreTecnico + ", CelTecnico=" + CelTecnico + ", Compa\u00f1ia=" + Compañia + ", Especializaci\u00f3n=" + Especialización + '}';
    }
    
}
