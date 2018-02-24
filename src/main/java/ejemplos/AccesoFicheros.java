package main.java.ejemplos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AccesoFicheros {
    public static void main(String[] args) throws IOException {

        String[] lineas = { "Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "..." };

        // Fichero del que querem     os leer
        File ficheroLectura = new File("src/main/resources/fichero_leer.txt");
        Scanner s = null;

        try {
            // Leemos el contenido del fichero
            System.out.println("... Leemos el contenido del fichero ...");
            s = new Scanner(ficheroLectura);

            // Leemos linea a linea el fichero
            while (s.hasNextLine()) {
                String linea = s.nextLine();    // Guardamos la linea en un String
                System.out.println(linea);      // Imprimimos la linea
            }

        } catch (Exception ex) {
            System.out.println("Mensaje: " + ex.getMessage());
        } finally {
            // Cerramos el fichero tanto si la lectura ha sido correcta o no
            try {
                if (s != null)
                    s.close();
            } catch (Exception ex2) {
                System.out.println("Mensaje 2: " + ex2.getMessage());
            }
        }
        
        
        /** Escribe a fichero **/
        FileWriter fichero = null;
        try {            

            fichero = new FileWriter("src/main/resources/fichero_escribir.txt");

            // Escribimos linea a linea en el fichero
            System.out.println("... Escribimos en el fichero ...");
            for (String linea : lineas) {
                fichero.write(linea + "\n");
            }
            System.out.println("... Escritura completada ...");
            fichero.close();

        } catch (Exception ex) {
            System.out.println("Mensaje de la excepción: " + ex.getMessage());
        } finally{
            if (fichero != null){
                fichero.close();
            }
            
        }
    }
}


