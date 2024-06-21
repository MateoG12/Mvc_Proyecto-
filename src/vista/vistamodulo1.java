package vista;

import controlador.controladormodulo1;

import javax.swing.*;
import java.util.Scanner;

public class vistamodulo1 {
    public  String dato;
    public int dato2;
    public int opc;
    Scanner x = new Scanner(System.in);
    public String capturarnombre(){
        dato= JOptionPane.showInputDialog("por favor ingrese su nombre");
        return this.dato;
    }

    public String capturarapellidos(){
        dato=JOptionPane.showInputDialog("por favor ingrese sus apellidos");
        return this.dato;
    }
    public int capturaredad(){
        dato2=Integer.parseInt(JOptionPane.showInputDialog("por favor ingrese su edad"));
        while (dato2 <= 0 || dato2 >= 100){
            dato2=Integer.parseInt(JOptionPane.showInputDialog("la edad es invalida\ningrese su edad "));
        }
        return  this.dato2;
    }

    public String capturartipodocumento(){
        dato=JOptionPane.showInputDialog("por favor ingrese su tipo documento");
        return this.dato;
    }

    public int capturarnumerodocumento(){
        dato2=Integer.parseInt(JOptionPane.showInputDialog("por favor ingrese el numero de su documento"));
        while (dato2 <= 0){
            dato2=Integer.parseInt(JOptionPane.showInputDialog("documento invalido\ningrese su documento"));
        }
        return  this.dato2;
    }

    public String capturarrol() {
        dato = JOptionPane.showInputDialog("Por favor ingrese su rol").toLowerCase();
        while (!dato.equals("administrador")) {
            JOptionPane.showMessageDialog(null, "Rol inválido. Por favor ingrese su rol nuevamente:");
            dato = JOptionPane.showInputDialog("Por favor ingrese su rol").toLowerCase();
        }
        return dato;
    }
    public String capturarusuario(){
        JOptionPane.showMessageDialog(null,"BIENVENIDO");
        dato=JOptionPane.showInputDialog("Por favor ingrese un usuario");
        return this.dato;
    }

    public String capturarpassword(){
        dato=JOptionPane.showInputDialog("Por favor ingrese su contraseña");
        return this.dato;
    }

    public int menu() {
        JOptionPane.showMessageDialog(null, "MODULO 1 ");
        opc = Integer.parseInt(JOptionPane.showInputDialog("1. agregar\n2. mostrar base datos\n3. consultar por nombre\n4. consultar por documento\n5. eliminar\n6. modificar\n7. salir "));
        while (this.opc <= 0 || this.opc > 7) {
            System.out.println("ingrese una opcion valida");
            opc = Integer.parseInt(JOptionPane.showInputDialog("1. agregar\n2. mostrar base datos\n3. consultar por nombre\n4. consultar por documento\n5. eliminar\n6. modificar\n7. salir "));
        }
    return opc;
    }
    public void mensaje1(){
        JOptionPane.showMessageDialog(null, "Login exitoso. ");
    }
    public void mensaje2(){
        JOptionPane.showMessageDialog(null, "Credenciales incorrectas.  ");
    }

    public void conectar(){
        controladormodulo1 control = new controladormodulo1();
        control.control();
    }

    public void imprimir(String datos){
        JOptionPane.showMessageDialog(null,datos);
    }
}
