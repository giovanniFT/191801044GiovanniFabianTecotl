
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
public class Promedio {
    public static void main(String args[]){
        
        double valorUno,valorDos,valorTres,suma;
        Scanner scanner = new Scanner(System.in);
        System.out.println("indica el primer valor");
        valorUno = scanner.nextDouble();
        System.out.println("indica el segundo valor");
        valorDos = scanner.nextDouble();
        System.out.println("indica el tercer valor");
        valorTres = scanner.nextDouble();
        
        suma = ( valorUno + valorDos + valorTres )/(3);
        
        System.out.println("el promedio de los valores es:" + suma);
    }
}
