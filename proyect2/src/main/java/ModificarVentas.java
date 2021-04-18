
import DaoTables.DaoProductos;
import DaoTables.DaoVentas;
import Tablas.Productos;
import Tablas.Ventas;
import java.sql.SQLException;
import java.util.Scanner;


public class ModificarVentas {
    
    public static void main(String[] args) throws SQLException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese id de tupla a modificar: ");
        int id = scan.nextInt();
        scan = new Scanner(System.in);
        System.out.println("Inserte nombre de cliente: ");
        String nombreCliente = scan.nextLine();
        System.out.println("Inserte el total de venta: ");
        double totalVenta = scan.nextDouble();
        System.out.println("Inserte el descuento realizado: ");
        double descuento = scan.nextDouble();
        
        
        Ventas product = new Ventas(nombreCliente, id, totalVenta, descuento);
        DaoVentas.modificar(product);
        
    }
    }

