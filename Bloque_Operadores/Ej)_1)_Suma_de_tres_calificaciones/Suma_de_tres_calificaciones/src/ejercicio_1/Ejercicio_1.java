/*Hacer un programa que calcule e imprima la suma de tres caliicaciones*/
package ejercicio_1;

import java.util.Scanner;


public class Ejercicio_1 {

   
    public static void main(String[] args) {
        
        
        Scanner leer = new Scanner (System.in);
        
                
        
        float note1,note2,note3,total;
        
       
            System.out.println("Digite las tres notas ");
            note1 = leer.nextFloat();
            note2 = leer.nextFloat();
            note3 = leer.nextFloat();
            
            
            total = note1 + note2 + note3; 
            
            System.out.println("La suma de las 3 notas es "+total);
            
            
            
            
            
            
            
            
            
        
        
        
        
        }
      
    }
    

