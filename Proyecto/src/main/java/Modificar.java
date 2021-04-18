
import Renta.Renta;
import DaoClientes.DaoClientes;
import java.sql.SQLException;
import java.util.Scanner;

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
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese id de tupla a modificar: ");
        int id = scan.nextInt();
        
        scan = new Scanner(System.in);
        System.out.println("Inserte nombre a modificar: ");
        String nombre = scan.nextLine();
        
        System.out.println("hora de inicio a modificar: ");
        double horaI = scan.nextDouble();
        
        System.out.println("Inserte hora de fin a modificar: ");
        double horaF = scan.nextDouble();
        
        System.out.println("Inserte tiempo de conexion: ");
        double tiempo_conexion = scan.nextDouble();
        
        System.out.println("Inserte total: ");
        double total = scan.nextDouble();
        
        
        Renta cliente = new Renta(id, nombre, horaI, horaF, tiempo_conexion, total);
        DaoClientes.modificar(cliente);
        
        
      
        
    }
    
    
}
