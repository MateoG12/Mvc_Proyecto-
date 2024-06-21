package controlador;

import modelo.bdmodulo2;
import modelo.modulo2;
import vista.vistamodulo2;

public class controladormodulo2 {
    bdmodulo2 bd2 = new bdmodulo2();
    vistamodulo2 v2 = new vistamodulo2();

    public void control() {
        int opc = 0;
        boolean control = true;
        while (control) {
            opc = v2.menu();
            switch (opc) {
                case 1:
                    String convocatoria = v2.capturarconvocatoria();
                    String fechaconvocatoria = v2.capturarfechaconvocatoria();
                    String partido = v2.capturarpartidos();
                    String fechapartido = v2.capturarfechapartidos();
                    String entrenamiento = v2.capturarentrenamiento();
                    String fechaentrenamiento = v2.capturarfechaentrenamiento();
                    modulo2 m = new modulo2(convocatoria, fechaconvocatoria, partido, fechapartido, entrenamiento, fechaentrenamiento);
                    v2.imprimir2(bd2.getBase_datos_fechas().toString());
                    bd2.agregarfechas(convocatoria,m);
                    v2.imprimir2(bd2.getBase_datos_fechas().toString());
                    break;
                case 2:
                    v2.imprimir2(bd2.mostrarlista());
                    break;
                case 3:
                    String buscarconvocatoria = v2.capturarconvocatoria();
                    v2.imprimir2(bd2.consultaconvocatoria(buscarconvocatoria));
                    break;
                case 4:
                    String buscarpartido = v2.capturarpartidos();
                    v2.imprimir2(bd2.consultapartidos(buscarpartido));
                    break;
                case 5:
                    String buscarentrenamiento = v2.capturarentrenamiento();
                    v2.imprimir2(bd2.consultaentrenamiento(buscarentrenamiento));
                    break;
                case 6:
                    String eliminarnombre = v2.capturarconvocatoria();
                    v2.imprimir2(bd2.eliminar(eliminarnombre));
                    break;
                case 7:
                    String convocatoriaModificar = v2.capturarconvocatoria();
                    String nuevoconvocatoria = v2.capturarconvocatoria();
                    String nuevosfechaconvocatoria = v2.capturarfechaconvocatoria();
                    String nuevapartido = v2.capturarpartidos();
                    String nuevofechapartido = v2.capturarfechapartidos();
                    String nuevoentrenamiento = v2.capturarentrenamiento();
                    String nuevofechaentrenamiento = v2.capturarfechaentrenamiento();
                    modulo2 nuevoModulo = new modulo2(nuevoconvocatoria, nuevosfechaconvocatoria, nuevapartido, nuevofechapartido, nuevoentrenamiento, nuevofechaentrenamiento);
                    v2.imprimir2(bd2.modificar(convocatoriaModificar, nuevoModulo));
                    break;
                case 8:
                    control = false;
                    break;

                default:
                    v2.imprimir2("Opción no válida, por favor intente nuevamente.");
                    break;
            }
        }
    }
}