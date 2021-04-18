
import Renta.Renta;
import DaoClientes.DaoClientes;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prueba
 */
public class Mostrar {
    
    public static void main(String[] args) throws SQLException {
        
        List<Renta> listaClientes = new ArrayList<>();
        listaClientes = DaoClientes.listaClientes();
        for(Renta productos:listaClientes){
            System.out.println(productos);
        
        }
        
    }
    
}
