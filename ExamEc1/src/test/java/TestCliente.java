
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gio_f
 */
public class TestCliente {
    
    public static void main(String[] args) {
        
    ArrayList <Coche> coche = new ArrayList();
    
    Coche auto = new Coche("HONDA","ROJO",159242.23,999999);
    coche.add(auto);
    
 
    Cliente comprador = new Cliente(123,222253,"juan",coche);
        System.out.println(comprador);
  
   
  
   }     
}
