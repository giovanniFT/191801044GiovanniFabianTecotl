
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
public class Modificar {
    
    public static void main(String[] args) throws SQLException {
      
        
        Scanner scanner = new Scanner(System.in);
        
        int opcion;
        
        do{
            System.out.println("1- Cambiar nombre de usuario");
            System.out.println("2- Cambiar contraseña");
            System.out.println("\tOpcion:");
            opcion = scanner.nextInt();
        }while(opcion < 1 && opcion > 2);
        
        if(opcion == 1){
            
            System.out.println("Ingrese el ID:");
            int id = scanner.nextInt();
            System.out.println("Ingrese el nombre:");
            scanner.nextLine();
            String nombreUsuario = scanner.nextLine();
            Usuarios usuario = new Usuarios(id, nombreUsuario);
            DaoUsuario.modificar(usuario, opcion);
            
        }
        else if(opcion == 2){
            
            System.out.println("Ingrese el ID:");
            int id = scanner.nextInt();
            System.out.println("Ingrese la contraseña:");
            scanner.nextLine();
            String contraseña = scanner.nextLine();
            Usuarios usuario = new Usuarios(id, contraseña);
            DaoUsuario.modificar(usuario, opcion);
        }
        
        
         /*   System.out.println("Ingrese id de tupla a modificar: ");
            int id = scanner.nextInt();
            scanner = new Scanner(System.in);
            System.out.println("Ingresa nombre de usuario: ");
            String nombre = scanner.nextLine();
            System.out.println("Ingresa contraseña: ");
            String contraseña = scanner.nextLine();
            System.out.println("\n 1:Activo \n 0:No activo \n Ingresa status: ");
            int status = scanner.nextInt();
            
        
        Usuarios usuario = new Usuarios(id, nombre, contraseña, true);
        
        DaoUsuario.modificar(usuario);
        */
      
        
        /*
        
        String url = "jdbc:mysql://127.0.0.1:33065/usuario?zeroDateTimeBehavior=CONVERT_TO_NULL";
        
        try{
            Connection conexion = DriverManager.getConnection(url,"root","");
            
            String sql = "UPDATE usuario SET nombre_usuario =? ,contraseña =?,status =? WHERE id =? ";
            
            PreparedStatement declaracion = conexion.prepareStatement(sql);
            
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese id de tupla a modificar: ");
            int id = scanner.nextInt();
            scanner = new Scanner(System.in);
            System.out.println("Ingresa nombre de usuario: ");
            String nombre = scanner.nextLine();
            System.out.println("Ingresa contraseña: ");
            String contraseña = scanner.nextLine();
            System.out.println("\n 1:Activo \n 0:No activo \n Ingresa status: ");
            int status = scanner.nextInt();
            
            
            declaracion.setString(1,nombre);
            declaracion.setString(2,contraseña);
            declaracion.setInt(3, status);
            declaracion.setInt(4, id);
            
            //Ejecutamos el Query
            declaracion.executeUpdate();
            
            System.out.println("Tupla modificada");
            
            //Cerramos las conexiones
            declaracion.close();
            conexion.close();
        
        
        }catch(SQLException ex){
            ex.printStackTrace(System.out);
        }

*/
    }
    
}


