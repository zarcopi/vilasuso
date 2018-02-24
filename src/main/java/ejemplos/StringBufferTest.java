package main.java.ejemplos;

import java.sql.Timestamp;
import java.util.Date;

public class StringBufferTest {
    
    public static void main(String[] args) {
        Date sDate = new Date();
        long sTime = sDate.getTime();
        System.out.println("Start Time for StringBuffer: " + new Timestamp(sTime));
        //Definir un StringBuffer
        //buble de 5000 iteraciones que añada un caracter al StringBuffer en cada iteracion
        Date eDate = new Date();
        long eTime = eDate.getTime();
        System.out.println("End Time for StringBuffer: " + new Timestamp(eTime));
        System.out.println("Time taken to Execute StringBuffer process " + (eTime-sTime) + "ms");
        System.out.println("=====================================================================");
        Date strDate = new Date();
        long strTime = strDate.getTime();
        System.out.println("Start Time for String: " + new Timestamp(strTime));        
        //Definir un String
        //buble de 5000 iteraciones que añada un caracter al StringBuffer en cada iteracion
        Date eStrDate = new Date();
        long eStrTime = eStrDate.getTime();
        System.out.println("End Time for String: " + new Timestamp(eStrTime));
        System.out.println("Time taken to Execute String process " + (eStrTime-strTime) + "ms");
    }

}
