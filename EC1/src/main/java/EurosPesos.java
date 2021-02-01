
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
public class EurosPesos {
    
    public static void main(String[] args) {
        
        double euro,total;
        System.out.println("el valor de euros en pesos es 1 euro = 24.99 pesos mx");
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("ingresa la cantidad de euros que quieres convertir a pesos:");
        euro = scanner.nextDouble();
        total = euro * 24.99;
        
        System.out.println("la cantidad en pesos es:" + String.format("%.2f", total)  );

        
    }
    
}
