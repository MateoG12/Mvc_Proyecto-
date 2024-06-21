package controlador;

import modelo.bdmodulo1;
import modelo.modulo1;
import vista.vistamodulo1;

public class controladormodulo1 {
    vistamodulo1 v = new vistamodulo1();
    bdmodulo1 bd = new bdmodulo1();

    public void control() {
        int opc = 0;
        boolean control = true;
        while (control) {
            opc = v.menu();
            switch (opc) {
                case 1:
                    String nombre, apellidos, tipo, rol,usuario,password;
                    int edad, documento;
                    // Capturar los datos de personal
                    nombre = v.capturarnombre();
                    apellidos = v.capturarapellidos();
                    edad = v.capturaredad();
                    tipo = v.capturartipodocumento();
                    documento = v.capturarnumerodocumento();
                    rol = v.capturarrol();
                    usuario=v.capturarusuario();
                    password=v.capturarpassword();
                    // Creacion de un nuevo objeto 'personal' con los datos capturados
                    modulo1 p = new modulo1(nombre, apellidos, edad, tipo, documento, rol ,usuario,password);
                    bd.agregarpersonal(documento,p);
                    v.imprimir(bd.getBaseDatos().toString());
                    break;

                case 2:
                    v.imprimir(bd.mostrarlista()); // Llamar al metodo para mostrar base de datos
                    break;

                case 3:
                    String buscarNombre = v.capturarnombre(); // Capturar el nombre del registro a consultar
                    v.imprimir(bd.consulta(buscarNombre)); // Llamar al metodo que se consulta
                    break;

                case 4:
                    int buscarDocumento = v.capturarnumerodocumento(); // Capturar el nombre del registro a consultar
                    v.imprimir(bd.consultadocumento(buscarDocumento)); // Llamar al metodo que se consulta
                    break;

                case 5:
                    int eliminarDocumento = v.capturarnumerodocumento(); // Capturar el documento del registro a eliminar
                    v.imprimir(bd.eliminar(eliminarDocumento)); // Llamar al metodo eliminado
                    break;
                case 6: // Modificar un registro
                    int documentoModificar = v.capturarnumerodocumento(); // Captura el documento del registro a modificar
                    String nuevoNombre = v.capturarnombre(); // Captura los nuevos datos
                    String nuevosApellidos = v.capturarapellidos();
                    int nuevaEdad = v.capturaredad();
                    String nuevoTipo = v.capturartipodocumento();
                    int nuevoDocumento = v.capturarnumerodocumento();
                    String nuevoRol = v.capturarrol();
                    String nuevoUsuario= v.capturarusuario();
                    String nuevoPassword=v.capturarpassword();
                    modulo1 nuevoPersonal = new modulo1(nuevoNombre, nuevosApellidos, nuevaEdad, nuevoTipo, nuevoDocumento, nuevoRol,nuevoUsuario,nuevoPassword);
                    v.imprimir(bd.modificar(documentoModificar, nuevoPersonal)); // Llama al método modificar
                    break;
                case 7 :
                    control=false;
                    break;
                default:
                    v.imprimir("Opción no válida, por favor intente nuevamente.");
                    break;
            }
        }
    }
}