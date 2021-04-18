
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
public class Eliminar {
    
    public static void main(String[] args) throws SQLException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserte id de tupla a eliminar: ");
        int id = scan.nextInt();
        
        Renta cliente = new Renta(id);
        DaoClientes.eliminar(cliente);
        
    }
    
}
