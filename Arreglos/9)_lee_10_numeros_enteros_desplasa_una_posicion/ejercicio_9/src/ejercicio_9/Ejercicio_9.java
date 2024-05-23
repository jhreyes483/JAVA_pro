/*
Crea un programa que lea por teclado una tabla de 10 numeros enteros y la desplace una
posicion hacia abajo: el primero pasa a ser el segundo para a ser el tercero y asi sucesivamente.
El ultimo pasa a ser el primero.
 */
package ejercicio_9;

import java.util.Scanner;

public class Ejercicio_9 {

    public static void main(String[] args) {
      
        Scanner leer = new Scanner(System.in);
       int numeros[] = new int[10];
       
      
        
        
         System.out.println("Leer elementos del arreglo");
         for(int i=0 ; i<10 ; i++){
             System.out.print(+(i)+". Ingrese numero: ");
             int numero = leer.nextInt();
             numeros[i] = numero;
         
         }
         int ultimo = numeros[9];
         System.out.println("");
         
         //Correr una posicion en el arreglo
         for(int i=8 ; i>=0 ; i-- ) {
         numeros[i+1] = numeros[i];
         
         }
         Espacio();
         
         numeros[0] = ultimo;
         
         //Mostrar datos
         System.out.println("El nuevo arreglo es: ");
         for(int i=0 ; i<=9 ; i++ ){
             System.out.println(+(i)+". numero: "+numeros[i]);
             
        }
      }
    
    public static void Espacio(){System.out.println(" ");}

}
    

