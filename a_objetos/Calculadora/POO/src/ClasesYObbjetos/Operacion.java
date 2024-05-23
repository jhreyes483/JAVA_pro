
package ClasesYObbjetos;

import javax.swing.JOptionPane;

public class Operacion {
    //atributos
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    int divicion;
    
    //Metodos
    
    //crear metodo para pedirle al usuario que digite 2 numeros
    public void leerNumeros(){
        
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite numero"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite numero"));  
        
        }
  
    
        
    //Metodo para sumar ambos numeros
    public void sumar(){
        suma = numero1+numero2;
    }
    
    //Metodo para restar ambos numeros
    public void resta(){
        resta = numero1-numero2;
    }
    
    //Metodo para multiplicar ambos numeros
    public void multiplicacion(){
        multiplicacion= numero1*numero2; 
    }
    
    //Metodo para dividir ambos numeros
    public void divicion(){
        divicion = numero1/numero2;
    }

    
    
    public void mostrarResultados(){
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicacion es: "+multiplicacion);
        System.out.println("La divicion es: "+divicion);
      
        
    }
    
    
    
    
}

