/*
 * ConeionBD.java
 *
 * Created on 5 de octubre de 2004, 17:21
 */

//package src.conexion;

package main.java.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD
{


    public ConexionBD()
    {
    }

    public Connection getConnection(String user, String pwd)    
    {
        return this.getConnectionMySQL(user, pwd);
    }

    private Connection getConnectionMySQL(String user, String pwd)
    {
        Connection conexionBD = null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conexionBD = DriverManager.getConnection("jdbc:mysql://192.168.0.68:3306/test.java?user="+user+"&password="+pwd);
            conexionBD.setAutoCommit(false);
            return conexionBD;
        }
        catch(SQLException sqle)
        {
            System.out.println("SQLException: " + sqle.getMessage());
            System.out.println("SQLState: " + sqle.getSQLState());
            System.out.println("VendorError: " + sqle.getErrorCode());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return conexionBD;
    } 

}