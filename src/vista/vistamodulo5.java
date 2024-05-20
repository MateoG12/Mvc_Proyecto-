package vista;

import controlador.controladormodulo5;

import java.util.Scanner;

public class vistamodulo5 {
    public  String dato;
    public int dato2;
    public int opc;
    Scanner x = new Scanner(System.in);
    public String capturarmateriales(){
        System.out.println("Por favor ingrese el material ");
        this.dato = x.next();
        return this.dato;
    }
    public int capturarcantidad(){
        System.out.println("Por favor ingrese la cantidad ");
        this.dato2 = x.nextInt();
        return this.dato2;
    }

    public int menu(){
        System.out.println("Modulo 5");
        System.out.println("1. agregar material");
        System.out.println("2. mostrar material ");
        System.out.println("3. consultar por nombre");
        System.out.println("4. eliminar ");
        System.out.println("5. modificar");
        System.out.println("6. salir");
        this.opc = x.nextInt();
        while (this.opc <= 0 || this.opc>6){
            System.out.println("ingrese una opcion valida");
            System.out.println("1. agregar");
            System.out.println("2. mostrar base datos");
            System.out.println("3. consultar por nombre");
            System.out.println("4. eliminar");
            System.out.println("5. modificar");
            System.out.println("6. salir");
            this.opc = x.nextInt();
        }
        return this.opc;
    }
    public void conectar5(){
        controladormodulo5 control5 = new controladormodulo5();
        control5.control2();
    }

    public void imprimir(String datos5){
        System.out.println(datos5);

    }
}
