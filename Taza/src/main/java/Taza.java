/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gio_f
 */
public class Taza {
    
    
    //atributos
    public String color ;
    public double precio;
    public String tamanio;
    public String modelo;
    public String material;
    
    
    //metodos
    //constructores
    public Taza (String color, double precio, String tamanio, String modelo, String material){
        this.color = color;
        this.material = material;
        this.modelo = modelo;
        this.precio = precio;
        this.tamanio = tamanio;
        
        
        
    }
    
    public Taza(){
        this.color = " ";
        this.material = " ";
        this.modelo = " ";
        this.precio = 0;
        this.tamanio = " ";
        
    }
    //metodo toString
    @Override
    public String toString(){
        
        return "el color es:" + color + "el precio es:" + precio+ "el tamaño es:" + tamanio + "el modelo es:" + modelo + "el material es:" + material;
        
        
    }
    
    
}
