package main.java.ejemplos.patrones.observador;

import main.java.ejemplos.patrones.observador.patron.Event;
import main.java.ejemplos.patrones.observador.patron.Observer;

public class Bidder implements Observer {


    
    private String nombreBidder;

    @Override
    public void update(Event event) {
        System.out.println(nombreBidder + " recibe alerta. " + 
            "Nueva puja por: " +  event.getObjeto() +
             ", Detalle puja: " + event.getPuja());
    }
    
    public Bidder(String nombre){
        this.nombreBidder = nombre;
    }
}
