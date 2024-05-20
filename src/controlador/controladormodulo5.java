package controlador;


import modelo.bdmodulo5;
import modelo.modulo5;
import vista.vistamodulo5;

public class controladormodulo5 {
    bdmodulo5 bd5 = new bdmodulo5();
    vistamodulo5 v5 = new vistamodulo5();

    public void control2(){
        int op = 0;
        boolean control2 = true;

        while (control2){
            op = v5.menu();
            switch (op){
                case 1:
                    String materiales;
                    int cantidad;
                    materiales = v5.capturarmateriales();
                    cantidad = v5.capturarcantidad();

                    modulo5  m5 = new modulo5(materiales,cantidad);
                    bd5.agregarmateriales(m5);
                    v5.imprimir(bd5.getBaseDatos5().toString());
                    break;
                case 2:
                    v5.imprimir((bd5.mostrarmateriales()));
                    break;
                case 3:
                    String buscarmateriales = v5.capturarmateriales();
                    v5.imprimir(bd5.consultamateriales(buscarmateriales));
                    break;
                case 4:
                    String eliminarmateriales = v5.capturarmateriales();
                    v5.imprimir(bd5.eliminarmaterial(eliminarmateriales));
                    break;
                case 5:
                    String materialmodificar = v5.capturarmateriales();
                    String nuevomaterial = v5.capturarmateriales();
                    int nuevacantidad = v5.capturarcantidad();

                    modulo5 nuevosmateriales = new modulo5(nuevomaterial,nuevacantidad);
                    v5.imprimir(bd5.modificarmateriales(materialmodificar,nuevosmateriales));
                    break;
                case 6:
                    control2 = false;
                    break;
                default:
                    v5.imprimir("no existe esa opcion digite de nuevo");
                    break;
            }
        }
    }


}