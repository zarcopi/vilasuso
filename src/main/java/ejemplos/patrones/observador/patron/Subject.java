package main.java.ejemplos.patrones.observador.patron;


public abstract class Subject {

    public abstract void attach(String subasta, Observer observer);
    public abstract void detach(String subasta, Observer observer);
    public abstract void notifyObserver(String subasta, Event event);

}
