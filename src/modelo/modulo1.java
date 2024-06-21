package modelo;

public class modulo1 {
    public String Nombre;
    public String Apellidos;
    public int Edad;
    public String Tipo;
    public  int Documento;
    public String Rol;
    private String Usuario;
    private String Password;

    public modulo1(){

    }

    public modulo1(String nombre,String apellidos,int edad, String tipo, int documento, String rol,String usuario,String password) {
        Nombre = nombre;
        Documento = documento;
        Rol = rol;
        Usuario = usuario;
        Tipo = tipo;
        Edad = edad;
        Apellidos = apellidos;
        Password = password;
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

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String usuario) {
        Usuario = usuario;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
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
                "\n Usuario=" + Usuario +
                "\n Contraseña=" + Password +
                '\n';
    }
}
