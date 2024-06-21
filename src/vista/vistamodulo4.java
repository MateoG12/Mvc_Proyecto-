package vista;

import controlador.controladormodulo4;

import javax.swing.*;
import java.util.Scanner;

public class vistamodulo4 {
    public  String dato;
    public int opc;

    Scanner x = new Scanner(System.in);
    public String capturarinfor(){
        dato= JOptionPane.showInputDialog("Por favor ingrese la informacion del evento ");
        return this.dato;
    }
    public String capturarnombre(){
        dato=JOptionPane.showInputDialog("ingrese el nombre del evento");
        return this.dato;
    }
    public String capturarfecha(){
        dato=JOptionPane.showInputDialog("ingrese la fecha del evento");
        return this.dato;
    }
    public String capturarcategoria(){
        dato=JOptionPane.showInputDialog("ingrese la categoria del evento");
        return this.dato;
    }

    public int menu(){
        JOptionPane.showMessageDialog(null,"Modulo 4");
        opc= Integer.parseInt(JOptionPane.showInputDialog("1. agregar evento\n2. mostrar eventos\n3. consultar por categoria\n4. consulta por fecha\n5. consulta por nombre\n6. eliminar\n7. modificar\n8. salir"));
        while (this.opc <= 0 || this.opc>8){
            opc= Integer.parseInt(JOptionPane.showInputDialog("1. agregar evento\n2. mostrar eventos\n3. consultar por categoria\n4. consulta por fecha\n5. consulta por nombre\n6. eliminar\n7. modificar\n8. salir"));
        }
        return this.opc;
    }
    public void conectar4(){
        controladormodulo4 control4 = new controladormodulo4();
        control4.control();
    }

    public void imprimir(String datos4){
        JOptionPane.showMessageDialog(null,datos4);
    }
}
