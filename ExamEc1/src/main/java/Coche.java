/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gio_f
 */
public class Coche {
    
    public String marca,color;
    public double precio;
    public int matricula;
    
    
    
    public Coche(String marca, String color, double precio, int matricula){
        
        this.marca = marca;
        this.color = color;
        this.matricula = matricula;
        this.precio = precio;
        
    }
    
    public Coche(){
        
        this.marca = "";
        this.color = "";
        this.matricula = 0;
        this.precio = 0;
    }
    
    
    @Override
    public String toString(){
        return "marca:" + marca + "color:" + color + "matricula:" + matricula + "precio:" + precio;
    }
    
    
    
}
