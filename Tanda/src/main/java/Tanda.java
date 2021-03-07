/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gio_f
 */
public class Tanda {
    
    private int numero,fecha;
    private String nombre;
    
  
    public Tanda(int numero, int fecha, String nombre){
        this.numero = numero;
        this.fecha = fecha;
        this.nombre = nombre;
    }
    
    public Tanda(){
        this.numero = 0;
        this.fecha = 0;
        this.nombre = "";
    }
    
    @Override
    public String toString(){
        return "numero:" + numero + "fecha:" + fecha + "nombre:" + nombre;
    }

}
