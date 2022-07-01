/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


import java.sql.Date;

/**
 *
 * @author Alexander Cruz
 */
public class Direccion {
    int Codigo_Direc;
    String Departamento;
    String Provincia;
    String calle;
    String Distrito;
    String Urbanizacion;
    String Mz;
    String Lote;
    int codigo_servicio;
            
    public Direccion() {
        this.Codigo_Direc=0;
        this.Departamento="";
        this.Provincia="";
        this.calle="";
        this.Distrito="";
        this.Urbanizacion="";
        this.Mz="";
        this.Lote="";
        this.codigo_servicio=0; 
    }

    public Direccion(int Codigo_Direc, String Departamento, String Provincia, String calle, String Distrito, String Urbanizacion, String Mz, String Lote, int codigo_servicio) {
        this.Codigo_Direc = Codigo_Direc;
        this.Departamento = Departamento;
        this.Provincia = Provincia;
        this.calle = calle;
        this.Distrito = Distrito;
        this.Urbanizacion = Urbanizacion;
        this.Mz = Mz;
        this.Lote = Lote;
        this.codigo_servicio = codigo_servicio;
    }

    public int getCodigo_Direc() {
        return Codigo_Direc;
    }

    public void setCodigo_Direc(int Codigo_Direc) {
        this.Codigo_Direc = Codigo_Direc;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }

    public String getProvincia() {
        return Provincia;
    }

    public void setProvincia(String Provincia) {
        this.Provincia = Provincia;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getDistrito() {
        return Distrito;
    }

    public void setDistrito(String Distrito) {
        this.Distrito = Distrito;
    }

    public String getUrbanizacion() {
        return Urbanizacion;
    }

    public void setUrbanizacion(String Urbanizacion) {
        this.Urbanizacion = Urbanizacion;
    }

    public String getMz() {
        return Mz;
    }

    public void setMz(String Mz) {
        this.Mz = Mz;
    }

    public String getLote() {
        return Lote;
    }

    public void setLote(String Lote) {
        this.Lote = Lote;
    }

    public int getCodigo_servicio() {
        return codigo_servicio;
    }

    public void setCodigo_servicio(int codigo_servicio) {
        this.codigo_servicio = codigo_servicio;
    }

    @Override
    public String toString() {
        return "Direccion{" + "Codigo_Direc=" + Codigo_Direc + ", Departamento=" + Departamento + ", Provincia=" + Provincia + ", calle=" + calle + ", Distrito=" + Distrito + ", Urbanizacion=" + Urbanizacion + ", Mz=" + Mz + ", Lote=" + Lote + ", codigo_servicio=" + codigo_servicio + '}';
    }
    
            
}
