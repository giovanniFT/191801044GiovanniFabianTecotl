/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gio_f
 */
public class TestTaza {
    
    public static void main(String[] args) {
        
        Taza tazaRoja = new Taza();
        
        tazaRoja.color = "roja";
        tazaRoja.material = "platisco";
        tazaRoja.modelo = "navideño";
        tazaRoja.precio = 350.90;
        tazaRoja.tamanio = "mediana";
        
        System.out.println(tazaRoja);
        
    
    
    Taza tazaNaranja = new Taza("amarillo", 119.50, "grande", "industrial", "plata");
    
    System.out.println(tazaNaranja);
    
    }
    
    
}
