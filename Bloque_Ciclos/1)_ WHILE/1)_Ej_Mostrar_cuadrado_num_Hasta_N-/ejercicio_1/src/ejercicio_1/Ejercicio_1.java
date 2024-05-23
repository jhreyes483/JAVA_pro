//Leer un numero y mostrar su cuadrado, repetir el proceso hadta que se introduzaca un numero negativo
package ejercicio_1;

import javax.swing.JOptionPane;

public class Ejercicio_1 {

   
    public static void main(String[] args) {
        
        int base=2, exponente=1, cua=1;
        
        
          
        
        exponente =  Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero"));
        
       while(base > 0 && exponente > 0 ){
      
        cua = (int) Math.pow(base, exponente );
        
        
        JOptionPane.showMessageDialog(null,"El resultado es: "+cua);
        
        exponente = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero"));

     }
        
       
       
       
     
        
        
        
       
    }
    
}
