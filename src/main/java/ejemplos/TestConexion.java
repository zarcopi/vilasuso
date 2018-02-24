
package main.java.ejemplos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import main.java.utils.ConexionBD;

public class TestConexion{
    
    private static String user = "test.java";
    private static String pwd  = "test.java";

    
    public static void main(String[] args) {
            
    try { 
    ConexionBD con = new ConexionBD();
    
    Connection conexionBD = con.getConnection(user, pwd);
    
    Statement stmt = conexionBD.createStatement();
    
    testSelect(stmt); 

    stmt.close();
    conexionBD.close();
    
    } catch (SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    
    System.out.println("Conexion cerrada");
  }
    
    
    
    private static void testSelect(Statement stmt)
        throws SQLException{
        System.out.println("----->Metodo testSelect<------------");
        ResultSet rs = stmt.executeQuery("select * from  cursojava.departamento");

        String formatoFila = "%7s %7s %n";
        System.out.printf( formatoFila, "idDep", "descripcion");
        while(rs.next())
        {
            Integer idDep = rs.getInt("idDep");
            String descripcion = rs.getString("descripcion");
            System.out.printf( formatoFila, idDep, descripcion);
        }       
        rs.close();
    }
    
 
    
}