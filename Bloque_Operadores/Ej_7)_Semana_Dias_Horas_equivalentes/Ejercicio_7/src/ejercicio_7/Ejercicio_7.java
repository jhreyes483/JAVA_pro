/*Construir un programa que, dado un numero total de horas, devuelva el numero de semanas, dias
y horas equivalentes. Por ejemplo, dado un total de 1000 horas debe mostrar 5 semana, 6 dias y 16 horas.*/

package ejercicio_7;

import java.util.Scanner;

public class Ejercicio_7 {


    public static void main(String[] args) {
       
   Scanner leer = new Scanner(System.in);
   
  int semanas, dias, horasTotales, horas;
   
        System.out.println("Ingrese horas");
        horasTotales = leer.nextInt();
      
        
        //semana = 168 horas
       
        semanas = horasTotales / 168;
        dias = horasTotales%168 / 24;
        horas = horasTotales%24;
        
        
        System.out.println("El equivalente es :\nSemanas:"+semanas+"\nDias: "+dias+"\nHoras: "+horas);
       
    }
    
}
