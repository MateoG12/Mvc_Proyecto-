package controlador;

import modelo.bdmodulo1;
import modelo.modulo1;
import vista.vistamodulo1;

public class controladorlogin {
    vistamodulo1 v = new vistamodulo1();
    bdmodulo1 bd = new bdmodulo1();
    private modulo1 usuarioActual = null;

    public modulo1 control() {
        String usuario = v.capturarusuario();
        String contrasena = v.capturarpassword();
        usuarioActual = validarLogin(usuario, contrasena);
        return usuarioActual;
    }

    public modulo1 validarLogin(String usuario, String contrasena) {
        return bd.validarLogin(usuario, contrasena);
    }

}