package Ejecuciones;
import Modelos.*;
import java.awt.*;
import java.util.ArrayList;
public class Main {
    
    public static int Aleatorio(int Max, int Min)
    {
        return (int) (Math.random() *(Max-Min));
    }
    
    
    public static void main(String[] args) {
        
      Ventana nuestraventana = new Ventana("Juego de naves");
      ArrayList ArregloDeObjetos = new ArrayList();
      Coordenada cor1 = new Coordenada(250,250);
      Coordenada cor2 = new Coordenada(500,300);
      
      //nave
      Coordenada cor3 = new Coordenada(475,475); // la punta
      Coordenada cor4 = new Coordenada(400,575); //esquina izquierda
      Coordenada cor5 = new Coordenada(550,575); //esquina derecha
      
      NaveGrafico nave = new NaveGrafico(cor3,cor4,cor5,Color.BLACK);
      
 
      TextoGrafico Vidas = new TextoGrafico("Vidas",Color.BLACK,1700,50);
      Vidas.setSize(35);
      ArregloDeObjetos.add(Vidas);
      TextoGrafico Score = new TextoGrafico("Puntos",Color.BLACK,1700,250);
      Score.setSize(35);
      ArregloDeObjetos.add(Score);
      
      
      TextoGrafico Puntaje = new TextoGrafico("0",Color.RED,1700,350);
      Puntaje.setSize(40);
      ArregloDeObjetos.add(Puntaje);
      TextoGrafico Nrvidas = new TextoGrafico("3",Color.RED,1700,150);
      Nrvidas.setSize(40);
      ArregloDeObjetos.add(Nrvidas);
      TextoGrafico textofinal = new TextoGrafico("Fin de juego Gracias! ;)",Color.black,900,700);
      textofinal.setSize(45);
      
   
      int rango = Aleatorio(800,50);
      Coordenada Salida = new Coordenada(rango,0);
      RectanguloGrafico Asteroide1 = new RectanguloGrafico(Salida,25,25,Color.red);
      int rango1 = Aleatorio(800,50);
      Coordenada Salida1 = new Coordenada(rango1,0);
      RectanguloGrafico Asteroide2 = new RectanguloGrafico(Salida1,25,25,Color.red);
      int rango2 = Aleatorio(800,50);
      Coordenada Salida2 = new Coordenada(rango2,0);
      RectanguloGrafico Asteroide3 = new RectanguloGrafico(Salida2,25,25,Color.red);
      int rango3 = Aleatorio(800,50);
      Coordenada Salida3 = new Coordenada(rango3,0);
      RectanguloGrafico Asteroide4 = new RectanguloGrafico(Salida3,25,25,Color.red);
      int rango4 = Aleatorio(800,50);
      Coordenada Salida4 = new Coordenada(rango4,0);
      RectanguloGrafico Asteroide5 = new RectanguloGrafico(Salida4,25,25,Color.red);
      ArregloDeObjetos.add(Asteroide1);
      ArregloDeObjetos.add(Asteroide2);
      ArregloDeObjetos.add(Asteroide3);
      ArregloDeObjetos.add(Asteroide4);
      ArregloDeObjetos.add(Asteroide5);
      ArregloDeObjetos.add(nave);  
      
     
      PanelFG nuestroPanel = new PanelFG(ArregloDeObjetos);
      nuestroPanel.refNave(nave);
      nuestroPanel.refAst(Asteroide1, Asteroide2, Asteroide3, Asteroide4, Asteroide5);
      nuestroPanel.RefFinal(textofinal);
      nuestroPanel.Refvida(Nrvidas);
      nuestroPanel.RefPuntos(Puntaje);
      
      nuestraventana.add(nuestroPanel);
      nuestraventana.setSize(1000,600);
      nuestraventana.setVisible(true);
      nuestroPanel.iniciar();
  
      
      
      
      
      
      
      
        
    }
    
}
