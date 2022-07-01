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
public class Asesor {
    int DNI_ASESOR;
    String CorreoEmpresa;
    int CelAsesor;
    String NombreAsesor;
    String Usuario;
    String contraseña;
    
    public Asesor(){
        this.DNI_ASESOR=0;
        this.CorreoEmpresa="";
        this.NombreAsesor="";
        this.CelAsesor=0;
        this.NombreAsesor="";
        this.Usuario="";
        this.contraseña="";    
    }

    public Asesor(int DNI_ASESOR, String CorreoEmpresa, int CelAsesor, String NombreAsesor, String Usuario, String contraseña) {
        this.DNI_ASESOR = DNI_ASESOR;
        this.CorreoEmpresa = CorreoEmpresa;
        this.CelAsesor = CelAsesor;
        this.NombreAsesor = NombreAsesor;
        this.Usuario = Usuario;
        this.contraseña = contraseña;
    }

    public int getDNI_ASESOR() {
        return DNI_ASESOR;
    }

    public void setDNI_ASESOR(int DNI_ASESOR) {
        this.DNI_ASESOR = DNI_ASESOR;
    }

    public String getCorreoEmpresa() {
        return CorreoEmpresa;
    }

    public void setCorreoEmpresa(String CorreoEmpresa) {
        this.CorreoEmpresa = CorreoEmpresa;
    }

    public int getCelAsesor() {
        return CelAsesor;
    }

    public void setCelAsesor(int CelAsesor) {
        this.CelAsesor = CelAsesor;
    }

    public String getNombreAsesor() {
        return NombreAsesor;
    }

    public void setNombreAsesor(String NombreAsesor) {
        this.NombreAsesor = NombreAsesor;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "Asesor{" + "DNI_ASESOR=" + DNI_ASESOR + ", CorreoEmpresa=" + CorreoEmpresa + ", CelAsesor=" + CelAsesor + ", NombreAsesor=" + NombreAsesor + ", Usuario=" + Usuario + ", contrase\u00f1a=" + contraseña + '}';
    }
    
}
