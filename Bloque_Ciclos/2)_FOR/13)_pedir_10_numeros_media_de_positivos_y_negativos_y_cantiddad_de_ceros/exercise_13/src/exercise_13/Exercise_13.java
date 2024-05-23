/*
Pedir 10 numero.
Mostrar la promedio de los numero positivos,
promedio de los numeros negativos ycantidad de ceros 

Ask for 10 number.
Show the average of the positive numbers,
average of the negative numbers and amount of zeros
 */
package exercise_13;

import javax.swing.JOptionPane;

public class Exercise_13 {

    public static void main(String[] args) {
        
        int counterP=0, counterN=0,counter0=0,  avarageP=1, avarageN=1, avarage0=1 ;
        int counterSumP=0, counterSumN=0, counterSum0=0; 
       
        
       for ( int a=1 ; a<=10 ; a++ ){
           
           
           int number =  Integer.parseInt(JOptionPane.showInputDialog("diguite numero"));
           
           System.out.println("numero "+a);
           
           if(0<number ) {
               counterSumP++ ;
               counterP += number;
               System.out.println("positivos va en "+counterP);
               System.out.println("Numero  positivo "+number);
               
           } else if(  0>number ){
               counterSumN += number;
               counterN ++;
           System.out.println("Numero negativo "+number);
           
       }else if (0 == number ){
          counter0 ++;
        
               System.out.println("cero"+number); }   
    }
    
     avarageN =  counterSumN /counterN ;
     avarageP =  counterSumP / counterP ;
     avarage0 = 0 / counter0;
        //System.out.println("promedio positvios "+avarageP );
        //System.out.println("Conteo de positivos"+counterP);
     
        
        // tratando positivos
        if (counterP == 0 ){System.out.println("No se puede sacar promedio de numeros positivos");}
        else{System.out.println("El pormedio de unmeros negativos es: "+avarageP);              }
 
// tratando negativos
if(counterN == 0){System.out.println("No se peuede sacar promedio de numeros negativos");}
else{System.out.println("El promedio de numeros negativos es: "+avarageN);}

//tratamiento de ceros
System.out.println("el numeros de ceros es: "+counter0);
       
        
        
        
}
}