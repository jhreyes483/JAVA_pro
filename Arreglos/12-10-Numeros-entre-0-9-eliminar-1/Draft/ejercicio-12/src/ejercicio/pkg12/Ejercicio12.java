/*
Leer por teclado una tabla de 10 elementos numericos enteros y una posocion entre 0 y 9
eliminar el elemnto situado en la posicion daba sin dejar huecos
 */
package ejercicio.pkg12;

import javax.swing.JOptionPane;


public class Ejercicio12 {

    
    public static void main(String[] args) {
        int num, numE, posicion = 0;
        int[] arreglo = new int[10];
        
        
        
        for (int i=0 ; i<9 ; i++ ){
            
         num =      Integer.parseInt(JOptionPane.showInputDialog("Ingrece numero: "));
         arreglo[i] = num;
            System.out.println(+i+". Numero: "+num);
        }
       int i,j=0;
       
       
       do{
        numE = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el la posicion a eliminar: "));
       
         }while(numE>10);
       
       
     
       //Comparcaion de arreglo
       while(arreglo[j]<numE ){
       posicion++;
       j++;
       }
       
       
        for ( i=posicion ; i>=0 ; i-- ){   
        arreglo[i+1] = arreglo[i];
        }
    
        System.out.println("");  
        System.out.println(+i+". Nuevo arreglo");
        for (i=1 ; i<9 ; i++){
            System.out.println(+i+" Numero: "+arreglo[i]);
        }
      
    }
    
}
