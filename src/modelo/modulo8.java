package modelo;

public class modulo8 {
    private String nombre;
    private String categoria;
    private String documento;
    private String posicion;
    private String entrenador;

    public modulo8(String nombre, String categoria, String documento, String posicion, String entrenador) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.documento = documento;
        this.posicion = posicion;
        this.entrenador = entrenador;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(String entrenador) {
        this.entrenador = entrenador;
    }

    @Override
    public String toString() {
        return "modulo8{" +
                "nombre='" + nombre + '\'' +
                ", categoria='" + categoria + '\'' +
                ", documento='" + documento + '\'' +
                ", posicion='" + posicion + '\'' +
                ", entrenador='" + entrenador + '\'' +
                '}';
    }
}

