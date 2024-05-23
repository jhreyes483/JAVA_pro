/*
Pedir numero hasta que se teclee un 0, 
mostrar la suma de todos los numeros introdusidos


Ask for a number until a 0 is typed,
show the sum of all the numbers entered
 */
package ejercicio_6;

import javax.swing.JOptionPane;

public class Ejercicio_6 {
 
    public static void main(String[] args) {
   int number=0, counter=0;
        
   
        number =  Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero"));
        
        while (number != 0){
          
       number = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero"));  
       counter = counter + 1;
        }
    JOptionPane.showMessageDialog(null,+counter+ " Intentos ");
     
    }
    
}
