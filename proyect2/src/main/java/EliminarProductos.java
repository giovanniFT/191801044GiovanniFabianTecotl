
import DaoTables.DaoProductos;
import Tablas.Productos;
import java.sql.SQLException;
import java.util.Scanner;


public class EliminarProductos {

    public static void main(String[] args) throws SQLException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserte id de tupla a eliminar: ");
        int id = scan.nextInt();
        
        Productos product = new Productos(id);
        DaoProductos.eliminar(product);
        
    }
    
}
