
package condicionales;

import javax.swing.JOptionPane;


public class Condicionales {

    public static void main(String[] args) {
        
        int numero, dato = 5;
        
        
        //Operadores
       //  == : Igualdad
        //  != : Desigualdad
                
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        
        if (numero==dato){
            JOptionPane.showMessageDialog(null,"El numero es 5");
        }else{
            JOptionPane.showMessageDialog(null, "El numero no es 5");
        }
        
        
        
    }
    
}
