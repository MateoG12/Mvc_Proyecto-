package modelo;

public class modulo4 {

    private String infor;
    private String nombre;
    private String fecha;
    private String categoria;

    public modulo4(String infor, String nombre, String fecha, String categoria) {
        this.infor = infor;
        this.nombre = nombre;
        this.fecha = fecha;
        this.categoria = categoria;
    }

    public String getInfor() {
        return infor;
    }

    public void setInfor(String infor) {
        this.infor = infor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "modulo4{" +
                "infor='" + infor + '\'' +
                ", nombre='" + nombre + '\'' +
                ", fecha=" + fecha +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}
