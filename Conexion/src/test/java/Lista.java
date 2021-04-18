
import java.sql.*;
import DaoUsuario.DaoUsuario;
import Usuarios.Usuarios;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prueba
 */
public class Lista {
    
    public static void main(String[] args) throws SQLException{
        
        List<Usuarios> listUsuarios = new ArrayList<>();
        listUsuarios = DaoUsuario.listaUsuarios();
        
        
        for(Usuarios usuario:listUsuarios){
            System.out.println(usuario);
        }
        
        /*
        
            //crear conexion con base de datos
           // Connection conexion = DriverManager.getConnection(url,"root","");
            
            Connection conexion = Conexion.getConnetion();
            
            
            
            //crear una declaracion de como se va a trabajar con la base de datos
            Statement declaracion = (Statement) conexion.createStatement();
            String SQL = "SELECT * FROM usuario";
            
            //variable que recibira el resultado de ejecutar la secuencia de SQL 
            ResultSet resultado = declaracion.executeQuery(SQL);
            
            //imprimir valores
            while(resultado.next()){
                System.out.println(resultado.getInt("id"));
                System.out.println(resultado.getString("nombre_usuario"));
                System.out.println(resultado.getString("contraseña"));
                
            }
            
            //cerrar toda conexion
            Conexion.close(conexion, declaracion, resultado);
            //resultado.close();
            //declaracion.close();
            //conexion.close();
            
            
       */             
     }
}
   
        
    
   
