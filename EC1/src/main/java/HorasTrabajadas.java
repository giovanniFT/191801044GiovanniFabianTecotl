
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
public class HorasTrabajadas {
    
    public static void main(String[] args) {
        
        double horas,monto,paga,iva;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("ingresa el numero de horas trabajadas:");
        horas = scanner.nextDouble();
        
        System.out.println("ingresa el monto por hora:");
        monto = scanner.nextDouble();
    
        paga = horas*monto;
        iva = (paga*.16)/100;
        
        System.out.println("paga neta:" + paga);
        System.out.println("paga en bruto:" + (paga + iva) );
        
    }
    
}
