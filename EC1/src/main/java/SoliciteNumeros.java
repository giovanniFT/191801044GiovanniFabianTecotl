
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
public class SoliciteNumeros {
    
    public static void main(String[] args) {
        
      Scanner scanner = new Scanner(System.in);
      int numero,mayor=0;  
      char opcion;
      
        do{
        
           System.out.println("ingresa un numero:");
           numero = scanner.nextInt();
           
           if(numero>mayor){
            mayor=numero;
           }
           
           System.out.println("Si desea seguir agregando numeros presiones n, de lo contrario presione cualquier tecla:");
           opcion = scanner.next().charAt(0);
           
        }while (opcion == 'n' || opcion == 'N' );
        
        System.out.println("el valor mayor ingresado fue:" + mayor); 
        
       
    
    }
}
