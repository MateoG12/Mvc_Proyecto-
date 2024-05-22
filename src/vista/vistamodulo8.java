package vista;

import controlador.controladormodulo8;

import java.util.Scanner;

public class vistamodulo8 {
    private Scanner scanner = new Scanner(System.in);

    public String capturarDato(String mensaje) {
        System.out.println(mensaje);
        return scanner.next();
    }

    public int menu() {
        System.out.println("Modulo 8 - Gestión de Equipos");
        System.out.println("1. Agregar ");
        System.out.println("2. Mostrar todos los jugadores");
        System.out.println("3. Consultar  por documento");
        System.out.println("4. Consultar  por categoría");
        System.out.println("5. Consultar  por entrenador");
        System.out.println("6. Salir");
        return scanner.nextInt();
    }

    public void conectar() {
        controladormodulo8 controlador = new controladormodulo8();
        controlador.control();
    }

    public void imprimir(String mensaje) {
        System.out.println(mensaje);
    }
}
