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
public class Programador extends Empleado{
    
    private int sueldo;
    
    
    public Programador(int sueldo, String apellidoM, String apellidoP, String nombre, int dni){
        super(apellidoP, apellidoM, dni, nombre);
        this.sueldo = sueldo;
    }
    
        
    public Programador(){
        super();
        this.sueldo = 0;   
    }
    
    
 

    
    
    
}
