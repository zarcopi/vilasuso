package main.java.ejemplos.Hilos;

public class SupermercadoRunnable implements Runnable{
    
    private Cliente cliente;
    private Cajera cajera;
    private long initialTime;
    
    public SupermercadoRunnable (Cliente cliente, Cajera cajera, long initialTime){
        this.cajera = cajera;
        this.cliente = cliente;
        this.initialTime = initialTime;
    }

    public static void main(String[] args) {
        
        Cliente cliente1 = new Cliente("Cliente 1", new int[] { 2, 2, 1, 5, 2, 3 });
        Cliente cliente2 = new Cliente("Cliente 2", new int[] { 1, 3, 5, 1, 1 });
        
        Cajera cajera1 = new Cajera("Cajera 1");
        Cajera cajera2 = new Cajera("Cajera 2");
        
        // Tiempo inicial de referencia
        long initialTime = System.currentTimeMillis();
        
        Runnable proceso1 = new SupermercadoRunnable(cliente1, cajera1, initialTime);
        Runnable proceso2 = new SupermercadoRunnable(cliente2, cajera2, initialTime);
        
       new Thread(proceso1).start();
       new Thread(proceso2).start();
       
       
        
       System.out.println("Acabaron los dos ");
     

    }

    @Override
    public void run() {
        this.cajera.procesarCompra(this.cliente, this.initialTime);
    }

}

