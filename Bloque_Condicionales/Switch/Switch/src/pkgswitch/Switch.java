/*
La sentencia switch:

switch (dato)
case 1: Instrucciones1;
        Break;
case 2  Instraucciones2;
        Break;  
case n  InstruccionesN;
        Break;
default; CasoContrario;
        Break;

 */
package pkgswitch;

import javax.swing.JOptionPane;


public class Switch {

    
    public static void main(String[] args) {
        
        int dato;
        
        dato = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entre 1 y 5"));
        
        
        switch (dato){
                case 1: JOptionPane.showMessageDialog(null,"El numero es 1");
                break;
                case 2: JOptionPane.showMessageDialog(null, "El numeror es 2");
                break;
                case 3: JOptionPane.showMessageDialog(null, "El nuemro es 3");
                break;
                case 4: JOptionPane.showMessageDialog(null, "El numero es 3");
                break;
                case 5: JOptionPane.showMessageDialog(null, "El nuemero es 5");
                break;
                default: JOptionPane.showMessageDialog(null, "El nuemero no esta en el rango");
 
    }}}
