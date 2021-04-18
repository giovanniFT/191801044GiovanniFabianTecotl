import java.sql.SQLException;
import java.util.Scanner;
import Renta.Renta;
import DaoClientes.DaoClientes;
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
    
    public static void main(String[] args) throws SQLException{
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserte nombre: ");
        String nombre = scan.nextLine();
        
        System.out.println("Inserte hora de inicio: ");
        double hora_in = scan.nextDouble();
        
        System.out.println("Inserte hora de fin: ");
        double hora_fin = scan.nextDouble();
       
        System.out.println("Inserte tiempo de conexion: ");
        double tiempo_conexion = scan.nextDouble();
        
        System.out.println("Inserte  total: ");
        double total = scan.nextDouble();
        
        
        Renta cliente = new Renta(nombre, hora_in, hora_fin, tiempo_conexion, total);
        DaoClientes.insertar(cliente);
        
        
    }
    
    
}
