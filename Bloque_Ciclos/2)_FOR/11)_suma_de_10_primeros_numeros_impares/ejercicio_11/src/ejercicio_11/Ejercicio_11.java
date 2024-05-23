
package ejercicio_11;

/**
Diseñar un programa que muestre
el producto de los 10 primeros numeros impares

Design a program that shows
the product of the first 10 odd numbers
 */
public class Ejercicio_11 {

   
    public static void main(String[] args) {
        
        int producto = 1;
      

        for (int a=1 ; a<20 ; a += 2 ){
        
           producto *=  a;
            
            System.out.println("el producto es: "+producto);
            }
        
        
        
        
        
    }
    
}
