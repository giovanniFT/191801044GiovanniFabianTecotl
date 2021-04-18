
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prueba
 */
public class EjeEspejo {
    
    public static void main(String[] args) {
        
    
    Scanner scaner = new Scanner(System.in);
   
    System.out.println("ingresa tu altura:");
    
    double x = scaner.nextDouble();
    
    double cd = x/2;
    
    double h;
    double cd2 = (x-10)/2;
    
        System.out.println("cd = " + cd);
        System.out.println("cd2 = " + cd2);
}
}