package modelo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;


public class bdmodulo3 {
    public HashMap<Integer,modulo3> baseDatos3;

    public bdmodulo3(){
        baseDatos3=new HashMap<>();
        baseDatos3.put(1028481120,new modulo3("juan",1028481120,"sub15",1));
        this.escribirjson();
    }


    public String agregardatos(int documento, modulo3 Modulo3){
        this.leerjson();
        if (!baseDatos3.containsKey(documento)) {
            baseDatos3.put(Modulo3.getDocumento(), Modulo3);
            this.escribirjson();
            return "Agregado satisfactoriamente";
        } else {
            return "El Documento no se puede repetir";
        }
    }

    public String mostrarlista() {
        this.leerjson();
        String datos = "";
        for (modulo3 t : baseDatos3.values()) {
            datos += t.toString();
        }return datos;
    }
    public String consultanombre(String nombre){
        this.leerjson();
        String lista = "";
        for(modulo3 t : baseDatos3.values()){
            if(t.getNombre().equals(nombre) )
                lista+=t.toString();
        }
        return lista;
    }
    public String consultardocumento(int documento){
        this.leerjson();
        String lista = "";
        for(modulo3 t : baseDatos3.values()){
            if(t.getDocumento()==documento )
                lista+=t.toString();
        }
        return lista;
    }
    public String modificar(int documento, modulo3 nuevoPersonal) {
        this.leerjson();
        if(baseDatos3.containsKey(documento)){
            baseDatos3.put(documento,nuevoPersonal);
            this.escribirjson();
            return "la fecha se modifico";
        }
        return "No modificado";
    }

    public HashMap<Integer,modulo3> getBaseDatos3() {
        return baseDatos3;
    }

    public void setBaseDatos3(HashMap<Integer,modulo3> baseDatos3) {
        this.baseDatos3 = baseDatos3;
    }

    public void escribirjson(){
        Gson gson =new GsonBuilder().setPrettyPrinting().create();
        String jsonString =gson.toJson(baseDatos3);
        try(FileWriter writer =new FileWriter("modulo3.json")){
            writer.write(jsonString);
        }catch (IOException e ){
            e.printStackTrace();
        }
    }
    public void leerjson(){
        String JsonString="";
        try(FileReader reader=new FileReader("modulo3.json")){
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
        baseDatos3=gson.fromJson(JsonString,new TypeToken<HashMap<Integer,modulo3>>() {}.getType());
    }

    @Override
    public String toString() {
        return "bdpersonal{" +
                "baseDatos=" + baseDatos3 +
                '}';
    }
}
