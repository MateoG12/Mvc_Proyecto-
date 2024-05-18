package controlador;

import modelo.bdpersonal;
import modelo.personal;
import vista.vistaadministrador;

public class controladoradministrador {
    bdpersonal bd = new bdpersonal();
    vistaadministrador v = new vistaadministrador();

    public void control(){
        int op = 0;
        boolean control = true;
        while (control){
            op = v.menu();
            switch (op){
                case 1:
                    String nombre, apellidos, tipo, rol;
                    int edad, documento;
                    nombre = v.capturarnombre();
                    apellidos = v.capturarapellidos();
                    edad = v.capturaredad();
                    tipo = v.capturartipodocumento();
                    documento = v.capturarnumerodocumento();
                    rol = v.capturarrol();
                    personal p = new personal(nombre, apellidos, edad, tipo, documento, rol);
                    bd.agregarpersonal(p);
                    v.imprimir(bd.getBaseDatos().toString());
                    break;

                case 2:
                    v.imprimir(bd.mostrarlista());
                    break;

                case 3:
                    String buscarNombre = v.capturarnombre();
                    v.imprimir(bd.consulta(buscarNombre));
                    break;

                case 4:
                    String eliminarnombre = v.capturarnombre();
                    v.imprimir(bd.eliminar(eliminarnombre));
                    break;

                case 5: // modificar un registro
                    String nombreModificar = v.capturarnombre(); // Captura el nombre del registro a modificar
                    String nuevoNombre = v.capturarnombre(); // Captura los nuevos datos
                    String nuevosApellidos = v.capturarapellidos();
                    int nuevaEdad = v.capturaredad();
                    String nuevoTipo = v.capturartipodocumento();
                    int nuevoDocumento = v.capturarnumerodocumento();
                    String nuevoRol = v.capturarrol();
                    personal nuevoPersonal = new personal(nuevoNombre, nuevosApellidos, nuevaEdad, nuevoTipo, nuevoDocumento, nuevoRol);
                    v.imprimir(bd.modificar(nombreModificar, nuevoPersonal)); // Llama al método modificar
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