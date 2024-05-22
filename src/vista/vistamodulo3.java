package vista;

import controlador.controladormodulo3;

import java.util.Scanner;

public class vistamodulo3 {
    public String dato;
    public int dato2;
    public int opc;
    Scanner x =new Scanner(System.in);
    public String capturarnombre(){
        System.out.println("por favor ingrese su nombre");
        this.dato = x.next();
        return this.dato;
    }
    public int capturarnumerodocumento() {
        System.out.println("por favor ingrese el numero de su documento");
        this.dato2 = x.nextInt();
        while (this.dato2 <= 0) {
            System.out.println("documento invalido");
            System.out.println("ingrese su documento");
            this.dato2 = x.nextInt();
        }
        return this.dato2;
    }
    public String capturarcategoria(){
        System.out.println("por favor ingrese su categoria \n ej: sub 15 , sub 17 , sub 20");
        this.dato = x.next().toLowerCase();
        this.dato2 = x.nextInt();
        return this.dato;
    }
    public int capturarpagosfaltantes() {
        System.out.println("por favor ingrese el los dias que faltan de el pago ");
        this.dato2 = x.nextInt();
        while (this.dato2 < 0) {
            System.out.println("documento invalido");
            System.out.println("ingrese su documento");
            this.dato2 = x.nextInt();
        }
        return this.dato2;
    }
    public int menu(){
        System.out.println("MODULO 3 ");
        System.out.println("1. agregar");
        System.out.println("2. mostrar los datos");
        System.out.println("3. consultar por nombre");
        System.out.println("4 consultar por documento");
        System.out.println("5. modificar");
        System.out.println("6. salir");
        opc = x.nextInt();
        while (this.opc <= 0 || this.opc>6){
            System.out.println("ingrese una opcion valida");
            System.out.println("1. agregar");
            System.out.println("2. mostrar los datos");
            System.out.println("3. consultar por nombre");
            System.out.println("4 consultar por documento");
            System.out.println("5. modificar");
            System.out.println("6. salir");
            this.opc = x.nextInt();
        }
        return this.opc;
    }
    public void conectar(){
        controladormodulo3 control = new controladormodulo3();
        control.control3();
    }

    public void imprimir(String datos){
        System.out.println(datos);
    }

}
