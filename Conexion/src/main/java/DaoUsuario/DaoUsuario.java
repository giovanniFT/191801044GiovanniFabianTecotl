/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoUsuario;

import Conexion.Conexion;
import Usuarios.Usuarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author prueba
 */
public class DaoUsuario {
   
    
    private static String SQL;
    
    

    public static List<Usuarios> listaUsuarios() throws SQLException{
        
        List<Usuarios> listUsuarios = new ArrayList<>();
        
        Connection conexion = Conexion.getConnetion();
        
        Statement declaracion = (Statement) conexion.createStatement();
        SQL = "SELECT * FROM usuario";
        
        ResultSet resultado = declaracion.executeQuery(SQL);
        
        
        
        while(resultado.next()){
            
            Usuarios usuario = new Usuarios(resultado.getInt("id"), resultado.getString("nombre_usuario"), resultado.getString("contraseña"), resultado.getString("fecha_de_alta"), resultado.getBoolean("status"));
            
            listUsuarios.add(usuario);
            
            
        }
        
        Conexion.close(conexion, declaracion, resultado);
        
        
        return listUsuarios;
      
    }
    
    
    public static void insertar(Usuarios usuario) throws SQLException{
        
        Connection conexion = Conexion.getConnetion();
        
        SQL = "INSERT INTO usuario(nombre_usuario,contraseña,status) VALUES (?,?,?)";
        PreparedStatement declaracion = conexion.prepareStatement(SQL);
        
        declaracion.setString(1,usuario.getNombre());
        declaracion.setString(2,usuario.getContrasena());
        declaracion.setInt(3, 1);   
        
        declaracion.executeUpdate();
        
        Conexion.close(conexion, declaracion);
 
    }
   
    public static void eliminar(Usuarios usuario) throws SQLException{
        
        Connection conexion = Conexion.getConnetion();
        SQL = "DELETE FROM usuario WHERE id =?";
        PreparedStatement declaracion = conexion.prepareStatement(SQL);
        
        declaracion.setInt(1, usuario.getId());
        declaracion.executeUpdate();
        
        Conexion.close(conexion, declaracion);
        
    }
    
    public static void modificar(Usuarios usuario, int opcion) throws SQLException{
        
        Connection conexion = Conexion.getConnetion();
        
        
        if(opcion == 1){
            String SQL = "UPDATE usuarios SET nombre_usuario = ? WHERE id = ?";
            PreparedStatement declaracion = conexion.prepareStatement(SQL);
            declaracion.setString(1, usuario.getNombre());
            declaracion.setInt(2, usuario.getId());
                
            declaracion.executeUpdate();
            Conexion.close(conexion, declaracion);
            
        }
        
        else if(opcion == 2){
            String SQL = "UPDATE usuarios SET contraseña = ? WHERE id = ?";
            PreparedStatement declaracion = conexion.prepareStatement(SQL);
            declaracion.setString(1, usuario.getContrasena());
            declaracion.setInt(2, usuario.getId());
                
            declaracion.executeUpdate();
            Conexion.close(conexion, declaracion);
        }
        
        
        
        /*  SQL = "UPDATE usuario SET nombre_usuario =? ,contraseña =?,status =? WHERE id =? ";
        PreparedStatement declaracion = conexion.prepareStatement(SQL);
        
        declaracion.setString(1,usuario.getNombre());
        declaracion.setString(2,usuario.getContrasena());
        declaracion.setInt(3, 1);
        declaracion.setInt(4, usuario.getId());
        
        declaracion.executeUpdate();
        
        Conexion.close(conexion, declaracion);   */
        
    }
    
    
}
