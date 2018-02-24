package main.java.ejemplos.patrones.observador.patron;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Event {

    private String objeto;
    private String puja;

    public Event(){}

    public Event(String objeto, String puja){
        this.setObjeto(objeto);
        this.setPuja(puja);
    }

    public String getObjeto() {
        return objeto;
    }

    public void setObjeto(String objeto) {
        this.objeto = objeto;
    }

    public String getPuja() {
        return puja;
    }

    public void setPuja(String puja) {
        this.puja = puja;
    }

}
