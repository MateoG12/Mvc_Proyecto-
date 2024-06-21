package vista;

import controlador.controladormodulo3;

import javax.swing.*;
import java.util.Scanner;

public class vistamodulo3 {
    public String dato;
    public int dato2;
    public int opc;
    Scanner x =new Scanner(System.in);
    public String capturarnombre(){
        dato= JOptionPane.showInputDialog("por favor ingrese su nombre");
        return this.dato;
    }
    public int capturarnumerodocumento() {
        dato2=Integer.parseInt(JOptionPane.showInputDialog("por favor ingrese el numero de su documento"));
        while (this.dato2 <= 0) {
            dato2=Integer.parseInt(JOptionPane.showInputDialog("documento invalido\ningrese su documento"));
        }
        return this.dato2;
    }
    public String capturarcategoria(){
        dato= JOptionPane.showInputDialog("por favor ingrese su categoria \n ej: sub 15 , sub 17 , sub 20").toLowerCase();
        return this.dato;
    }
    public int capturarpagosfaltantes() {
        dato2=Integer.parseInt(JOptionPane.showInputDialog("por favor ingrese el los dias que faltan de el pago "));
        while (this.dato2 < 0) {
            dato2=Integer.parseInt(JOptionPane.showInputDialog("documento invalido\ningrese su documento"));
        }
        return this.dato2;
    }
    public int menu(){
        JOptionPane.showMessageDialog(null, "MODULO 3 ");
        opc = Integer.parseInt(JOptionPane.showInputDialog("1. agregar\n2. mostrar los datos\n3. consultar por nombre\n4 consultar por documento\n5. modificar\n6. salir"));
        while (this.opc <= 0 || this.opc>6){
            opc = Integer.parseInt(JOptionPane.showInputDialog("1. agregar\n2. mostrar los datos\n3. consultar por nombre\n4 consultar por documento\n5. modificar\n6. salir"));
        }
        return this.opc;
    }
    public void conectar(){
        controladormodulo3 control = new controladormodulo3();
        control.control3();
    }

    public void imprimir(String datos){
        JOptionPane.showMessageDialog(null, datos);
    }

}
