/*
Pedir 10 numeros y escribir la suma total

Order 10 numbers and write the total sum
 */
package ejercicio_10;

import javax.swing.JOptionPane;


public class Ejercicio_10 {


    public static void main(String[] args) {
        int number=0, counter=0;
        
        for(int a=0 ; a<10 ; a++){
        
      number =  Integer.parseInt(JOptionPane.showInputDialog("ingrese numero: "));
      
      counter += number;
      
       }
        JOptionPane.showMessageDialog(null,"La suma total es "+counter);
     
    }
    
}
