
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gio_f
 */
public class Cine {
    
    Scanner scan = new Scanner(System.in);
    
    public String nombre;
    public int horaIn,horaOut;
    public ArrayList <Pelicula> peliculas;
    
    
    public Cine(){
        this.nombre = "";
        this.horaIn = 0;
        this.horaOut = 0;
        this.peliculas = null;
        
    }
    
    public Cine(String nombre,int horaIn , int horaOut, ArrayList <Pelicula> peliculas){
        this.nombre = nombre;
        this.horaIn = horaIn;
        this.horaOut = horaOut;
        this.peliculas = peliculas;
        
    }
    
    public Cine (String nombreCine, int horaIn, int horaOut){
        this.horaIn = horaIn;
        this.nombre = nombre;
        this.horaOut = horaOut;
        this.peliculas = peliculas;
        
    }
    
    
    
    //imprimir
    public String imprimirPeliculas(){
        String cartelera = "";
        for(Pelicula pelicula:peliculas){
            cartelera += pelicula.titulo + "\n";
        }
        return cartelera;
    }
    
    //metodo agregregar pelicula
    public void agregarPelicula(Pelicula pelicula){
        peliculas.add(pelicula);
    }
    
    
    @Override
    public String toString(){
            return "nombre:" + nombre;
        }
    
    
    //menu 
    public String menu(){
    
        
        
    
        
        return null;
    }
        
        
          
              
    
    }

 


