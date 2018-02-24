package main.java.ejemplos.herencia;

class Calculation {
    int z;
    String variable_clase = "Calculation";
     
    Calculation(String nombre){
        this.variable_clase = nombre;        
    }
    
    Calculation(){    
    }
    
    public void addition(int x, int y) {
       z = x + y;
       System.out.println("The sum of the given numbers:"+z);
    }
     
    public void Subtraction(int x, int y) {
       z = x - y;
       System.out.println("The difference between the given numbers:"+z);
    }
 }
