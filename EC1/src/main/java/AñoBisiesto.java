
import java.util.GregorianCalendar;
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
public class AñoBisiesto {
    
    public static void main(String[] args) {
        
        int año;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("ingresa un año:");
        año = scanner.nextInt();
        
        GregorianCalendar calendar = new GregorianCalendar();

if (calendar.isLeapYear(año))
	System.out.println("El año es bisiesto");
else
	System.out.println("El año no es bisiesto");
        
    }
    
}
