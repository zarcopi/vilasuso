package main.java.ejemplos.Hilos;

public class Cliente {   

    private String nombre;
    private int[] carroCompra;
    
    public Cliente(String nombre, int[] carroCompra){
        this.nombre = nombre;
        this.carroCompra = carroCompra;        
    }

    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int[] getCarroCompra() {
        return this.carroCompra;
    }
    public void setCarroCompra(int[] carroCompra) {
        this.carroCompra = carroCompra;
    }
}
