package modelo;

import java.util.ArrayList;

public class bdmodulo4 {
    public ArrayList<modulo4> baseDatos4 = new ArrayList<>();
    public bdmodulo4(){
        baseDatos4.add(new modulo4("partido contra pepe","partido","23 de abril","juvenil" ));
    }


    public void Agregarfecha(modulo4 eventos){
        baseDatos4.add(eventos);
    }

    public  String mostrareventos(){
        String datos = "";
        for (modulo4 m4 : baseDatos4){
            datos += m4.toString();
        }return datos;
    }

    public String consulta(String categoria){
        String lista = "";
        for(modulo4 m4 : baseDatos4){
            if (m4.getCategoria().equals(categoria))
                lista += m4.toString();
        }
        return lista;
    }

    public String modificar(String fecha, modulo4 nuevafecha){
        for(int i = 0; i<baseDatos4.size();i++){
            modulo4 m4 = baseDatos4.get(i);
            if(m4.getFecha().equals(fecha)){
                baseDatos4.set(i,nuevafecha);
                return "la fecha se modifico";
            }
        }
        return "no se pudo modificar";
    }

    public String eliminar(String fecha){
        ArrayList<modulo4> copia4BaseDatos = new ArrayList<>(baseDatos4);
        for (modulo4 m4: copia4BaseDatos){
            if (m4.getFecha().equals(fecha)){
                baseDatos4.remove(m4);
                return "se elimino ";
            }
        }
        return "no se elimino";
    }

    public ArrayList<modulo4> getBaseDatos4(){
        return baseDatos4;
    }

    public void setBaseDatos4(ArrayList<modulo4> baseDatos4) {
        this.baseDatos4 = baseDatos4;
    }

    @Override
    public String toString() {
        return "bdmodulo4{" +
                "baseDatos4=" + baseDatos4 +
                '}';
    }
}
