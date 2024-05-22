package modelo;

import java.util.ArrayList;

public class bdmodulo7 {
    public ArrayList<modulo7> BaseDatos7 = new ArrayList<>();

    public bdmodulo7(){
        BaseDatos7.add(new modulo7("Nuestro equipo tiene el mejor rendimiento de funza ","29 de juli 2024","el dia 21 de octubre tedremos nuestro primer encuentro de la temporada","se abren nuevas inscripciones para la sub-12 "));
    }
    public void agregarnoticia(modulo7 Noticias){
        BaseDatos7.add(Noticias);

    }

    public String mostrarenoticias(){
        String datos7 = "";
        for (modulo7 m7 : BaseDatos7){
            datos7 += m7.toString();
        }return datos7;
    }

    public  String consulta(String novedades){
        String lista7 = "";
        for(modulo7 m7 : BaseDatos7){
            if(m7.getNovedades().equals(novedades))
                lista7 += m7.toString();
        }
        return lista7;
    }

    public String modificarnoticias(String Noticias, modulo7 nuevanoticia){
        for(int i = 0 ; i <BaseDatos7.size();i++){
            modulo7 m7 = BaseDatos7.get(i);
            if (m7.getNoticias().equals(Noticias)){
                BaseDatos7.set(i,nuevanoticia);
                return  "se modifico la materia";
            }
        }
        return "no se pudo modificar";
        }

        public String eliminarnoticia(String Noticias){
        ArrayList<modulo7>copiaBaseDatos7 = new ArrayList<>(BaseDatos7);
        for(modulo7 m7 : copiaBaseDatos7){
            if(m7.getNoticias().equals(Noticias)){
                BaseDatos7.remove(m7);
                return "el dato se elimino correctamente";
            }

        }
        return "el dato no se pudo eliminar";

        }

    public ArrayList<modulo7> getBaseDatos7() {return BaseDatos7;}

    public void setBaseDatos7(ArrayList<modulo7> baseDatos7) {
        BaseDatos7 = baseDatos7;

    }
    @Override
    public String toString() {
        return "bd_modulo7{" +
                "BaseDatos7=" + BaseDatos7 +
                '}';
    }

    public String modificarnoticias(String ntmodificar, String nuevacnt, String nuevacn, String nng, String fcn) {
        return ntmodificar;
    }
}
