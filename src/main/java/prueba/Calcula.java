package main.java.prueba;

import java.awt.HeadlessException;
import java.util.Scanner;


public class Calcula {

	public static void main(String[] args) {
		
		Scanner sc = null;
		
		
        try {
            sc = new Scanner(System.in);            
            System.out.println("Introduce un numero");
            //Por linea de comandos
            String nombre=sc.nextLine();  
            
            
            
            System.out.println("El numero escogido es "+nombre);
            Integer numeroEntero = Integer.valueOf(nombre);
            
            
            

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
