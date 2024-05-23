/*
Pedir dos numero y decir cual es el mayor o si son iguales
 */
package ejercicio_2;

import javax.swing.JOptionPane;


public class Ejercicio_2 {

    public static void main(String[] args) {
        
       int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese primer nuemero"));
       int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));  
       
       if (num1==num2){ JOptionPane.showMessageDialog(null, "Los numeros son iguales");}
       else if(num1>num2){ JOptionPane.showMessageDialog(null, +num1+" es mayor que "+num2);}
       else if(num1<num2){ JOptionPane.showMessageDialog(null,+num2+" es mayo que "+num1);}   
}}
