package main.java.ejemplos;

import java.awt.HeadlessException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class CapturaDatos {
    public static void main(String[] args) {
        
        Scanner sc = null;
        try {
            sc = new Scanner(System.in);            
            System.out.println("Introduce tu nombre");
            //Por linea de comandos
            String nombre=sc.nextLine();  
            System.out.println("Bienvenido "+nombre);
            
            //Por ventana
            String nombrePanel=JOptionPane.showInputDialog(null, 
                    "Teclea tu nombre", 
                    "Captura entrada", 
                    JOptionPane.INFORMATION_MESSAGE); 
            
            JOptionPane.showConfirmDialog(null, "Bienvenido "+nombrePanel);
        } catch (HeadlessException e) {
            // TODO Auto-generated catch block
            System.out.println("Error en  CapturaDatos: "+ e.getMessage());
        }finally{
            if (sc!=null){
                sc.close();
            }          
        }
        
    }

}
