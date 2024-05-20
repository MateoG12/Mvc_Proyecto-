import vista.vistamodulo1;
import vista.vistamodulo2;
import vista.vistamodulo5;
import vista.vistamodulo4;
import vista.vistamodulo6;


public class Main {
    public static void main(String[] args) {
        vistamodulo1 vista1 = new vistamodulo1();
        vistamodulo2 vista2 = new vistamodulo2();
        vistamodulo6 vista6 = new vistamodulo6();
        vistamodulo4 vistamodulo4 = new vistamodulo4();
        vistamodulo5 vistamodulo5 = new vistamodulo5();
        System.out.println("Ejecutando Modulo 1 ");
        vista1.conectar();
        System.out.println("Ejecutando Modulo 2 ");
        vista2.conectar2();
        System.out.println("Ejecutando Modulo 4 ");
        vistamodulo4.conectar4();
        System.out.println("ejecutando Modulo 5");
        vistamodulo5.conectar5();
        System.out.println("ejecutando Modulo 6");
        vista6.conectar();



    }
}