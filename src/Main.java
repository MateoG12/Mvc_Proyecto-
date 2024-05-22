import vista.vistamodulo1;
import vista.vistamodulo2;
import vista.vistamodulo3;
import vista.vistamodulo4;
import vista.vistamodulo5;
import vista.vistamodulo6;
import vista.vistamodulo7;
import vista.vistamodulo8;

public class Main {
    public static void main(String[] args) {

        vistamodulo1 vista1 = new vistamodulo1();
        System.out.println("ejecutando modulo 1");
        vista1.conectar();
        vistamodulo2 vista2 = new vistamodulo2();
        System.out.println("ejecutando modulo 2");
        vista2.conectar2();
        vistamodulo3 vista3 = new vistamodulo3();
        System.out.println("ejecutando modulo 1");
        vista3.conectar();
        vistamodulo4 vista4 = new vistamodulo4();
        System.out.println("ejecutando modulo 4");
        vista4.conectar4();
        vistamodulo5 vista5 = new vistamodulo5();
        System.out.println("ejecutando modulo 5");
        vista5.conectar5();
        vistamodulo6 vista6 = new vistamodulo6();
        System.out.println("ejecutando modulo 6");
        vista6.conectar();
        vistamodulo7 vista7 = new vistamodulo7();
        System.out.println("ejecutando modulo 7");
        vista7.conectar7();
        vistamodulo8 vista8 = new vistamodulo8();
        System.out.println("ejecutando modulo 8");
        vista8.conectar();

    }
}