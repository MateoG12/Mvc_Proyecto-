package modelo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class bdmodulo1 {
    private HashMap<Integer, modulo1> baseDatos;

    public bdmodulo1() {
        baseDatos = new HashMap<>();
        baseDatos.put(123456789, new modulo1("sara", "gonzales", 16, "cc", 123456789, "administrador","usuario","contraseña"));
        baseDatos.put(1234567890, new modulo1("sara", "gonzales", 16, "cc", 1234567890, "administrador","usuario1","contraseña1"));
        this.escribirjson();
    }

    public String agregarpersonal(int documento,modulo1 personal) {
        this.leerjson();
        for (modulo1 p :baseDatos.values()){
            if(p.getDocumento()!=documento){
                baseDatos.put(personal.getDocumento(),personal);
                this.escribirjson();
                return "Agregado satisfactoriamente";
            }
        }return "El Documento no se puede repetir ";

    }
    public modulo1 validarLogin(String usuario, String contrasena) {
        this.leerjson();
        for (modulo1 p : baseDatos.values()) {
            if (p.getUsuario().equals(usuario) && p.getPassword().equals(contrasena)) {
                return p;
            }
        }
        return null;
    }

    public String mostrarlista() {
        this.leerjson();
        String datos = "";
        for (modulo1 p : baseDatos.values()) {
            datos += p.toString() + "\n";
            this.escribirjson();
        }
        return datos;
    }

    public String consulta(String nombre) {
        this.leerjson();
        String lista = "";
        for (modulo1 p : baseDatos.values()) {
            if (p.getNombre().equals(nombre)) {
                lista += p.toString() + "\n";
                this.escribirjson();
                return lista;
            }
        }
        return "El nombre no existe ";
    }

    public String consultadocumento(int documento) {
        this.leerjson();
        String lista = "";
        for (modulo1 p : baseDatos.values()) {
            if (p.getDocumento()==documento) {
                lista += p.toString() + "\n";
                this.escribirjson();
                return lista;
            }
        }
        return "El documento no existe ";
    }

    public String modificar(int documento, modulo1 nuevoPersonal) {
        this.leerjson();
        if (baseDatos.containsKey(documento)) {
            baseDatos.put(documento, nuevoPersonal);
            this.escribirjson();
            return "Modificado";
        }
        return "No modificado";
    }

    public String eliminar(int documento) {
        this.leerjson();
        if (baseDatos.remove(documento) != null) {
            this.escribirjson();
            return "Eliminado";
        }
        return "No eliminado";
    }

    public HashMap<Integer, modulo1> getBaseDatos() {
        return baseDatos;
    }

    public void setBaseDatos(HashMap<Integer, modulo1> baseDatos) {
        this.baseDatos = baseDatos;
        this.escribirjson();
    }

    public void escribirjson(){
        Gson gson =new GsonBuilder().setPrettyPrinting().create();
        String jsonString =gson.toJson(baseDatos);
        try(FileWriter writer =new FileWriter("modulo1.json")){
            writer.write(jsonString);
        }catch (IOException e ){
            e.printStackTrace();
        }
    }
    public void leerjson(){
        String JsonString="";
        try(FileReader reader=new FileReader("modulo1.json")){
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
        baseDatos=gson.fromJson(JsonString,new TypeToken<HashMap<Integer,modulo1>>() {}.getType());
    }
    @Override
    public String toString() {
        return "bdmodulo1{" +
                "baseDatos=" + baseDatos +
                '}';
    }
}