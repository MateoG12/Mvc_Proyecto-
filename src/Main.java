import vista.vistaadministrador;
import vista.vistamodulo2;

public class Main {
    public static void main(String[] args) {
        vistaadministrador vista = new vistaadministrador();
        vistamodulo2 vista2 = new vistamodulo2();

        System.out.println("Ejecutando Modulo1 ");
        vista.conectar();
        System.out.println("Ejecutando Modulo2 ");
        vista2.conectar2();

    }
}