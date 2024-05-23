/*
UUn obrero necesita calcular su salario semanal, el cual  se obtiene de la siguiente manera:
- Si trabaja 40 horas o  menos se le paga $16 por hora
- Si trabaja mas de 40 horas se le paga $16 por hora una de las primeras 40 horas y $20 por cada hora extra.
 */
package ejercicio_5;

import javax.swing.JOptionPane;

public class Ejercicio_5 {

    
    public static void main(String[] args) {
        
        int total;
        
       int horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("INgrese cantidad de horas trabajadas"));
        
      if(horasTrabajadas <= 40)  {total =16*horasTrabajadas;
      JOptionPane.showMessageDialog(null,"El valor a pagar es de 16 por hora con un total de: $"+total);
      }else if(horasTrabajadas > 40){
          
          total = (((horasTrabajadas - 40)*20)+640);
          JOptionPane.showMessageDialog(null,"El valor a pagar con las hora extra a $20 es de "+total);
          
      }
      
    }
    
}
