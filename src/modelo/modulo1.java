package modelo;

public class modulo1 {
    private String Nombre;
    private String Apellidos;
    private int Edad;
    private String Tipo;
    private  int Documento;
    private String Rol;

    public modulo1(){

    }

    public modulo1(String nombre, String apellidos, int edad, String tipo, int documento, String rol) {
        Nombre = nombre;
        Apellidos = apellidos;
        Edad = edad;
        Tipo = tipo;
        Documento = documento;
        Rol = rol;
    }



    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public int getDocumento() {
        return Documento;
    }

    public void setDocumento(int documento) {
        Documento = documento;
    }

    public String getRol() {
        return Rol;
    }

    public void setRol(String rol) {
        Rol = rol;
    }

    @Override
    public String toString() {
        return "\n------------------------" +
                "\n Nombre=" + Nombre +
                "\n Apellidos=" + Apellidos +
                "\n Edad=" + Edad +
                "\n Tipo=" + Tipo +
                "\n Documento=" + Documento +
                "\n Rol=" + Rol +
                '\n';
    }
}
