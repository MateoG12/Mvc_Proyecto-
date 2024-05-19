package modelo;

import java.util.ArrayList;

public class bdmodulo2 {
    public ArrayList<modulo2>base_datos_fechas=new ArrayList<>();

    public bdmodulo2(){base_datos_fechas.add(new modulo2("convocatoria1","19/05/2024","Partido1","19/05/2024","Entrenamiento1","18/05/2024"));}
    public void agregarfechas(modulo2 Modulo2){base_datos_fechas.add(Modulo2);}

    public String mostrarlista(){
        String datos= "";
        for (modulo2 m :base_datos_fechas){
            datos+=m.toString();
        }return  datos;
    }
    public String consulta(String convocatorias){
        String lista="";
        for (modulo2 m : base_datos_fechas){
            if(m.getConvocatorias().equals(convocatorias))
                lista+=m.toString();
        }
        return lista;
    }
    public String eliminar(String convocatiorias){
        ArrayList<modulo2> copiaBaseDatos = new ArrayList<>(base_datos_fechas);
        for (modulo2 m :copiaBaseDatos){
            if (m.getConvocatorias().equals(convocatiorias)){
                base_datos_fechas.remove(m);
                return "Eliminar";
            }
        }
        return "No Eliminado";
    }
    public String modificar(String convocatoria, modulo2 nuevomodulo2) {
        for (int i = 0; i < base_datos_fechas.size(); i++) {
            modulo2 m = base_datos_fechas.get(i);
            if (m.getConvocatorias().equals(convocatoria)) {
                base_datos_fechas.set(i, nuevomodulo2);
                return "Modificado";
            }
        }
        return "No modificado";
    }
    public ArrayList<modulo2> getBase_datos_fechas() {
        return base_datos_fechas;
    }

    public void setBase_datos_fechas(ArrayList<modulo2> base_datos_fechas) {
        this.base_datos_fechas = base_datos_fechas;
    }

    @Override
    public String toString() {
        return "bdmodulo2{" +
                "base_datos_fechas=" + base_datos_fechas +
                '}';
    }
}