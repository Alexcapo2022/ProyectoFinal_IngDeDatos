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
public class Consulta3 {
   String usuario;
   String Nombre;
   int CodS;
   String CodA;
   String Tipo_P;
   String AP;
   String Dep;
   String Prov;
   String Dist;
   String Direc;
   
   public Consulta3(){
       this.usuario="";
       this.Nombre="";
       this.CodS=0;
       this.CodA="";
       this.Tipo_P="";
       this.AP="";
       this.Dep="";
       this.Prov="";
       this.Dist="";
       this.Direc="";
   }

    public Consulta3(String usuario, String Nombre, int CodS, String CodA, String Tipo_P, String AP, String Dep, String Prov, String Dist, String Direc) {
        this.usuario = usuario;
        this.Nombre = Nombre;
        this.CodS = CodS;
        this.CodA = CodA;
        this.Tipo_P = Tipo_P;
        this.AP = AP;
        this.Dep = Dep;
        this.Prov = Prov;
        this.Dist = Dist;
        this.Direc = Direc;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCodS() {
        return CodS;
    }

    public void setCodS(int CodS) {
        this.CodS = CodS;
    }

    public String getCodA() {
        return CodA;
    }

    public void setCodA(String CodA) {
        this.CodA = CodA;
    }

    public String getTipo_P() {
        return Tipo_P;
    }

    public void setTipo_P(String Tipo_P) {
        this.Tipo_P = Tipo_P;
    }

    public String getAP() {
        return AP;
    }

    public void setAP(String AP) {
        this.AP = AP;
    }

    public String getDep() {
        return Dep;
    }

    public void setDep(String Dep) {
        this.Dep = Dep;
    }

    public String getProv() {
        return Prov;
    }

    public void setProv(String Prov) {
        this.Prov = Prov;
    }

    public String getDist() {
        return Dist;
    }

    public void setDist(String Dist) {
        this.Dist = Dist;
    }

    public String getDirec() {
        return Direc;
    }

    public void setDirec(String Direc) {
        this.Direc = Direc;
    }

    @Override
    public String toString() {
        return "Consulta3{" + "usuario=" + usuario + ", Nombre=" + Nombre + ", CodS=" + CodS + ", CodA=" + CodA + ", Tipo_P=" + Tipo_P + ", AP=" + AP + ", Dep=" + Dep + ", Prov=" + Prov + ", Dist=" + Dist + ", Direc=" + Direc + '}';
    }
   
   
   
}
