
package ejercicio_5;

import static java.lang.System.in;
import java.util.Scanner;

public class Ejercicio_5 {

    public static void main(String[] args) {
        //int a[],b[],c[];
        
       // int[] a = new int[10];
          //a = new int[]
        int a[],b[],c[];
        a = new int[10];
        b = new int[10];
        c = new int[20];
        
        Scanner leer = new Scanner(in);
        
        
        System.out.println("Digite el primer arreglo ");
        for (int i=0 ; i<10 ; i++){
        
            System.out.print(+(i+1)+". Digite un numero: ");
            a[i] = leer.nextInt();        
      }
     
        System.out.println("\n Digite el segundo arreglo");
        
        
        for(int  i=0 ; i<10 ; i++ ){
        System.out.print(+(i+1)+". Digite un numero: ");
            b[i] = leer.nextInt();}
        
     
        
        int j=0;
        for(int i=0 ; i<10 ; i++){
           c[j] = a[i];            
           j++;
           c[j] = b[i]; 
            j++;       
           
                }
        
        System.out.print("\n El tercer arreglo es: ");
        for (int i=0 ; i<20 ; i++)
        { System.out.print(" "+c[i]);                   }        
        
        
        
        
        
        
  
    }
    
}
