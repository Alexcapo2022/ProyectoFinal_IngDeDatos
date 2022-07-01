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
public class Servicio {
    int codigo_servicio;
    String Tecnologia;
    String Estado;
    String Equipo;
    String Fecha_Inicio;//formato date
    String Tipo_Paquete;
    String Ciclo_Facturacion;
    int cod_averia;
    
    public Servicio(){
        this.cod_averia = 0;
        this.Tecnologia = "";
        this.Estado = "";
        this.Equipo= "";
        this.Fecha_Inicio= "";
        this.Tipo_Paquete="";
        this.Ciclo_Facturacion="";
        this.cod_averia=0;          
    }

    public Servicio(int codigo_servicio, String Tecnologia, String Estado, String Equipo, String Fecha_Inicio, String Tipo_Paquete, String Ciclo_Facturacion, int cod_averia) {
        this.codigo_servicio = codigo_servicio;
        this.Tecnologia = Tecnologia;
        this.Estado = Estado;
        this.Equipo = Equipo;
        this.Fecha_Inicio = Fecha_Inicio;
        this.Tipo_Paquete = Tipo_Paquete;
        this.Ciclo_Facturacion = Ciclo_Facturacion;
        this.cod_averia = cod_averia;
    }

    public int getCodigo_servicio() {
        return codigo_servicio;
    }

    public void setCodigo_servicio(int codigo_servicio) {
        this.codigo_servicio = codigo_servicio;
    }

    public String getTecnologia() {
        return Tecnologia;
    }

    public void setTecnologia(String Tecnologia) {
        this.Tecnologia = Tecnologia;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getEquipo() {
        return Equipo;
    }

    public void setEquipo(String Equipo) {
        this.Equipo = Equipo;
    }

    public String getFecha_Inicio() {
        return Fecha_Inicio;
    }

    public void setFecha_Inicio(String Fecha_Inicio) {
        this.Fecha_Inicio = Fecha_Inicio;
    }

    public String getTipo_Paquete() {
        return Tipo_Paquete;
    }

    public void setTipo_Paquete(String Tipo_Paquete) {
        this.Tipo_Paquete = Tipo_Paquete;
    }

    public String getCiclo_Facturacion() {
        return Ciclo_Facturacion;
    }

    public void setCiclo_Facturacion(String Ciclo_Facturacion) {
        this.Ciclo_Facturacion = Ciclo_Facturacion;
    }

    public int getCod_averia() {
        return cod_averia;
    }

    public void setCod_averia(int cod_averia) {
        this.cod_averia = cod_averia;
    }

    @Override
    public String toString() {
        return "Direccion{" + "codigo_servicio=" + codigo_servicio + ", Tecnologia=" + Tecnologia + ", Estado=" + Estado + ", Equipo=" + Equipo + ", Fecha_Inicio=" + Fecha_Inicio + ", Tipo_Paquete=" + Tipo_Paquete + ", Ciclo_Facturacion=" + Ciclo_Facturacion + ", cod_averia=" + cod_averia + '}';
    }
}
