/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Date;
import static java.sql.JDBCType.DATE;

/**
 *
 * @author Alexander Cruz
 */
public class Averia {
    String codigo_averia;
    String Hora_llegada;
    Date Fecha_Inicio;
    Date Fecha_Fin;
    String estado_averia;
    int DNI_ASESOR;
    int DNI_USUARIO;
    
    

    public Averia(String codigo_averia, String Hora_llegada, Date Fecha_Inicio, Date Fecha_Fin, String estado_averia, int DNI_ASESOR, int DNI_USUARIO) {
        this.codigo_averia = codigo_averia;
        this.Hora_llegada = Hora_llegada;
        this.Fecha_Inicio = Fecha_Inicio;
        this.Fecha_Fin = Fecha_Fin;
        this.estado_averia = estado_averia;
        this.DNI_ASESOR = DNI_ASESOR;
        this.DNI_USUARIO = DNI_USUARIO;
    }

    public String getCodigo_averia() {
        return codigo_averia;
    }

    public void setCodigo_averia(String codigo_averia) {
        this.codigo_averia = codigo_averia;
    }

    public String getHora_llegada() {
        return Hora_llegada;
    }

    public void setHora_llegada(String Hora_llegada) {
        this.Hora_llegada = Hora_llegada;
    }

    public Date getFecha_Inicio() {
        return Fecha_Inicio;
    }

    public void setFecha_Inicio(Date Fecha_Inicio) {
        this.Fecha_Inicio = Fecha_Inicio;
    }

    public Date getFecha_Fin() {
        return Fecha_Fin;
    }

    public void setFecha_Fin(Date Fecha_Fin) {
        this.Fecha_Fin = Fecha_Fin;
    }

    public String getEstado_averia() {
        return estado_averia;
    }

    public void setEstado_averia(String estado_averia) {
        this.estado_averia = estado_averia;
    }

    public int getDNI_ASESOR() {
        return DNI_ASESOR;
    }

    public void setDNI_ASESOR(int DNI_ASESOR) {
        this.DNI_ASESOR = DNI_ASESOR;
    }

    public int getDNI_USUARIO() {
        return DNI_USUARIO;
    }

    public void setDNI_USUARIO(int DNI_USUARIO) {
        this.DNI_USUARIO = DNI_USUARIO;
    }

    @Override
    public String toString() {
        return "Averia{" + "codigo_averia=" + codigo_averia + ", Hora_llegada=" + Hora_llegada + ", Fecha_Inicio=" + Fecha_Inicio + ", Fecha_Fin=" + Fecha_Fin + ", estado_averia=" + estado_averia + ", DNI_ASESOR=" + DNI_ASESOR + ", DNI_USUARIO=" + DNI_USUARIO + '}';
    }
    
}
