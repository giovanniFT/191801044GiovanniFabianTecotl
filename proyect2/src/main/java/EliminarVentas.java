

import DaoTables.DaoVentas;
import Tablas.Ventas;
import java.sql.SQLException;
import java.util.Scanner;

public class EliminarVentas {
     public static void main(String[] args) throws SQLException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserte id de tupla a eliminar: ");
        int id = scan.nextInt();
        
        Ventas product = new Ventas(id);
        DaoVentas.eliminar(product);
        
    }
    
}
