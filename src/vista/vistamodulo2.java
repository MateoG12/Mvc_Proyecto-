package vista;

import controlador.controladormodulo2;

import java.util.Scanner;

public class vistamodulo2 {
    public String dato;
    public int opc;

    Scanner x = new Scanner(System.in);
    public String capturarconvocatoria(){
        System.out.println("Porfavor ingrese la convocatoria ");
        this.dato=x.next();
        return this.dato;
    }
    public String capturarfechaconvocatoria(){
        System.out.println("Porfavor ingrese  la fecha de  convocatoria ");
        this.dato=x.next();
        return this.dato;
    }
    public String capturarpartidos(){
        System.out.println("Porfavor ingrese el partido ");
        this.dato=x.next();
        return this.dato;
    }
    public String capturarfechapartidos(){
        System.out.println("Porfavor ingrese la fecha de partido ");
        this.dato=x.next();
        return this.dato;
    }
    public String capturarentrenamiento(){
        System.out.println("Porfavor ingrese la  ");
        this.dato=x.next();
        return this.dato;
    }

    public String capturarfechaentrenamiento(){
        System.out.println("Porfavor ingrese la convocatoria ");
        this.dato=x.next();
        return this.dato;
    }
    public int menu(){
        System.out.println("MODULO 2 ");
        System.out.println("1. agregar");
        System.out.println("2. mostrar base datos");
        System.out.println("3. consultar por convocatoria ");
        System.out.println("4. consultar por partido ");
        System.out.println("5. consultar por entrenamiento ");
        System.out.println("6. eliminar");
        System.out.println("7. modificar");
        System.out.println("8. salir");
        opc = x.nextInt();
        while (this.opc <= 0 || this.opc>8){
            System.out.println("ingrese una opcion valida");
            System.out.println("1. agregar");
            System.out.println("2. mostrar base datos");
            System.out.println("3. consultar por convocatoria ");
            System.out.println("4. consultar por partido ");
            System.out.println("5. consultar por entrenamiento ");
            System.out.println("6. eliminar");
            System.out.println("7. modificar");
            System.out.println("8. salir");
            this.opc = x.nextInt();
        }
        return this.opc;
    }
    public void conectar2(){
        controladormodulo2 control = new controladormodulo2();
        control.control();
    }

    public void imprimir2(String datos){
        System.out.println(datos);
    }
}
