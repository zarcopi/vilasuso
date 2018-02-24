package main.java.ejemplos.herencia;

public class My_Calculation extends Calculation {
    
    String variable_clase = "My_Calculation";
    
    public void multiplication(int x, int y) {
       z = x * y;
       System.out.println("The product of the given numbers:"+z);
    }
    
    public void pinta_variable_local(){
        System.out.println("Variable padre: "+super.variable_clase);
        System.out.println("Variable subclase: "+this.variable_clase);
    }
    
    My_Calculation(String nombre){
        super(nombre);
    }
     
    public My_Calculation() {
    }

    public static void main(String args[]) {
       int a = 20, b = 10;
       My_Calculation demo = new My_Calculation();
       demo.addition(a, b);
       demo.Subtraction(a, b);
       demo.multiplication(a, b);
       
       //super vs this
       demo.pinta_variable_local();
       
       //Constructor super clase
       System.out.println("Llamada a constructor super");
       demo = new My_Calculation("Nuevo nombre");
       demo.pinta_variable_local();
       
    }
    
 }
