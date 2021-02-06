/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gio_f
 */
public class Cancion {
    
    //atributos
    public int orden;
    public String titulo;
    public double duracion;
    
    //metodos
    //constructor
    public Cancion (int orden, String titulo, double duracion){
        this.duracion = duracion;
        this.orden = orden;
        this.titulo = titulo;
        
    }
    
    //constructor vacion
    public Cancion (){
        
        this.duracion = 0;
        this.orden = 0;
        this.titulo = " ";
        
        
    }
    
    //metodo toString
    @Override
    public String toString(){
        
        return "orden:" + orden + "duracion:" + duracion+ "titulo:"+titulo;
    }
    
    
}
