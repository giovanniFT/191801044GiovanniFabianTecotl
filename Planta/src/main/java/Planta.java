/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gio_f
 */
public class Planta {
    
    private int dni;
    private String nombre, nombreCientifico;
    private boolean siEsDeSol, siEsCurativa;
    
    
    public Planta(){   
    }
   
    
    public Planta(int dni, String nombre, String nombreCientifico, boolean siEsDeSol, boolean siEsCurativa){
        
        this.dni = dni;
        this.nombre = nombre;
        this.nombreCientifico = nombreCientifico;
        this.siEsDeSol = siEsDeSol;
        this.siEsCurativa = siEsCurativa;  
    }
    
    public int getDni(){
        return this.dni;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getNombreCientifico(){
        return this.nombreCientifico;
    }
    
    public boolean getSiEsDeSol(){
        return this.siEsDeSol;
    }
    
    public boolean getSiEsCurativa(){
        return this.siEsCurativa;
    }
   
    
    public void setDni(int dni){
        this.dni = dni;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setNombreCientifico(String nombreCientifico){
        this.nombreCientifico = nombreCientifico;
    }
    
    public void setSiEsDeSol(boolean siEsDeSol){
        this.siEsDeSol = siEsDeSol;
    }
    
    public void setSiEsCurativa(boolean siEsCurativa){
        this.siEsCurativa = siEsCurativa;
    }    
    
    
    
    @Override
    public String toString(){
        return "nombre" + nombre;
    }
    
    
}
