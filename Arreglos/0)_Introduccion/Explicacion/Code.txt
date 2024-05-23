/*
Explicacion de arreglos
 */
package exp;

public class Exp {

    public static void main(String[] args) {
    
        int[] numeros = new int [3];    //creacion de arreglo o verctor,  de tres casillas o espacios en  memoria
        
        
        // Asignacion de numeros en las tres casillas
        numeros[0] = 7;
        numeros[1] = 10;
        numeros[2] = 13;        
        
        
        // mostrat en pantalla 
        for (int i=0 ; i<3 ; i++ )
            System.out.println(numeros[i]);
        
    }
    
}
