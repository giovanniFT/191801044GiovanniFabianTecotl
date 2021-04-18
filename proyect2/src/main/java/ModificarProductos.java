
import DaoTables.DaoProductos;
import Tablas.Productos;
import java.sql.SQLException;
import java.util.Scanner;


public class ModificarProductos {
    public static void main(String[] args) throws SQLException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese id de tupla a modificar");
        int id = scan.nextInt();
        scan = new Scanner(System.in);
        System.out.println("Inserte nombre de producto: ");
        String nombrePto = scan.nextLine();
        System.out.println("Inserte nombre de proveedor: ");
        String nombrePdor = scan.nextLine();
        System.out.println("Inserte precio de producto: ");
        double precio = scan.nextDouble();
        
        Productos product = new Productos(nombrePto, nombrePdor, id, precio);
        DaoProductos.modificar(product);
        
    }
}
