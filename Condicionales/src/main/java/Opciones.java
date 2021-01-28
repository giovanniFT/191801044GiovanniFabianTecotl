
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
public class Opciones {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        
        int numero1,numero2;
        System.out.println("ingresa un numero");
        numero1 = scanner.nextInt();
        System.out.println("ingresa un numero");
        numero2 = scanner.nextInt();
        
        
        System.out.println("opcion 1 suma, opcion 2 resta");
        int option = scanner.nextInt();
        
        switch(option){
            
            case 1: 
                System.out.println(numero1 + numero2);
                break;
                
            case 2:
                System.out.println(numero1 - numero2);
                break;
                
            default:
                System.out.println("no existe esta opcion");
                break;
        }
        

    }
}

