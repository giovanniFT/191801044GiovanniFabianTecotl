
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
public class MayorDeEdad {
    
    public static void main(String[] args) {
        
        int edad;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingresa tu edad:");
        edad = scanner.nextInt();
        
        if(edad >=18){
            System.out.println("la persona es mayor de edad");
        }
        else{
            System.out.println("la persona es menor de edad");
        }
    }
    
}
