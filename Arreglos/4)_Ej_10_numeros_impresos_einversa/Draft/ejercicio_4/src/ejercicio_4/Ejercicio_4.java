/*
Leer 10 numeros enteros, guardarlos en un arreglo.
debemos mostrarlos en el sguiente orde: el primero, el ultimo,
el segundo, el penultimo, el tercero, etc.

Read 10 whole numbers, save them in an array.
we must show them in the next order: the first, the last,
the second, the penultimate, the third, etc..
 */
package ejercicio_4;

import javax.swing.JOptionPane;

public class Ejercicio_4 {

    public static void main(String[] args) {
        
        
        int[] numeros = new int[10]; 
        
     for (int i=0 ; i<10 ; i++ ){
         
    int number = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero; "));   
    numeros[i]=number;
      } 
    
         System.out.println("Imprecion de datos almacenados en el arreglo");
       for(int i=9 ; i>=0 ; i--){
       
           System.out.println("Numero: "+numeros[i] );
       }     
    } 
}