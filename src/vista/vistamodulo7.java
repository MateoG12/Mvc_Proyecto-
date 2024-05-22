package vista;

import controlador.controladormodulo7;

import java.util.Scanner;

public class vistamodulo7 {
    public String dato7;
    public int dato77;
    public int opc7;

    Scanner x = new Scanner(System.in);

    public String capturarnoticia() {
        System.out.println("Digite la noticia deseada");
        this.dato7 = x.next();
        return this.dato7;
    }

    public String capturarfecha() {
        System.out.println("Digite la fecha ");
        this.dato7 = x.next();
        return this.dato7;
    }

    public String capturarimportancia() {
        System.out.println("Digite el dato de importancia deseada");
        this.dato7 = x.next();
        return this.dato7;
    }

    public String capturarnovedades() {
        System.out.println("Digite la novedad del momento");
        this.dato7 = x.next();
        return this.dato7;
    }

    public int menu7() {
        System.out.println("Modulo 7");
        System.out.println("1. agregar noticia o novedad");
        System.out.println("2. mostrar noticias o novedades ");
        System.out.println("3. consultar por fecha");
        System.out.println("4. eliminar por fecha");
        System.out.println("5. modificar por fecha");
        System.out.println("6. salir");
        this.opc7 = x.nextInt();
        while (this.opc7 <= 0 || this.opc7 > 6) {
            System.out.println("Modulo 7");
            System.out.println("1. agregar noticia o novedad");
            System.out.println("2. mostrar noticias o novedades ");
            System.out.println("3. consultar por fecha");
            System.out.println("4. eliminar por fecha");
            System.out.println("5. modificar por fecha");
            System.out.println("6. salir");
            this.opc7 = x.nextInt();
        }
        return this.opc7;
    }

    public void  conectar7(){
        controladormodulo7 control7 =new controladormodulo7();
        control7.control2();
    }
    public void imprimir(String datos7){
        System.out.println(datos7);
    }


}