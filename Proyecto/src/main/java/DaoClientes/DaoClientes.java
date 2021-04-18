/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoClientes;

import Renta.Renta;
import Conexion.Conexion;
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
public class DaoClientes {
    
    private static String SQL;
    
    
    public static List<Renta> listaClientes() throws SQLException{
        
        List<Renta> listClientes = new ArrayList<>();
        
        Connection conexion = Conexion.getConnetion();
        
        Statement declaracion = conexion.createStatement();
        SQL = "SELECT * FROM renta";
        
        ResultSet resultado = declaracion.executeQuery(SQL);
        
        
        
        while(resultado.next()){
            
            Renta cliente = new Renta(resultado.getInt("id"), resultado.getString("nombre"), resultado.getDouble("hora_inicio"), resultado.getDouble("hora_fin"), resultado.getDouble("tiempo_conexion"), resultado.getDouble("total"));
            
            listClientes.add(cliente);
              
        }

        Conexion.close(conexion, declaracion, resultado);
        
        return listClientes;
      
    }
    
    
    public static void insertar(Renta cliente) throws SQLException{
        Connection conexion = Conexion.getConnetion();
        
        SQL = "INSERT INTO renta(nombre,hora_inicio,hora_fin,tiempo_conexion,total) VALUES (?,?,?,?,?)";
        PreparedStatement declaracion = conexion.prepareStatement(SQL);
        
        
        
        
        declaracion.setString(1,cliente.getNombre());
        declaracion.setDouble(2,cliente.getHoraInicio());
        declaracion.setDouble(3,cliente.getHoraFin());
        declaracion.setDouble(4,cliente.getTiempoConexion());
        declaracion.setDouble(5,cliente.getTotal());
       
        
        declaracion.executeUpdate();
        
        Conexion.close(conexion,declaracion);
        
        
        
    
    }

    
    
    
     public static void modificar(Renta cliente) throws SQLException{
        
        Connection conexion = Conexion.getConnetion();
        SQL = "UPDATE renta SET nombre = ?, hora_inicio = ?, hora_fin = ?, tiempo_conexion = ?, total = ? WHERE id =? ";
        PreparedStatement declaracion = conexion.prepareStatement(SQL);    
        
        declaracion.setInt(6, cliente.getId());
        declaracion.setString(1,cliente.getNombre());
        declaracion.setDouble(2,cliente.getHoraInicio());
        declaracion.setDouble(3,cliente.getHoraFin());
        declaracion.setDouble(4,cliente.getTiempoConexion());
        declaracion.setDouble(5,cliente.getTotal());
        
        
        declaracion.executeUpdate();
        System.out.println("tupla modificada");
        
        Conexion.close(conexion,declaracion);
        
    }
    
    public static void eliminar(Renta cliente) throws SQLException{
    
        Connection conexion = Conexion.getConnetion();
        SQL = "DELETE FROM renta WHERE id =?";
        PreparedStatement declaracion = conexion.prepareStatement(SQL);
        
        
        declaracion.setInt(1,cliente.getId());
        declaracion.executeUpdate();
        Conexion.close(conexion, declaracion);
    
    }
    
   
    public static void cobro(Renta cliente) throws SQLException{
        
      Connection conexion = Conexion.getConnetion();
        SQL = "UPDATE renta SET hora_fin = ? WHERE id =? ";
        PreparedStatement declaracion = conexion.prepareStatement(SQL);    
        

        double horaI = cliente.getHoraInicio();
        double horaF = cliente.getHoraFin();
        double totalH =  horaF - horaI  ;
        System.out.println("total de horas = " + totalH);
        double cobro2 = totalH * 10;
        System.out.println("cobro2 = " + cobro2);
        
        
        declaracion.setDouble(1, cliente.getHoraFin());
        declaracion.setInt(2, cliente.getId());
        
      
        declaracion.executeUpdate();
        Conexion.close(conexion,declaracion);
        
    }
    
    public static void modificar2(Renta cliente) throws SQLException{
        
        Connection conexion = Conexion.getConnetion();
        SQL = "UPDATE renta SET hora_inicio = ?, hora_fin = ?, tiempo_conexion = ?, total = ? WHERE id =? ";
        PreparedStatement declaracion = conexion.prepareStatement(SQL);    
        
        
        double ConexT,horaI,horaF;
        
        horaI = cliente.getHoraInicio();
        horaF = cliente.getHoraFin();
        
        
        
        declaracion.setInt(5, cliente.getId());
        declaracion.setDouble(1,cliente.getHoraInicio());
        declaracion.setDouble(2,cliente.getHoraFin());
        declaracion.setDouble(3,cliente.getTiempoConexion());
        declaracion.setDouble(4,cliente.getTotal());
        
        
        declaracion.executeUpdate();
        System.out.println("tupla modificada");
        
        Conexion.close(conexion,declaracion);
        
    }

    
    
    
    }
   
