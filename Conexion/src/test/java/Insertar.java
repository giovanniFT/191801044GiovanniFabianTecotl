
import java.sql.*;
import java.util.Scanner;
import java.util.*;
import DaoUsuario.DaoUsuario;
import Usuarios.Usuarios;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prueba
 */
public class Insertar {
    
    public static void main(String[] args) throws SQLException {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese usuario:");
        String usuario = scanner.nextLine();
              
        System.out.println("ingrese contraseña");
        String contraseña = scanner.nextLine();
        
        Usuarios usua = new Usuarios(usuario, contraseña);
        
        DaoUsuario.insertar(usua);
        
        
        System.out.println(usua);
        
        
        
        
        /*
        String url = "jdbc:mysql://127.0.0.1:33065/usuario?zeroDateTimeBehavior=CONVERT_TO_NULL";
        try{
            //crear conexion con base de datos
            Connection conexion = DriverManager.getConnection(url,"root","");
            
            //crear una declaracion de como se va a trabajar con la base de datos
           
            String SQL = "INSERT INTO usuario(nombre_usuario,contraseña,status) VALUES (?,?,?)";
            
              PreparedStatement declaracion = conexion.prepareStatement(SQL);
             
              
              Scanner scanner = new Scanner(System.in);
      
              System.out.println("ingrese usuario:");
              String usuario = scanner.nextLine();
              
              System.out.println("ingrese contraseña");
              String contraseña = scanner.nextLine();
          
              
              declaracion.setString(1,usuario);
              declaracion.setString(2,contraseña);
              declaracion.setInt(3, 1);    
              
              // variable que recibira el resultado de ejecutar la secuencia SQL
              declaracion.executeUpdate();
          
            
            //cerrar toda conexion
            //resultado.close();
            declaracion.close();
            conexion.close();
            
            
            
                    
            
        }catch(SQLException ex){
            ex.printStackTrace(System.out);
        }
        */
    }
    
}
