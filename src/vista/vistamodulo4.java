package vista;

import controlador.controladormodulo4;

import java.util.Scanner;

public class vistamodulo4 {
    public  String dato;
    public int opc;

    Scanner x = new Scanner(System.in);
    public String capturarinfor(){
        System.out.println("Por favor ingrese la informacion del evento ");
        this.dato = x.next();
        return this.dato;
    }
    public String capturarnombre(){
        System.out.println("ingrese el nombre del evento");
        this.dato = x.next();
        return this.dato;
    }
    public String capturarfecha(){
        System.out.println("ingrese la fecha del evento");
        this.dato = x.next();
        return this.dato;
    }
    public String capturarcategoria(){
        System.out.println("ingrese la categoria del evento");
        this.dato = x.next();
        return this.dato;
    }

    public int menu(){
        System.out.println("Modulo 4");
        System.out.println("1. agregar evento");
        System.out.println("2. mostrar eventos ");
        System.out.println("3. consultar por categoria");
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
    public void conectar4(){
        controladormodulo4 control4 = new controladormodulo4();
        control4.control();
    }

    public void imprimir(String datos4){
        System.out.println(datos4);
    }
}
