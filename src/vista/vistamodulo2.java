package vista;

import controlador.controladormodulo2;

import javax.swing.*;
import java.util.Scanner;

public class vistamodulo2 {
    public String dato;
    public int opc;

    Scanner x = new Scanner(System.in);
    public String capturarconvocatoria(){
        dato= JOptionPane.showInputDialog("Porfavor ingrese la convocatoria ");
        return this.dato;
    }
    public String capturarfechaconvocatoria(){
        dato= JOptionPane.showInputDialog("Porfavor ingrese  la fecha de  convocatoria ");
        return this.dato;
    }
    public String capturarpartidos(){
        dato= JOptionPane.showInputDialog("Porfavor ingrese el partido ");
        return this.dato;
    }
    public String capturarfechapartidos(){
        dato= JOptionPane.showInputDialog("Porfavor ingrese la fecha de partido ");
        return this.dato;
    }
    public String capturarentrenamiento(){
        dato= JOptionPane.showInputDialog("Porfavor ingrese el entrenamiento  ");
        return this.dato;
    }

    public String capturarfechaentrenamiento(){
        dato= JOptionPane.showInputDialog("Porfavor ingrese la fecha de entrenamiento ");
        return this.dato;
    }
    public int menu(){
        JOptionPane.showMessageDialog(null, "MODULO 2 ");
        opc = Integer.parseInt(JOptionPane.showInputDialog("1. agregar\n2. mostrar base datos\n3. consultar por convocatoria\n4. consultar por partido\n5. consultar por entrenamiento\n6. eliminar\n7. modificar\n8. salir" ));
        while (this.opc <= 0 || this.opc>8){
            opc = Integer.parseInt(JOptionPane.showInputDialog("1. agregar\n2. mostrar base datos\n3. consultar por convocatoria\n4. consultar por partido\n5. consultar por entrenamiento\n6. eliminar\n7. modificar\n8. salir" ));
        }
        return this.opc;
    }
    public void conectar2(){
        controladormodulo2 control = new controladormodulo2();
        control.control();
    }

    public void imprimir2(String datos){
        JOptionPane.showMessageDialog(null,datos);
    }
}
