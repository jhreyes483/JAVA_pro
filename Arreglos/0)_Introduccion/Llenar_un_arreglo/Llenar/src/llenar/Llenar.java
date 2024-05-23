/*

 */
package llenar;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Llenar {

    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
        int nElementos;
      
      nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos del arreglo"));
     
      // Crea el Arreglo
      char[] letras = new char [nElementos];
    
      // Pide los elementos del arreglo al usuario
        System.out.println("Digite los elementos del arreglo: ");
     
        for (int i=0 ; i<nElementos ; i++ ){
            
            System.out.println((i+1)+". Digite un caracter; ");
            letras[i] = leer.next().charAt(0); // guarda solo l primer caracter que encuntre  
     
        }
            // Imprime en pantalla 
            System.out.println("\n Los caracteres son: ");
            for (int i=0 ; i<nElementos ; i++){
            System.out.print(letras[i]);}
            System.out.println("");
    
        }
    }
    

