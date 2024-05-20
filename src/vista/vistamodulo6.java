
package vista;

import controlador.controladormodulo6;
import java.util.Scanner;

public class vistamodulo6 {

    public int dato2;
    public int opc;
    public String dato1;
    Scanner x = new Scanner(System.in);

    public String capturardato(String ccambiar) {
        System.out.println("Ingrese " + ccambiar + ":");
        return x.nextLine();
    }

    public int capturardatoEntero(String ccambiar) {
        while (true) {
            try {
                System.out.println("Ingrese " + ccambiar + ":");
                int dato = x.nextInt();
                x.nextLine();
                if (dato > 0) {
                    return dato;
                } else {
                    System.out.println("El " + ccambiar + " debe ser mayor que 0. Inténtelo de nuevo.");
                }
            } catch (Exception e) {
                System.out.println("Por favor, ingrese un número válido para " + ccambiar + ".");
                x.nextLine();
            }
        }
    }

    public int menu() {
        System.out.println("1) Agregar personal");
        System.out.println("2) Mostrar personal");
        System.out.println("3) Consultar por tipo de documento");
        System.out.println("4) Consultar por categoría");
        System.out.println("5) Consultar por documento");
        System.out.println("6) Eliminar persona");
        System.out.println("7) Editar persona");
        System.out.println("8) Salir");
        try {
            opc = x.nextInt();
            x.nextLine();
            while (opc <= 0 || opc > 8) {
                System.out.println("Opción inválida. Inténtelo de nuevo.");
                opc = x.nextInt();
                x.nextLine();
            }
        } catch (Exception e) {
            System.out.println("La opción es inválida.");
            opc = 0;
            x.nextLine();
        }
        return opc;
    }

    public void conectar() {
        controladormodulo6 control = new controladormodulo6();
        control.control();
    }

    public void imprimir(String datos) {
        System.out.println(datos);
    }
}

