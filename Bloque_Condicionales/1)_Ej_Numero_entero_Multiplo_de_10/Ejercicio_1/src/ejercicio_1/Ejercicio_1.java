
package ejercicio_1;

import javax.swing.JOptionPane;


public class Ejercicio_1 {

    
    public static void main(String[] args) {
        
        
        
       
        
        
         int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero"));  
         
         if(num%10==0){
        JOptionPane.showMessageDialog(null,"El numero es multiplo de 10");}
         else{JOptionPane.showMessageDialog(null, "El numero no es multiplo de 10");}
    
}}
