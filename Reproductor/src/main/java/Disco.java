
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
public class Disco {
    
    //atributos
    public String nombre;
    public String artista;
    public int anio;
    public ArrayList <Cancion> canciones;
    
    public Disco(){
        
    }
    
    public Disco(String nombre, String artista, int anio, ArrayList <Cancion> canciones){
        
        this.anio = anio;
        this.artista = artista;
        this.canciones = canciones;
        this.nombre = nombre;
    }
    
    
    
    @Override
    public String toString(){
        
        return "año:" + anio + "\n"+ "artista:" + artista +  "\n" + "canciones" + canciones + "\n" + "nombre:" + nombre;
    }
    
}
