
import hardware.Bateria;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gio_f
 */
public class TestBateria {
    
    
    public static void main(String[] args) {
        
        // instanciar es crear un objeto
        //partes para instanciar un objeto 
        //Bateria = Clase , batericelular = nombre del objeto, new = paralabra reservada , Bateria = clase , () = constructor"completo o vacio" 
        Bateria bateriacelular = new Bateria (100);  
       
                
                System.out.println(bateriacelular);
                
                
                bateriacelular.setPorcentaje(99);
                
                System.out.println("bateriacelular = " + bateriacelular);
        
    }
    
}
