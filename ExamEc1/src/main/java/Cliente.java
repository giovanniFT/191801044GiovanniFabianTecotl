
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
public class Cliente {
    
    public int dni,telefono;
    public String nombre;
    public ArrayList <Coche> coche;
    
    
    
    public Cliente(int dni, int telefono, String nombre, ArrayList <Coche> coche){
        
        this.dni = dni;
        this.telefono = telefono;
        this.nombre = nombre;
        this.coche = coche;
        
    }
    
    public Cliente(){
        this.dni = 0;
        this.telefono = 0;
        this.nombre = "";
        this.coche = null;
        
    }

 
    
    @Override
    public String toString(){
        return "dni: " + dni + "telefono:" + telefono + "nombre:" + nombre + "coche:" + coche;
        
    }
    
    
    
    
    
    
}
