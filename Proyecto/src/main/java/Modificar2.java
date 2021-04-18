
import DaoClientes.DaoClientes;
import Renta.Renta;
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
public class Modificar2 {
    
    public static void main(String[] args) throws SQLException {
        
        double conexT, precio;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("INGRESE EL ID A COBRAR: ");
        int id = scan.nextInt();
        
      
        
        System.out.println("HORA DE INICIO DE CONEXION: ");
        double horaI = scan.nextDouble();  
        
        System.out.println("HORA DE FIN DE CONEXION: ");
        double horaF = scan.nextDouble();
        
        conexT = horaF - horaI;
        precio = conexT * 10;
        
        System.out.println("EL USUARIO ESTUVO CONECTADO:" + conexT + " " + "HORAS");
        
        
        System.out.println("INSERTE EL TIEMPO DE CONEXION: ");
        double tiempo_conexion = scan.nextDouble();
        
        System.out.println("EL TOTAL A COBRAR ES:" + precio);
        
        System.out.println("INSERTE TOTAL: ");
        double total = scan.nextDouble();
        
        
        
        
       Renta cliente = new Renta(id, horaI, horaF, tiempo_conexion, total);
        DaoClientes.modificar2(cliente);  
        
     
        
    }
}
