
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
public class SiEntonces {
    public static void main(String args[]){
        Scanner scanner = new Scanner (System.in);
        int numero;
        
        System.out.println("ingresa un numero");
        numero = scanner.nextInt();
        
        if (numero <0){
            System.out.println("el numero es negativo");
            
        }
        else{
            System.out.println("el numero es positivo");
        }
        
    }
}
