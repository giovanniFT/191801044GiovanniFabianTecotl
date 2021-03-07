
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
public class Fisica {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingresa valor");
        
        double valor = scanner.nextDouble();
        
        double val1 = 6.63*Math.pow(10,-34)/valor;
        double val2 = 3*Math.pow(10, 8)/valor;
        
        System.out.println(val1 + "ks  m/s");
        System.out.println(val2+ "j");
        
        
        
        
    }
    
}
