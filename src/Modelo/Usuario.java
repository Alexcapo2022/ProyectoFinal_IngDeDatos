package Modelo;

public class Usuario {

    private int DNI;
    private String Nombre;
    private int telefono;
    private String correo;
    private String segmento_social;
    private String codigo_cliente;
    
    public Usuario(){
    this.DNI = 0;
    this.Nombre = "";
    this.telefono = 0;
    this.correo = "";
    this.segmento_social = "";
    this.codigo_cliente="";
    }

    public Usuario(int DNI, String Nombre, int telefono, String correo, String segmento_social, String codigo_cliente) {
        this.DNI = DNI;
        this.Nombre = Nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.segmento_social = segmento_social;
        this.codigo_cliente = codigo_cliente;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getSegmento_social() {
        return segmento_social;
    }

    public void setSegmento_social(String segmento_social) {
        this.segmento_social = segmento_social;
    }

    public String getCodigo_cliente() {
        return codigo_cliente;
    }

    public void setCodigo_cliente(String codigo_cliente) {
        this.codigo_cliente = codigo_cliente;
    }

    @Override
    public String toString() {
        return "Usuario{" + "DNI=" + DNI + ", Nombre=" + Nombre + ", telefono=" + telefono + ", correo=" + correo + ", segmento_social=" + segmento_social + ", codigo_cliente=" + codigo_cliente + '}';
    }
    
}

     
