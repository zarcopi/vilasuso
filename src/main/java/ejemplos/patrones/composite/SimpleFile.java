package main.java.ejemplos.patrones.composite;

public class SimpleFile extends File {

    public SimpleFile(String name) {
        this.name = name;
    }

    @Override
    public void showInfo() {
        System.out.print(identado.toString() + "-Simple File: " + getName() + "\n");
    }
}
