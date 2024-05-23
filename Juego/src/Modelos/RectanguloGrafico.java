package Modelos;
import java.awt.Color;
import java.awt.Graphics;

public class RectanguloGrafico extends Rectangulo implements Dibujable{

    Color color;
    
    public RectanguloGrafico(Coordenada cor,float x, float y, Color uncolor)
    {
        super(cor,x,y);
        this.color = uncolor;
    }
    
    @Override
    public void dibujar(Graphics dw) {
    
     dw.setColor(color);
     dw.fillRect((int)this.getX(),(int)this.getY(),(int)this.Getlado(1),(int)this.Getlado(2));
    }
    
    public static int Aleatorio(int Max, int Min)
    {
        return (int) (Math.random() *(Max-Min));
    }
    
    public void Ciclo(int mov)
    {
        float x = this.getY();
        this.setY(x += mov);
    }

    void pintar(Color a) {
        this.color =a;
    }
    

}
