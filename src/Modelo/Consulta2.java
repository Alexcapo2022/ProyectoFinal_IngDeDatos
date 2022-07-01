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
public class Consulta2 {
    String Usuario;
    String cod;
    String Hora_Llegada;
    String Tecnologia;
    String Paquete;
    String Estado;
    String Estado_Averia;
    
    public Consulta2(){
        this.Estado ="";
        this.cod="";
        this.Estado_Averia="";
        this.Hora_Llegada="";
        this.Paquete="";
        this.Tecnologia="";
        this.Usuario="";
        
    }

    public Consulta2(String Usuario, String cod, String Hora_Llegada, String Tecnologia, String Paquete, String Estado, String Estado_Averia) {
        this.Usuario = Usuario;
        this.cod = cod;
        this.Hora_Llegada = Hora_Llegada;
        this.Tecnologia = Tecnologia;
        this.Paquete = Paquete;
        this.Estado = Estado;
        this.Estado_Averia = Estado_Averia;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getHora_Llegada() {
        return Hora_Llegada;
    }

    public void setHora_Llegada(String Hora_Llegada) {
        this.Hora_Llegada = Hora_Llegada;
    }

    public String getTecnologia() {
        return Tecnologia;
    }

    public void setTecnologia(String Tecnologia) {
        this.Tecnologia = Tecnologia;
    }

    public String getPaquete() {
        return Paquete;
    }

    public void setPaquete(String Paquete) {
        this.Paquete = Paquete;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getEstado_Averia() {
        return Estado_Averia;
    }

    public void setEstado_Averia(String Estado_Averia) {
        this.Estado_Averia = Estado_Averia;
    }

    @Override
    public String toString() {
        return "Consulta2{" + "Usuario=" + Usuario + ", cod=" + cod + ", Hora_Llegada=" + Hora_Llegada + ", Tecnologia=" + Tecnologia + ", Paquete=" + Paquete + ", Estado=" + Estado + ", Estado_Averia=" + Estado_Averia + '}';
    }
    

    
    
    
    
}
