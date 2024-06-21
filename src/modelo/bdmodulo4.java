package modelo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class bdmodulo4 {
    public HashMap<String,modulo4>baseDatos4;
    public bdmodulo4(){
        baseDatos4=new HashMap<>();
        baseDatos4.put("partido",new modulo4("partido contra pepe","partido","23 de abril","juvenil" ));
        this.escribirjson();
    }

    public void Agregarfecha(String nombre,modulo4 eventos){
        this.leerjson();
        baseDatos4.put(nombre,eventos);
        this.escribirjson();
    }

    public  String mostrareventos(){
        this.leerjson();
        String datos = "";
        for (modulo4 m4 : baseDatos4.values()){
            datos += m4.toString();
        }return datos;
    }

    public String consulta(String categoria){
        this.leerjson();
        String lista = "";
        for(modulo4 m4 : baseDatos4.values()){
            if (m4.getCategoria().equals(categoria))
                lista += m4.toString();

        }return lista;
    }
    public String consultanombre(String nombre){
        this.leerjson();
        String lista = "";
        for(modulo4 m4 : baseDatos4.values()){
            if (m4.getNombre().equals(nombre))
                lista += m4.toString();

        }return lista;
    }
    public String consultafecha(String fecha){
        this.leerjson();
        String lista = "";
        for(modulo4 m4 : baseDatos4.values()){
            if (m4.getFecha().equals(fecha))
                lista += m4.toString();

        }return lista;
    }

    public String modificar(String nombre ,modulo4 nuevafecha){
        this.leerjson();
            if(baseDatos4.containsKey(nombre)){
                baseDatos4.put(nombre,nuevafecha);
                this.escribirjson();
                return "la fecha se modifico";
            }
        return "no se pudo modificar";
    }

    public String eliminar(String nombre){
        this.leerjson();
        for (modulo4 m4: baseDatos4.values()){
            if (m4.getNombre().equals(nombre)){
                baseDatos4.remove(nombre);
                this.escribirjson();
                return "se elimino ";
            }
        }
        return "no se elimino";
    }

    public HashMap<String, modulo4> getBaseDatos4() {
        return baseDatos4;
    }

    public void setBaseDatos4(HashMap<String, modulo4> baseDatos4) {
        this.baseDatos4 = baseDatos4;
    }

    public void escribirjson(){
        Gson gson =new GsonBuilder().setPrettyPrinting().create();
        String jsonString =gson.toJson(baseDatos4);
        try(FileWriter writer =new FileWriter("modulo4.json")){
            writer.write(jsonString);
        }catch (IOException e ){
            e.printStackTrace();
        }
    }
    public void leerjson(){
        String JsonString="";
        try(FileReader reader=new FileReader("modulo4.json")){
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
        baseDatos4=gson.fromJson(JsonString,new TypeToken<HashMap<String,modulo4>>() {}.getType());
    }

    @Override
    public String toString() {
        return "bdmodulo4{" +
                "baseDatos4=" + baseDatos4 +
                '}';
    }
}
