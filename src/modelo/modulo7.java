package modelo;

public class modulo7 {

    private String Noticias;
    private String fecha;
    private String Importancia;
    private String Novedades;


    public modulo7(String info, String nuevacnt, String nuevacn, String nng, String fcn){
    }

    public modulo7(String noticias, String fecha, String importancia, String Novedades) {
        Noticias = noticias;
        this.fecha = fecha;
        Importancia = importancia;
        this.Novedades = Novedades;
    }

    public String getNoticias() {
        return Noticias;
    }

    public void setNoticias(String noticias) {
        Noticias = noticias;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getImportancia() {
        return Importancia;
    }

    public void setImportancia(String importancia) {
        Importancia = importancia;
    }

    public String getNovedades() {
        return Novedades;
    }

    public void setNovedades(String novedades) {
        Novedades = novedades;
    }

    @Override
    public String toString() {
        return "\nmodulo7" +
                "\nNoticias='" + Noticias +
                "\nfecha='" + fecha +
                "\nImportancia='" + Importancia +
                "\nNovedades='" + Novedades +
                '}';
    }
}
