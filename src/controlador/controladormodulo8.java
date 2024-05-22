
package controlador;

import modelo.bdmodulo8;
import modelo.modulo8;
import vista.vistamodulo8;

public class controladormodulo8 {
    private bdmodulo8 bd8 = new bdmodulo8();
    private vistamodulo8 vista8 = new vistamodulo8();

    public void control() {
        boolean continuar = true;
        while (continuar) {
            int opcion = vista8.menu();
            switch (opcion) {
                case 1:
                    String nombre = vista8.capturarDato("Ingrese el nombre del jugador");
                    String categoria = vista8.capturarDato("Ingrese la categoría");
                    String documento = vista8.capturarDato("Ingrese el documento");
                    String posicion = vista8.capturarDato("Ingrese la posición");
                    String entrenador = vista8.capturarDato("Ingrese el nombre del entrenador");
                    modulo8 nuevoEquipo = new modulo8(nombre, categoria, documento, posicion, entrenador);
                    bd8.agregarEquipo(nuevoEquipo);
                    vista8.imprimir("se agrego el jugador correctamente");
                    break;
                case 2:
                    vista8.imprimir(bd8.mostrarEquipos());
                    break;
                case 3:
                    String docConsulta = vista8.capturarDato("ingrese el numero de documento");
                    vista8.imprimir(bd8.consultarPorDocumento(docConsulta));
                    break;
                case 4:
                    String catConsulta = vista8.capturarDato("ingrese la categoria:");
                    vista8.imprimir(bd8.consultarPorCategoria(catConsulta));
                    break;
                case 5:
                    String entrenadorConsulta = vista8.capturarDato("ingrese el nombre del entrenador");
                    vista8.imprimir(bd8.consultarPorEntrenador(entrenadorConsulta));
                    break;
                case 6:
                    continuar = false;
                    break;
                default:
                    vista8.imprimir("opcion invalida, ingrese de nuevo la opcion");
                    break;
            }
        }
    }
}
