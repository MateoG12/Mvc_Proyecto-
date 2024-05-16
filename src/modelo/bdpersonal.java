package modelo;

import java.util.ArrayList;

public class bdpersonal {
    public ArrayList<personal> baseDatos = new ArrayList<>();

    public bdpersonal(){
        baseDatos.add(new personal("jose","gonzales gomez",16,"cc",107456742,"administrador"));
    }


    public void agregarpersonal(personal Personal){
        baseDatos.add(Personal);
    }

    public String mostrarlista() {
        String datos = "";
        for (personal p : baseDatos) {
            datos += p.toString();
        }return datos;
    }

    public String consulta(String nombre){
        String lista = "";
        for(personal p : baseDatos){
            if(p.getNombre().equals(nombre) )
                lista+=p.toString();
        }
        return lista;
    }
    public String modificar(String nombre, personal nuevoDatos){
        for(personal p : baseDatos){
            if(p.getNombre().equals(nombre)){
                p.setApellidos(nuevoDatos.getApellidos());
                p.setEdad(nuevoDatos.getEdad());
                p.setDocumento(nuevoDatos.getDocumento());
                p.setRol(nuevoDatos.getRol());
                return "Modificado";
            }
        }
        return "No encontrado";
    }

    public String eliminar(String nombre) {
        ArrayList<personal> copiaBaseDatos = new ArrayList<>(baseDatos);
        for (personal p : copiaBaseDatos) {
            if (p.getNombre().equals(nombre)) {
                baseDatos.remove(p);
                return "Eliminado";
            }
        }
        return "No eliminado";
    }


    public ArrayList<personal> getBaseDatos() {
        return baseDatos;
    }

    public void setBaseDatos(ArrayList<personal> baseDatos) {
        this.baseDatos = baseDatos;
    }

    @Override
    public String toString() {
        return "bdpersonal{" +
                "baseDatos=" + baseDatos +
                '}';
    }
}
