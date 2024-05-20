package controlador;

import modelo.bdmodulo6;
import modelo.modulo6;
import vista.vistamodulo6;

public class controladormodulo6 {

    bdmodulo6 bd = new bdmodulo6();
    vistamodulo6 v = new vistamodulo6();

    public void control() {
        int op = 0;
        boolean control = true;
        while (control) {
            op = v.menu();
            switch (op) {
                case 1:
                    agregarPersona();
                    break;
                case 2:
                    mostrarPersonas();
                    break;
                case 3:
                    consultarPorTipoDocumento();
                    break;
                case 4:
                    consultarPorCategoria();
                    break;
                case 5:
                    consultarPorDocumento();
                    break;
                case 6:
                    eliminarPersona();
                    break;
                case 7:
                    editarPersona();
                    break;
                case 8:
                    control = false;
                    break;
                default:
                    System.out.println("Opción inválida. Inténtelo de nuevo.");
                    break;
            }
        }
    }

    private void agregarPersona() {
        String n, a, td, c;
        int doc;
        n = v.capturardato("nombre");
        a = v.capturardato("apellido");
        td = v.capturardato("tipo de documento");
        doc = v.capturardatoEntero("documento");
        c = v.capturardato("categoria");
        modulo6 nuevamodulo6 = new modulo6(n, a, td, doc, c);
        bd.agregarpersona(nuevamodulo6);
    }

    private void mostrarPersonas() {
        v.imprimir(bd.mostrarlistatipo(bd.getBaseDatos()));
    }

    private void consultarPorTipoDocumento() {
        String tipoDoc = v.capturardato("tipo de documento");
        v.imprimir(bd.consultatipo(tipoDoc));
    }

    private void consultarPorCategoria() {
        String categoria = v.capturardato("categoria");
        v.imprimir(bd.consultacategoria(categoria));
    }

    private void consultarPorDocumento() {
        int documento = v.capturardatoEntero("documento");
        v.imprimir(bd.consultadoc(documento));
    }

    private void eliminarPersona() {
        int documento = v.capturardatoEntero("documento");
        bd.eliminarpersona(documento);
    }

    private void editarPersona() {
        int documento = v.capturardatoEntero("documento");
        String ccambiar = v.capturardato("ingrese el nombre del dato a editar");
        String vnuevo = v.capturardato("nuevo valor");
        bd.editarpersona(documento, ccambiar, vnuevo);
    }
}

