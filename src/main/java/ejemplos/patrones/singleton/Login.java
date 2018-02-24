package main.java.ejemplos.patrones.singleton;

public class Login {
    
    static Login login;
    private static String sesion;

    private Login () { 
        System.out.println("ejecuta rutina de logeo");
        sesion = "Logeado";
        
    }

    public synchronized static String getSesion(){
        if(login == null){
            login = new Login();
        }else if (sesion ==null){
            login = new Login();
        }
        return sesion;
    }
    
    public synchronized static void closeSesion(){
        if(login == null){
            System.out.println("No se ha hecho login aun");
        }else if (sesion ==null){
            System.out.println("No hay sesion abierta");
        }else{
            sesion = null;
            System.out.println("Sesion cerrada");            
        }
        
        
    }   

}
