/*
Pedir un numero N, mostrar todos los numero del 1 al N

Ask for a number N, show all the numbers from 1 to N

 */
package ejercicio_8;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Ejercicio_8 {

    public static void main(String[] args) {
        int a=0,n=0;
        Scanner leer = new Scanner(System.in);
        
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero"));
    
        for(a=1;a<=n;a++){ 
            System.out.println("Numero: "+a);
     
        }
    }
    
}
