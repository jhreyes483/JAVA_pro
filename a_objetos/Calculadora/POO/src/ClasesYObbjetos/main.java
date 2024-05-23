/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesYObbjetos;

/**
 *
 * @author Javier Reyes Neira
 */
public class main {
    
    public static void main (String [] args) {
        Operacion op = new Operacion();
        op.leerNumeros();
        op.sumar();
        op.resta();
        op.multiplicacion();
        op.divicion();
        op.mostrarResultados();
        
    }
    
}
