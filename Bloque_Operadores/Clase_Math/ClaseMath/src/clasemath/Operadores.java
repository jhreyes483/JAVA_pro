
package clasemath;


public class Operadores {

  
    public static void main(String[] args) {
    
        
        double raiz = Math.sqrt(9);
        System.out.println(raiz);
        
        
        
        int raiz2 = (int)Math.sqrt(8);//
        System.out.println("La raiz despues de comprecion en int "+raiz2);
        
        
        // Definicion de pow
        double base = 5, exponente = 2;
        
        double resultado = Math.pow(base, exponente);
        System.out.println("5 elebado a la 2 es :"+resultado);
        
        
        // Metodo randon 
        double numero = Math.random();
        System.out.println("utilizando el metodo random "+numero);
  
   

    }
    
}
