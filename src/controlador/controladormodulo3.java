package controlador;

import modelo.bdmodulo3;
import modelo.modulo3;
import vista.vistamodulo3;

public class controladormodulo3 {
    bdmodulo3 bd3=new bdmodulo3();
    vistamodulo3 v = new vistamodulo3();
    public void control3(){
        int op = 0;
        boolean control = true;
        while (control){
            op = v.menu();
            switch (op){
                case 1:
                    String nombre,categoria;
                    int  documento,diafaltante;
                    nombre = v.capturarnombre();
                    categoria = v.capturarcategoria();
                    documento = v.capturarnumerodocumento();
                    diafaltante = v.capturarpagosfaltantes();
                    modulo3 t = new modulo3(nombre, documento,categoria,diafaltante);
                    bd3.agregardatos(documento,t);
                    v.imprimir(bd3.getBaseDatos3().toString());
                    break;
                case 2:
                    v.imprimir(bd3.mostrarlista());//llamar al metodo para mostar base de datos
                    break;
                case 3:
                    String buscarNombre = v.capturarnombre();//capturar el nombre del registro a consultar
                    v.imprimir(bd3.consultanombre(buscarNombre));//llamar al metodo que se consulta
                    break;
                case 4:
                    int buscardocumento = v.capturarnumerodocumento();//capturar el nombre del registro a consultar
                    v.imprimir(bd3.consultardocumento(buscardocumento));//llamar al metodo que se consulta
                    break;

                case 5: // modificar un registro
                    int numeroModificar = v.capturarnumerodocumento(); //captura el nombre del registro a modificar
                    String nuevoNombre = v.capturarnombre(); //captura los nuevos datos
                    String nuevoscategoria = v.capturarcategoria();
                    int nuevadocumento = v.capturarnumerodocumento();
                    int nuevofaltante = v.capturarpagosfaltantes();
                    modulo3 nuevoPersonal = new modulo3(nuevoNombre,nuevadocumento,nuevoscategoria,nuevofaltante);
                    v.imprimir(bd3.modificar(numeroModificar, nuevoPersonal)); //Llama al método modificar
                    break;

                case 6:
                    control = false;
                    break;

                default:
                    v.imprimir("Opción no válida, por favor intente nuevamente.");
                    break;
            }
        }
    }
}
