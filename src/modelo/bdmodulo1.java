package modelo;

import java.util.ArrayList;

public class bdmodulo1 {
    public ArrayList<modulo1> baseDatos = new ArrayList<>();

    public bdmodulo1(){
        baseDatos.add(new modulo1("sara","gonzales",16,"cc",107456742,"administrador"));
    }


    public void agregarpersonal(modulo1 Personal){
        baseDatos.add(Personal);
    }

    public String mostrarlista() {
        String datos = "";
        for (modulo1 p : baseDatos) {
            datos += p.toString();
        }return datos;
    }

    public String consulta(String nombre){
        String lista = "";
        for(modulo1 p : baseDatos){
            if(p.getNombre().equals(nombre) )
                lista+=p.toString();
        }
        return lista;
    }
    public String consultadocumento(int documento){
        String lista = "";
        for(modulo1 p : baseDatos){
            if(p.getDocumento()==documento)
                lista+=p.toString();
        }
        return lista;
    }
    public String modificar(String nombre, modulo1 nuevoPersonal) {
        for (int i = 0; i < baseDatos.size(); i++) {
            modulo1 p = baseDatos.get(i);
            if (p.getNombre().equals(nombre)) {
                baseDatos.set(i, nuevoPersonal);
                return "Modificado";
            }
        }
        return "No modificado";
    }


    public String eliminar(String nombre) {
        ArrayList<modulo1> copiaBaseDatos = new ArrayList<>(baseDatos);
        for (modulo1 p : copiaBaseDatos) {
            if (p.getNombre().equals(nombre)) {
                baseDatos.remove(p);
                return "Eliminado";
            }
        }
        return "No eliminado";
    }


    public ArrayList<modulo1> getBaseDatos() {
        return baseDatos;
    }

    public void setBaseDatos(ArrayList<modulo1> baseDatos) {
        this.baseDatos = baseDatos;
    }

    @Override
    public String toString() {
        return "bdpersonal{" +
                "baseDatos=" + baseDatos +
                '}';
    }
} 
