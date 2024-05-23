/*
Pedir 10sueldos.
Mostrar su suma y cuantos hay mayores de 1000

Ask for 10 wages.
Show your sum and how many are over 1000
 */
package ejercicio_14;

import javax.swing.JOptionPane;

public class Ejercicio_14 {
    

    public static void main(String[] args) {
 int a =1, counterSum=0, salary=1, salaryMore = 0 ;
        

        
        
    for(a=1 ; a<=10 ; a++)
        
        {salary = Integer.parseInt(JOptionPane.showInputDialog("ingrese sueldo "));
        counterSum +=  salary;
        
        if (salary > 1000){salaryMore ++;}   
        
          
        }
        
        System.out.println("la suma de los salarios es: "+salary);
            System.out.println("Los salarios mayores de 1000 son: "+salaryMore);
        
    }
    
}
