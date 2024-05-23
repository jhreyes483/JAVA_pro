//Pedir tres numeros y mostralos ordenados de mayos a menor.
package ejercicio_7;

import javax.swing.JOptionPane;


public class Ejercicio_7 {

    
    public static void main(String[] args) {
       
        int num1, num2, num3;
        
        
        JOptionPane.showMessageDialog(null,"Ingrese tres numeros");
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("1"));   
        num2 = Integer.parseInt(JOptionPane.showInputDialog("2")); 
        num3 = Integer.parseInt(JOptionPane.showInputDialog("3"));
        
        
        if (num1 > num2 && num2 > num3){
        JOptionPane.showMessageDialog(null,"Orden :"+num1+"-"+num2+"-"+num3);
        
        
    }else if(num1 > num3 && num3 > num2){
          JOptionPane.showMessageDialog(null,"Orden :"+num1+"-"+num3+"-"+num2);
    
        
    }else if(num2 > num1 && num3 > num2){
    
}}
