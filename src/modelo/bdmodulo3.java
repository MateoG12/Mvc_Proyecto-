package modelo;

import java.util.ArrayList;

public class bdmodulo3 {
    public ArrayList<modulo3> baseDatos3 = new ArrayList<>();

    public bdmodulo3(){baseDatos3.add(new modulo3("juan",1028481120,"sub 15",1));}
    public void agregardatos(modulo3 Modulo3){baseDatos3.add(Modulo3);}

    public String mostrarlista() {
        String datos = "";
        for (modulo3 t : baseDatos3) {
            datos += t.toString();
        }return datos;
    }
    public String consultanombre(String nombre){
        String lista = "";
        for(modulo3 t : baseDatos3){
            if(t.getNombre().equals(nombre) )
                lista+=t.toString();
        }
        return lista;
    }
    public String consultardocumento(int documento){
        String lista = "";
        for(modulo3 t : baseDatos3){
            if(t.getDocumento()==documento )
                lista+=t.toString();
        }
        return lista;
    }
    public String modificar(int documento, modulo3 nuevoPersonal) {
        for (int i = 0; i < baseDatos3.size(); i++) {
            modulo3 t = baseDatos3.get(i);
            if (t.getDocumento()==documento) {
                baseDatos3.set(i, nuevoPersonal);
                return "Modificado";
            }
        }
        return "No modificado";
    }

    public ArrayList<modulo3> getBaseDatos3() {
        return baseDatos3;
    }

    public void setBaseDatos3(ArrayList<modulo3> baseDatos3) {
        this.baseDatos3 = baseDatos3;
    }
    @Override
    public String toString() {
        return "bdpersonal{" +
                "baseDatos=" + baseDatos3 +
                '}';
    }
}
