
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
public class Cobro {
    
    public static void main(String[] args) throws SQLException {
        
        double conexT, precio;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese id de tupla a modificar: ");
        int id = scan.nextInt();
        
        System.out.println("ingrese hora de inicio:" );
        double horaI = scan.nextDouble();
        
        System.out.println("ingrese hora de fin:" );
        double horaF = scan.nextDouble();
        
        conexT = horaF - horaI;
        precio = conexT * 10;
        
        System.out.println("el tiempo de conexion fue:" + conexT);
        System.out.println("el total a pagar es:" + precio);
        
        
        
        Renta cliente = new Renta(id, horaI, horaF);
        DaoClientes.cobro(cliente);
    
}
}