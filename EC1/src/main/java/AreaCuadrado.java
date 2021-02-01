
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
public class AreaCuadrado {
    
    public static void main(String[] args) {
        
        double lado;
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese un lado del cuadrado:");
        lado = scanner.nextDouble();
        
        
        double area = Math.pow(lado,2);
        System.out.println("el area del cuadrado es:" + area );
        
    }
    
}
