
import java.sql.*;
import java.util.Scanner;
import Usuarios.Usuarios;
import DaoUsuario.DaoUsuario;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prueba
 */
public class Eliminar {
    
    public static void main(String[] args) throws SQLException {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese id de tupla a eliminar: ");
        int id = scanner.nextInt();
        
        Usuarios usuario = new Usuarios(id);
        
        DaoUsuario.eliminar(usuario);
        
        
        /*
        String url = "jdbc:mysql://127.0.0.1:33065/usuario?zeroDateTimeBehavior=CONVERT_TO_NULL";
        
        try{
            Connection conexion = DriverManager.getConnection(url,"root","");
            
            String sql = "DELETE FROM usuario WHERE id =?";
            
            PreparedStatement declaracion = conexion.prepareStatement(sql);
            
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese id de tupla a eliminar: ");
            int id = scanner.nextInt();
            
            declaracion.setInt(1, id);
            
            declaracion.executeUpdate();
            
            System.out.println("Tupla eliminada");
            
            declaracion.close();
            conexion.close();
        
        
        }catch(SQLException ex){
            ex.printStackTrace(System.out);
        }
        
*/
    }
    
}

    
