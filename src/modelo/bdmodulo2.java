package modelo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
public class bdmodulo2 {
    public HashMap<String,modulo2>base_datos_fechas;

    public bdmodulo2(){
        base_datos_fechas=new HashMap<>();
        base_datos_fechas.put("convocatoria1", new modulo2("convocatoria1","19/05/2024","partido1","19/05/2024","entrenamiento1","18/05/2024"));
        this.escribirjson();
    }

    public String agregarfechas(String convocatoria, modulo2 Modulo2){
        this.leerjson();
        for(modulo2 m:base_datos_fechas.values()){
            if(m.getConvocatorias().equals(convocatoria)){
                return "La convocatoria no se puede repetir";
            }else{
                base_datos_fechas.put(Modulo2.getConvocatorias(),Modulo2);
                this.escribirjson();
            }
        }
        return "Agregado satisfactoriamente" ;

    }

    public String mostrarlista(){
        this.leerjson();
        String datos= "";
        for (modulo2 m :base_datos_fechas.values()){
            datos+=m.toString();
            this.escribirjson();
        }
        return  datos;
    }
    public String consultaconvocatoria(String convocatorias){
        this.leerjson();
        String lista="";
        for (modulo2 m : base_datos_fechas.values()){
            if(m.getConvocatorias().equals(convocatorias)){
                lista+=m.toString();
                this.escribirjson();
                return lista;
            }
        }
       return "La convocatoria no existe";
    }
    public String consultapartidos(String partidos){
        this.leerjson();
        String lista="";
        for (modulo2 m : base_datos_fechas.values()) {
            if (m.getPartidos().equals(partidos)) {
                lista += m.toString();
                this.escribirjson();
                return lista;
            }
        }
        return "El partido digitado no existe";
    }
    public String consultaentrenamiento(String entrenamiento){
        String lista="";
        this.leerjson();
        for (modulo2 m : base_datos_fechas.values()){
            if(m.getEntrenamiento().equals(entrenamiento)){
                lista+=m.toString();
                this.escribirjson();
                return lista;
        }
        }
        return "El entrenamiento a consultar no exite ";
    }
    public String eliminar(String convocatiorias){
        this.leerjson();
        for (modulo2 m :base_datos_fechas.values()){
            if (m.getConvocatorias().equals(convocatiorias)){
                base_datos_fechas.remove(convocatiorias);
                this.escribirjson();
                return "Eliminar";
            }
        }
        return "No Eliminado";
    }
    public String modificar(String convocatoria, modulo2 nuevomodulo2) {
            this.leerjson();
            if (base_datos_fechas.containsKey(convocatoria)) {
                base_datos_fechas.put(convocatoria, nuevomodulo2);
                this.escribirjson();
                return "Modificado";

            }
        return "No modificado";
    }
    public HashMap<String, modulo2> getBase_datos_fechas() {
        return base_datos_fechas;
    }

    public void setBase_datos_fechas(HashMap<String,modulo2> base_datos_fechas) {
        this.base_datos_fechas = base_datos_fechas;
    }
    public void escribirjson(){
        Gson gson =new GsonBuilder().setPrettyPrinting().create();
        String jsonString =gson.toJson(base_datos_fechas);
        try(FileWriter writer =new FileWriter("modulo2.json")){
            writer.write(jsonString);
        }catch (IOException e ){
            e.printStackTrace();
        }
    }
    public void leerjson(){
        String JsonString="";
        try(FileReader reader=new FileReader("modulo2.json")){
            StringBuilder builder=new StringBuilder();
            int ch;
            while((ch= reader.read()) != -1){
                builder.append((char)ch);
            }
            JsonString= builder.toString();
        }catch (IOException e){
            e.printStackTrace();
        }
        Gson gson=new GsonBuilder().setPrettyPrinting().create();
        base_datos_fechas=gson.fromJson(JsonString,new TypeToken<HashMap<String,modulo2>>() {}.getType());
    }

    @Override
    public String toString() {
        return "bdmodulo2{" +
                "base_datos_fechas=" + base_datos_fechas +
                '}';
    }
}