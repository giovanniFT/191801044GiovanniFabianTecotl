
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
public class TestCine {
    
    
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String titulo;
        int n = 0;
        int horaIn,horaOut;
        
        
         ArrayList<Pelicula> peliculas = new ArrayList();
        Cine cine = new Cine("Love", 9, 11,peliculas);
        
  
        while(n==0){
            System.out.println("Ingresa el titulo de la pelicula: ");
            scan.nextLine();
            titulo = scan.nextLine();
            Pelicula pelicula = new Pelicula(titulo);
            // peliculas.add(nueva);
            cine.agregarPelicula(pelicula);
          
            System.out.println("Si desea continuar ingrese 0");
            n = scan.nextInt();
        }
        
        
        //imprimir las peliculas
        //System.out.println(cine.imprimirPeliculas());
        
        //imprimir menu
        System.out.println(cine.menu());
        
    }

    
}
