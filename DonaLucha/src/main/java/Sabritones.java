/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gio_f
 */
public class Sabritones {
    
    //atributos
    public String sabor;
    public String color;
    public String tamanio;
    public double precio;
    
    //metodos
    
    //contructor
    public Sabritones (String sabor, String color, String tamanio, double precio){
        this.color = color;
        this.precio = precio;
        this.sabor = sabor;
        this.tamanio = tamanio;
    
    }
    
    //constructor vacio
    public Sabritones(){
        this.color = " ";
        this.precio = 0;
        this.sabor = " ";
        this.tamanio = " ";
        
    }
    
    //metodo toString
    @Override
    public String toString(){
        return "\ncolor:" + color + "\nprecio:" + precio + "\nsabor:" + sabor + "\ntamaño:" + tamanio;
        
    }
    
    
}
