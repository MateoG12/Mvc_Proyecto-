package controlador;

import modelo.bdmodulo7;
import  modelo.modulo7;
import modelo.modulo7;
import vista.vistamodulo7;

public class controladormodulo7 {

    bdmodulo7 bd7 = new bdmodulo7();
    vistamodulo7 v7 = new vistamodulo7();

    public void control2() {
        int op=0;
        boolean control2=true;
        while(control2){
            op= v7.menu7();
            switch (op){
                case 1 :
                    String info1,info2,info3,info4;

                    info1=v7.capturarnoticia();
                    info2 =v7.capturarimportancia();
                    info3=v7.capturarnovedades();
                    info4=v7.capturarfecha();
                    modulo7 m7 =new modulo7(info1,info2,info3,info4);
                    bd7.agregarnoticia(m7);
                    v7.imprimir(bd7.getBaseDatos7().toString());
                    break;
                case  2:
                    v7.imprimir(bd7.mostrarenoticias());
                    break;
                case 3 :
                    String buscarnt = v7.capturarfecha();
                    v7.imprimir(bd7.consulta(buscarnt));
                    break;
                case 4 :
                    String eliminarnt = v7.capturarfecha();
                    v7.imprimir(bd7.eliminarnoticia(eliminarnt));
                    break;

                case 5:
                    String ntmodificar = v7.capturarfecha();
                    String nuevacnt = v7.capturarnoticia();
                    String nuevacn = v7.capturarimportancia();
                    String  nng= v7.capturarnovedades();
                    String fcn= v7.capturarfecha();

                    modulo7 nuevant = new modulo7(ntmodificar,nuevacnt,nuevacn,nng,fcn);
                    v7.imprimir(bd7.modificarnoticias(ntmodificar,nuevacnt,nuevacn,nng,fcn));
                    break;

                case 6:
                    control2=false;
                    break;

                default:
                    v7.imprimir("no existe esa opcion digite una valida");
                    break;
            }
        }

    }
}
