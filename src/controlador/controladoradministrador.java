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
                    String nombre,apellidos,tipo,rol;
                    int edad,documento;
                    nombre = v.capturarnombre();
                    apellidos = v.capturarapellidos();
                    edad = v.capturaredad();
                    tipo = v.capturartipodocumento();
                    documento = v.capturarnumerodocumento();
                    rol = v.capturarrol();
                    personal p = new personal(nombre,apellidos,edad,tipo,documento,rol);
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
            }
        }
    }

}
