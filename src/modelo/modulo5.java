package modelo;

public class modulo5 {
    private String materiales;
    private int cantidad;

    public modulo5(String materiales, int cantidad) {
        this.materiales = materiales;
        this.cantidad = cantidad;
    }

    public String getMateriales() {
        return materiales;
    }

    public void setMateriales(String materiales) {
        this.materiales = materiales;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "modulo5{" +
                "materiales='" + materiales + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }
}
