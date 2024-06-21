package modelo;
public class modulo3 {
    private String Nombre;
    private int documento;
    private String Categoria;
    private int pagosfaltantes;


//    public modulo3(String nombre, String categoria, int documento, int diafaltante){
//
//    }
    public modulo3(String nombre, int documento, String categoria, int pagosfaltantes) {
        Nombre = nombre;
        this.documento = documento;
        Categoria = categoria;
        this.pagosfaltantes = pagosfaltantes;

    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String categoria) {
        Categoria = categoria;
    }

    public int getPagosfaltantes() {
        return pagosfaltantes;
    }

    public void setPagosfaltantes(int pagosfaltantes) {
        this.pagosfaltantes = pagosfaltantes;
    }



    @Override
    public String toString() {
        return "modulo3{" +
                "Nombre='" + Nombre + '\'' +
                ", documento=" + documento +
                ", Categoria='" + Categoria + '\'' +
                ", pagosfaltantes=" + pagosfaltantes +
                '}';
    }
}
