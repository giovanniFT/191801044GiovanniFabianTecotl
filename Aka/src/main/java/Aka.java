/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gio_f
 */
public class Aka {
    
    //atributos
    
    public String material ,disponibilidad ;
    public int municion;
    public double danio , precio , velocidadDisparo;
    
    //metodos (toString "permite imprimir sin llamar al metodo") 
    
    public String toString(){
        return "material de:" + material + "con una disponibilidad de:" + disponibilidad + "con una municion de:" + municion + "velocidad de disparo:" + velocidadDisparo + "con un daño de:" + danio + "precio de:" + precio;
        
}
    
}
