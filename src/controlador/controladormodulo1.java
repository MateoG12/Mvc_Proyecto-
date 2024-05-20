package controlador;

import modelo.bdmodulo1;
import modelo.modulo1;
import vista.vistamodulo1;

public class controladormodulo1 {
    bdmodulo1 bd = new bdmodulo1();

    // Instancia de la clase vistaadministrador
    vistamodulo1 v = new vistamodulo1();

    public void control(){
        int op = 0;
        boolean control = true;
        while (control){
            op = v.menu();
            switch (op){
                case 1:
                    String nombre, apellidos, tipo, rol;
                    int edad, documento;
                    //Capturar los datos de personal
                    nombre = v.capturarnombre();
                    apellidos = v.capturarapellidos();
                    edad = v.capturaredad();
                    tipo = v.capturartipodocumento();
                    documento = v.capturarnumerodocumento();
                    rol = v.capturarrol();
                    // Creacion de un nuevo objeto 'personal' con los datos capturados
                    modulo1 p = new modulo1(nombre, apellidos, edad, tipo, documento, rol);
                    bd.agregarpersonal(p);
                    v.imprimir(bd.getBaseDatos().toString());
                    break;

                case 2:
                    v.imprimir(bd.mostrarlista());//llamar al metodo para mostar base de datos
                    break;

                case 3:
                    String buscarNombre = v.capturarnombre();//capturar el nombre del registro a consultar
                    v.imprimir(bd.consulta(buscarNombre));//llamar al metodo que se consulta
                    break;

                case 4:
                    String eliminarnombre = v.capturarnombre(); //capturar el nombre del registro a eliminar
                    v.imprimir(bd.eliminar(eliminarnombre));//llamar al metodo eliminado
                    break;

                case 5: // modificar un registro
                    String nombreModificar = v.capturarnombre(); //captura el nombre del registro a modificar
                    String nuevoNombre = v.capturarnombre(); //captura los nuevos datos
                    String nuevosApellidos = v.capturarapellidos();
                    int nuevaEdad = v.capturaredad();
                    String nuevoTipo = v.capturartipodocumento();
                    int nuevoDocumento = v.capturarnumerodocumento();
                    String nuevoRol = v.capturarrol();
                    modulo1 nuevoPersonal = new modulo1(nuevoNombre, nuevosApellidos, nuevaEdad, nuevoTipo, nuevoDocumento, nuevoRol);
                    v.imprimir(bd.modificar(nombreModificar, nuevoPersonal)); //Llama al método modificar
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