/*
Leer 5 numeros por teclado, almacenarlos en un arreglo y a continuacion
realizar el promedio de los numeros positivos, negativos y ceros.

Read 5 numbers by keyboard, store them in an array and then
perform the average of positive, negative and zero numbers.
 */
package ejercicio_3;

import javax.swing.JOptionPane;

public class Ejercicio_3 {

    public static void main(String[] args) {

        
        //Varablies de almacenamiento
        int number=1;
        //Contadores
        int counterSumN=0,counterSumP=0, counterN=0, counterP=0, counter0=0;
        
        int[] numeros = new int[5];
        for( int i=0 ; i<5 ; i++){
         
            
        number = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero"));
        numeros[i] = number;
        
        if(number == 0){ System.out.println(+number+" Cero");  
        counter0 ++;}
        
        
        else if(0<number){ System.out.println(number+" Positivo");
        counterSumP  += number;
        counterP ++;}
        
        else if(0>number){System.out.println(number+" Negativo");
        counterSumN += number;
        counterN ++;
        } 
        }


        espacio();
        
      
        System.out.println("Numeros alamacenados en arreglos");
        
        for(int i: numeros ){System.out.println("Numero: "+i);}
        
        espacio();
        espacio();
        
        //Tratando 0
        
        System.out.println("El numero de ceros es: "+counter0);
        
        
        //tratamiento de positivos
        
        if(counterP==0){System.out.println("Conteo de numeros postivos en 0,no se puede sacar promedio");}
        else{
        System.out.println("El promedio de positivos es: "+(counterSumP / counterP));}
        
        //Tratamiento de negativos
        
        
        if(counterN==0){System.out.println("Conteo de numeros negativos en 0, no se puede sacar promedio  ");}
        else
        System.out.println("El promedio "+ (counterSumN / counterP ));  }  
    
    
    public static void   espacio(){System.out.println("");}
    
}