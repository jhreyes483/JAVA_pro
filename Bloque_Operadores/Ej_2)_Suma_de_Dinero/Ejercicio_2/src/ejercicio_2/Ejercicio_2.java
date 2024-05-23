/*Guillermo tiene N dolares.
Luis tiene la mitad de lo que posee Guillermo,
Juan tiene la mitado de lo que posse Luis y guillermo juntos.
hacer un progrma que calcule e imprima la cantidad de dinero que tiene entre los tres*/


package ejercicio_2;

import java.util.Scanner;


public class Ejercicio_2 {

    public static void main(String[] args) {
        
        float guillermo, juan, luis, total;
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese la cuantos dolares tiene guillermo");
        guillermo =leer.nextFloat();
        
        
        luis = guillermo/2;
        juan = (luis+guillermo)/2;
        
       total = guillermo + luis + juan;
        System.out.println("Los tres tiene en total "+ total);
        
       
        
        
        
        
        
        
        
        
     
    }
    
}
