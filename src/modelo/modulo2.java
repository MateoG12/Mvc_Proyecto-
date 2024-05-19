package modelo;

public class modulo2 {
    private String convocatorias;
    private String Fecha_convocatorias;
    private String partidos;
    private String Fecha_partidos;
    private String Entrenamiento;
    private String Fecha_entrenamiento;

    public modulo2(){

    }

    public modulo2(String convocatorias, String fecha_convocatorias, String partidos, String fecha_partidos, String entrenamiento, String fecha_entrenamiento) {
        this.convocatorias = convocatorias;
        Fecha_convocatorias = fecha_convocatorias;
        this.partidos = partidos;
        Fecha_partidos = fecha_partidos;
        Entrenamiento = entrenamiento;
        Fecha_entrenamiento = fecha_entrenamiento;
    }

    public String getConvocatorias() {
        return convocatorias;
    }

    public void setConvocatorias(String convocatorias) {
        this.convocatorias = convocatorias;
    }

    public String getFecha_convocatorias() {
        return Fecha_convocatorias;
    }

    public void setFecha_convocatorias(String fecha_convocatorias) {
        Fecha_convocatorias = fecha_convocatorias;
    }

    public String getPartidos() {
        return partidos;
    }

    public void setPartidos(String partidos) {
        this.partidos = partidos;
    }

    public String getFecha_partidos() {
        return Fecha_partidos;
    }

    public void setFecha_partidos(String fecha_partidos) {
        Fecha_partidos = fecha_partidos;
    }

    public String getEntrenamiento() {
        return Entrenamiento;
    }

    public void setEntrenamiento(String entrenamiento) {
        Entrenamiento = entrenamiento;
    }

    public String getFecha_entrenamiento() {
        return Fecha_entrenamiento;
    }

    public void setFecha_entrenamiento(String fecha_entrenamiento) {
        Fecha_entrenamiento = fecha_entrenamiento;
    }

    @Override
    public String toString() {
        return "\n------------------------------------" +
                "\n Convocatorias= " + convocatorias +
                "\n Fecha_convocatorias= " + Fecha_convocatorias +
                "\n Partidos= " + partidos +
                "\n Fecha_partidos= " + Fecha_partidos +
                "\n Entrenamiento= " + Entrenamiento +
                "\n Fecha_entrenamiento= " + Fecha_entrenamiento +
                '\n';
    }
}
 