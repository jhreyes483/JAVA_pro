/*
Hacer un programa que lea un caracter por teclado y compruebe si  es una letra mayuscula
 */
package ejercicio_3;

import javax.swing.JOptionPane;

public class Ejercicio_3 {

    public static void main(String[] args) {
      
        char letra;
        
         letra = JOptionPane.showInputDialog("Ingrese el caracter").charAt(0);
         
         
        if (Character.isUpperCase(letra)){ JOptionPane.showMessageDialog(null,"Es una letra mayuscula");
        }else{ JOptionPane.showMessageDialog(null," Es una letra minuscula");
    
}}}
