/*La calificacion final de un estudiante de informatica se calcula con base a las de cuatro
aspectos de su rendimiento academico: participacion, primer examen parcial, segundo examen parcial
segundo examen parcial y exemen final. Sabiendo que las calificaciones anteriores entran  a la calificacion final
con ponderaciones del 10%, 25% 25% y 40% Hacer un programa que calcule e imprima la calificacion final
obtenidad por un estudiante.*/
package ejercicio_5;

import java.util.Scanner;


public class Ejercicio_5 {

    public static void main(String[] args) {
        
        
        float participacion, test1, test2, testFinal, total;
       Scanner leer = new Scanner(System.in);
   
       
        System.out.println("Ingrese nota de participacion ");
        participacion = leer.nextFloat();
        
        System.out.println("Ingrese nota de test 1"); 
        test1 = leer.nextFloat();
        
        System.out.println("Ingrese nota de test 2");
        test2 = leer.nextFloat();
        
        System.out.println("ingrese la nota de testFinal");
        testFinal = leer.nextFloat();
        
        
       // participacion = participacion*0.10f;    reduciondo codigo
       participacion *= 0.10f;
       test1 *= 0.25f;
       test2 *= 0.25f;
       testFinal *= 0.40f;
       
       total = participacion + test1 + test2 + testFinal;
       
       
        System.out.println("Calificacion final es: "+total);
       
       
        
        
        
        
        
        
        
        
  
        
        
        
        
    }
    
}
