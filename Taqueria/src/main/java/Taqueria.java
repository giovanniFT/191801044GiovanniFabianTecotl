
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
public class Taqueria {
    public static void main(String args[]){
        
        int tacos,refrescos;
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿cuantos tacos comio?");
        tacos = scanner.nextInt();
        System.out.println("cuantos refrescos tomo");
        refrescos = scanner.nextInt();
        
        tacos = tacos*17;
        refrescos = refrescos*10;
        System.out.println("su cuenta mi wero es:"+(tacos + refrescos)+ "\tpeje coins");
        
        
                
        
        
        
    }
}
