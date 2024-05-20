package modelo;

public class modulo6 {

    private String nombre;
    private String apellido;
    private String tipod;
    private int documento;
    private String categoria;

    public modulo6() {
    }

    public modulo6(String nombre, String apellido, String tipod, int documento, String categoria) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipod = tipod;
        this.documento = documento;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTipod() {
        return tipod;
    }

    public void setTipod(String tipod) {
        this.tipod = tipod;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "personitas{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", tipod='" + tipod + '\'' +
                ", documento=" + documento +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}
