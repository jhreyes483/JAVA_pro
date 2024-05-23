/*
Crea un programa que lea por teclado una tabla de 10 numeros enteros y despalsce
N posiciones degitadas por el usuario.

Create a program that reads through a keyboard a table of 10 whole numbers and despalsce
N positions taken by the user.
 */
package ejercicio_10;

import java.util.Scanner;

public class Ejercicio_10 {

    public static void main(String[] args) {
    Scanner Leer = new Scanner(System.in);

        // Creacion del arreglo
        int numeros[] = new int[10];
        
        
        
        System.out.println("Lectura de datos: ");
        
        
        // Alamacenamiento de datos
        for(int i=0 ; i<=9 ; i++ ){
        System.out.print(+i+". Ingrese numero: ");
        int numero = Leer.nextInt();
        numeros[i] = numero;
        }
        
        //Almacenar ultimo elementon del arreglo
        int ultimo = numeros[9];
        
        System.out.print("Digite numero de pociciones a retroceder el en arreglo: ");
        int c = Leer.nextInt();
        
        //Retroceder una posicion
        for(int i=8 ; i>=0 ; i--){
            numeros[i+1] = numeros[i];    
        }
         
        
        System.out.println("Nuevo arreglo: ");
        numeros[0] = ultimo;
        for(int i=0 ; i<=9 ; i++){
            System.out.println(+i+"numero: "+numeros[i]);
            
            
        }
     
        }
        

    }
    

