/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gio_f
 */
public class Pelicula {
    
    //atributos
    public String titulo,director,genero,casaProductora,clasificacion;
       public int año;
       public double duracion;
       public boolean subtitulos;
       
       
       
       //contructor vacio
 public Pelicula(){
        
    }
    //Constructor Lleno
    public Pelicula(String titulo, String director,String genero,String casaProductora,String clasificacion ,int año,double duracion,boolean subtitulos){
        
        this.año = año;
        this.casaProductora = casaProductora;
        this.clasificacion= clasificacion;
        this.director = director;
        this.duracion = duracion;
        this.genero = genero;
        this.subtitulos = subtitulos;
        this.titulo = titulo;
    
    } 

    
    public Pelicula(String titulo){
    this.titulo= titulo ;
    }
   
    @Override
    public String toString(){        
        return "Titulo: " + titulo + "Director: " + director + "\n Clasificacion: " + clasificacion + "\n Casa productora:" + casaProductora +"\n Genero:" + genero +  "\nAño de la pelicula: " + año + "\nDuracion de la pelicula: "+ duracion+"\\nSubtitulos de la pelicula:"+ subtitulos ;
    }    
    
    
}
