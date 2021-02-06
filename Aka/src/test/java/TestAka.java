/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gio_f
 */
public class TestAka {
    
    public static void main(String[] args) {
        
        // crear un objeto   
        
        Aka cobre  =  new Aka();  //(instanciar una clase)
        cobre.material = "cobre";
        cobre.disponibilidad = "alta";
        cobre.municion = 5;
        cobre.precio = 10;
        cobre.velocidadDisparo = 10.5;
        cobre.danio = 5;
        
        System.out.println(cobre);
        
        Aka diamante  =  new Aka();  //(instanciar una clase)
        diamante.material = "diamante";
        diamante.disponibilidad = "baja";
        diamante.municion = 20;
        diamante.precio = 12000;
        diamante.velocidadDisparo = 13;
        diamante.danio = 15;
        
        System.out.println(diamante);
        
        
        
    }
    
}

