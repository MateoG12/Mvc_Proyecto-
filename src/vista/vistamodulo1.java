package vista;

import controlador.controladormodulo1;

import java.util.Scanner;

public class vistamodulo1 {
    public  String dato;
    public int dato2;
    public int opc;
    Scanner x = new Scanner(System.in);
    public String capturarnombre(){
        System.out.println("por favor ingrese su nombre");
        this.dato = x.next();
        return this.dato;
    }
    public String capturarapellidos(){
        System.out.println("por favor ingrese sus apellidos");
        this.dato = x.next();
        return this.dato;
    }
    public int capturaredad(){
        System.out.println("por favor ingrese su edad");
        this.dato2 = x.nextInt();
        while (this.dato2 <= 0 || this.dato2 >= 100){
            System.out.println("la edad es invalida ");
            System.out.println("ingrese su edad");
            this.dato2 = x.nextInt();
        }
        return  this.dato2;
    }

    public String capturartipodocumento(){
        System.out.println("por favor ingrese su tipo documento");
        this.dato = x.next();
        return this.dato;
    }

    public int capturarnumerodocumento(){
        System.out.println("por favor ingrese el numero de su documento");
        this.dato2 = x.nextInt();
        while (this.dato2 <= 0){
            System.out.println("documento invalido");
            System.out.println("ingrese su documento");
            this.dato2 = x.nextInt();
        }
        return  this.dato2;
    }

    public String capturarrol(){
        System.out.println("por favor ingrese su rol");
        this.dato = x.next().toLowerCase();
        while (!(this.dato.equals("administrador"))){
            System.out.println("rol invalido");
            System.out.println("ingrese su rol");
            this.dato2 = x.nextInt();
        }
        return this.dato;
    }


    public int menu(){
        System.out.println("MODULO 1 ");
        System.out.println("1. agregar");
        System.out.println("2. mostrar base datos");
        System.out.println("3. consultar por nombre");
        System.out.println("4. consultar por documento");
        System.out.println("5. eliminar");
        System.out.println("6. modificar");
        System.out.println("7. salir");
        opc = x.nextInt();
        while (this.opc <= 0 || this.opc>7){
            System.out.println("ingrese una opcion valida");
            System.out.println("1. agregar");
            System.out.println("2. mostrar base datos");
            System.out.println("3. consultar por nombre");
            System.out.println("4. consultar por nombre");
            System.out.println("5. eliminar");
            System.out.println("6. modificar");
            System.out.println("7. salir");
            this.opc = x.nextInt();
        }
        return this.opc;
    }

    public void conectar(){
        controladormodulo1 control = new controladormodulo1();
        control.control();
    }

    public void imprimir(String datos){
        System.out.println(datos);
    }
}
