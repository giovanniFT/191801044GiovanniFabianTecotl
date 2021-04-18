
import DaoTables.DaoVentas;
import Tablas.Ventas;
import java.util.Scanner;

import Tablas.Ventas;
import java.sql.SQLException;
public class InsertarVentas {
    public static void main(String[] args) throws SQLException {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserte nombre de cliente: ");
        String nombreCliente = scan.nextLine();
        System.out.println("Inserte el total de venta: ");
        double totalVenta = scan.nextDouble();
        System.out.println("Inserte el descuento realizado: ");
        double descuento = scan.nextDouble();
        
       
        
        Ventas ventas = new Ventas(nombreCliente, totalVenta, descuento);
        DaoVentas.insertar(ventas);
        
    }
}
