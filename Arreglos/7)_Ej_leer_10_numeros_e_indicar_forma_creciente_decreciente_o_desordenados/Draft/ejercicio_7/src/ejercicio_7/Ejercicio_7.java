/*
Leer por teclado una serie de 10 numeros enteros.
La aplicacion debe indicarnos si los numeros estan ordenados de forma:
creciente, decreciente, o si estan desordenados.


Read a series of 10 whole numbers by keyboard.
The application must indicate if the numbers are ordered in the following way:
increasing, decreasing, or if they are disorderly
 */
package ejercicio_7;


import java.util.Scanner;

public class Ejercicio_7 {


    public static void main(String[] args) {
       int num;
     Scanner leer = new Scanner(System.in);   
     int[] numeros = new int[10];
     boolean creciente = false, decreciente = false, iguales =false ;
     
     
     // llenar el arreglo
        System.out.println("Llamar el arreglo");
     for(int i=0 ; i<10 ; i++  ){
        System.out.print(+(i+1)+". Ingrese numero: ");
        num = leer.nextInt();
        numeros[i]=num;}
        
        
        for ( int i=0 ; i<9 ; i++ ){
        if (numeros[i] < numeros[i+1] ){creciente = true; }
        if (numeros[i] > numeros[i+1]){decreciente = true; }
        }
        System.out.println("");
        if(creciente == true && decreciente == false ){System.out.println("La serie es crecinte");}
        else if(creciente == false && decreciente == true ){System.out.println("La serie es decreciente");}
        else if(decreciente == true && creciente == true ) {System.out.println("La serie esta desordenada");}
        else if(decreciente == false && creciente == false ) {System.out.println("Todos los numeros son iguales");}
    }
    }
    

