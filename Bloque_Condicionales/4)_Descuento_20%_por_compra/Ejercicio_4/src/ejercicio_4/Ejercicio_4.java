/*
En MegaPlaza se hace un 20% de descuento a los clientes cuya compra supere
los 300. 

Cual sera la cantidad que pagara una persona por su compra
 */
package ejercicio_4;


import javax.swing.JOptionPane;


public class Ejercicio_4 {

    
    public static void main(String[] args) {
        
 
     int compra =  Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de su compra $"));
        
       
      if(compra > 300){
              
          int  Total = (int)  (-((compra*0.20)-compra));
            JOptionPane.showMessageDialog(null,"El valor de su compra con un descuento del 20 % es $"+Total);
           
      }else{ JOptionPane.showMessageDialog(null, " No aplica descuento, el valor de su compra es $"+compra ); }
    }}
    

