/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author prueba
 */
public class Conexion {
    
    //static es una palabra reservada que determina que el atributo es de la clase y no del objeto
    //final es un modificador que indica que el atributo es una constante por lo que no se le podra cambiar el valor de ningun modo
    private static final String URL = "jdbc:mysql://127.0.0.1:33065/clientes?zeroDateTimeBehavior=CONVERT_TO_NULL";
    
    private static final String USUARIO = "root", PASSWORD = "";
    
   
    
    //throws SQL exeption es el try y el catch implementado en un metodo
    public static Connection getConnetion() throws SQLException{
        
        return DriverManager.getConnection(URL,USUARIO,PASSWORD);
    }
    
    //polimorfismo
    public static void close(Connection conexion) throws SQLException{
        conexion.close();
    }
    
    //polimosfirmo
    public static void close(Connection conexion,Statement declaracion, ResultSet resultado) throws SQLException{
        conexion.close();
        declaracion.close();
        resultado.close();
    }
    
    public static void close(Connection conexion,Statement declaracion) throws SQLException{
        conexion.close();
        declaracion.close();
    }
    
    
    //polimosfirmo
    public static void close(Statement declaracion, ResultSet resultado) throws SQLException{
        
        declaracion.close();
        resultado.close();
    }

   
   
}

