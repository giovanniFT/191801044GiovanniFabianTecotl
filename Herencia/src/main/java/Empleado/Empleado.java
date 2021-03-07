/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empleado;

/**
 *
 * @author gio_f
 */
public class Empleado {
    
    
    private String apellidoP,apellidoM,nombre;
    private int dni;
    
    
    public Empleado(){
    
        this.apellidoM = " ";
        this.apellidoP = " ";
        this.dni = 0;
        this.nombre = " ";
    }
    
    
    public Empleado(String apellidoP, String apellidoM, int dni, String nombre){
        
        this.apellidoM = apellidoM;
        this.apellidoP = apellidoP;
        this.dni = dni;
        this.nombre = nombre;    
    }
    
    
    
    @Override
    public String toString(){
        return "apellido materno:" + apellidoM + "apellido Paterno:" + apellidoP + "dni:" + dni + "nombre:" + nombre;
    }
    
    
    
    
    
   
    
    
}
