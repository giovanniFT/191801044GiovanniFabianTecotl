

import DaoTables.DaoProductos;
import java.util.Scanner;
import Tablas.Productos;
import java.sql.*;

public class InsertarProductos {
    
    public static void main(String[] args) throws SQLException{
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserte nombre de producto: ");
        String nombrePto = scan.nextLine();
        System.out.println("Inserte nombre de proveedor: ");
        String nombrePdor = scan.nextLine();
        System.out.println("Inserte precio de producto: ");
        double precio = scan.nextDouble();
       
        
        Productos product = new Productos(nombrePto, nombrePdor, precio);
        DaoProductos.insertar(product);
        
        
        
        
    }
}
 