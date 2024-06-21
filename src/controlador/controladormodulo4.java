package controlador;

import modelo.bdmodulo4;
import modelo.modulo4;
import vista.vistamodulo4;

public class controladormodulo4 {
    bdmodulo4 bd4 = new bdmodulo4();

    vistamodulo4 v4 = new vistamodulo4();
    public void control(){
        int op = 0;
        boolean control4 = true;

        while (control4){
            op = v4.menu();
            switch (op){
                case 1:
                    String infor, nombre,fecha,categoria;
                    infor = v4.capturarinfor();
                    nombre = v4.capturarnombre();
                    fecha = v4.capturarfecha();
                    categoria = v4.capturarcategoria();
                    modulo4 m4 = new modulo4(infor, nombre, fecha, categoria);
                    bd4.Agregarfecha(nombre,m4);
                    v4.imprimir(bd4.getBaseDatos4().toString());
                    break;
                case 2:
                    v4.imprimir((bd4.mostrareventos()));
                    break;
                case 3:
                    String buscarevento = v4.capturarcategoria();
                    v4.imprimir(bd4.consulta(buscarevento));
                    break;
                case 4:
                    String buscarfecha = v4.capturarfecha();
                    v4.imprimir(bd4.consultafecha(buscarfecha));
                    break;
                case 5:
                    String buscarnombre = v4.capturarnombre();
                    v4.imprimir(bd4.consultanombre(buscarnombre));
                    break;
                case 6:
                    String eliminarevento = v4.capturarnombre();
                    v4.imprimir(bd4.eliminar(eliminarevento));
                    break;
                case 7:
                    String fechamodificar = v4.capturarfecha();
                    String modificarinfor = v4.capturarinfor();
                    String modificarnombre = v4.capturarnombre();
                    String modificarfecha = v4.capturarfecha();
                    String modificarcategoria = v4.capturarcategoria();
                    modulo4 nuevafecha = new modulo4(modificarinfor,modificarnombre,modificarfecha,modificarcategoria);
                    v4.imprimir(bd4.modificar(modificarnombre,nuevafecha));
                    break;
                case 8:
                    control4 = false;
                    break;
                default:
                    v4.imprimir("no existe esa opcion digite de nuevo");
                    break;
            }
        }
    }
}
