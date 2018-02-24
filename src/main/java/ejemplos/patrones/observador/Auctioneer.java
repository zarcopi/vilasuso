package main.java.ejemplos.patrones.observador;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

import main.java.ejemplos.patrones.observador.patron.Event;
import main.java.ejemplos.patrones.observador.patron.Observer;
import main.java.ejemplos.patrones.observador.patron.Subject;

public class Auctioneer extends Subject{

    private final HashMap<String, LinkedList<Observer>> observers;

    public Auctioneer(){
        this.observers = new HashMap();
    }

    private LinkedList<Observer> getList(String subasta) {
        if (!this.observers.containsKey(subasta)) {
            this.observers.put(subasta, new LinkedList<Observer>());
        }
        return this.observers.get(subasta);
    }

    @Override
    public void attach(String subasta, Observer newObserver) {
        getList(subasta).add(newObserver);
    }

    @Override
    public void detach(String subasta, Observer observer) {
        getList(subasta).remove(observer);
    }

    @Override
    public void notifyObserver(String subasta, Event event) {
        if (this.observers.containsKey(subasta)){
            Iterator<Observer> iterator = this.observers.get(subasta).iterator();
            while(iterator.hasNext()){
                iterator.next().update(event);
            }
        }
    }

}