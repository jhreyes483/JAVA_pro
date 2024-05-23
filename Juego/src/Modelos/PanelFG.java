package Modelos;
import static Modelos.RectanguloGrafico.Aleatorio;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.JPanel;

public class PanelFG extends JPanel implements KeyListener{ 
    
    ArrayList v;
    ArrayList ast = new ArrayList();
    NaveGrafico nave;
    Coordenada movimientoIzq = new Coordenada(-25,0);
    Coordenada movimientoDer = new Coordenada(25,0);
    Coordenada movimientoNulo = new Coordenada(0,0);

    Boolean FinDejuego = true;
    int ContadorAsteroides = 5;
    int Score;
    int Vidas = 3;
    int Mov = 10;
    int MAXAST = 5;
            
    TextoGrafico puntos;
    TextoGrafico vidas;
    TextoGrafico Final;
    TextoGrafico TextoNivel = new TextoGrafico("NIVEL",Color.BLACK,1700,500);
    TextoGrafico TextoNrNivel = new TextoGrafico("1",Color.RED,1700,600);
    
    public PanelFG(ArrayList vectordeO)
    {
        this.v =  vectordeO;
        this.addKeyListener(this);
        setFocusable(true);
    }
   
    @Override
    public void paint(Graphics g) 
    {    
        Dimension d = getSize();
        Image Imagen = createImage(d.width,d.height);
        Graphics buff = Imagen.getGraphics();

        Dibujable dib;
        for(int i=0;i<v.size();i++)
        {
            dib = (Dibujable)v.get(i);
            dib.dibujar(buff); 
        }     
        g.drawImage(Imagen, 0, 0,null);       
        
    }
    
    @Override
    public void update(Graphics g)
    {
        paint(g);
    }
    
    
    @Override
    public void keyTyped(KeyEvent ke) {}

    @Override
    public void keyPressed(KeyEvent e) {
        
        int tecla = e.getKeyCode();
        if(tecla ==  KeyEvent.VK_LEFT)
        {
            if(nave.cor1.getX() > 0)
                this.nave.mover(movimientoIzq);     
        }
        
        if(tecla ==  KeyEvent.VK_RIGHT)
        {
            if(nave.cor2.getX() < 800)
            this.nave.mover(movimientoDer);      
        }     
        
        if(tecla ==  KeyEvent.VK_Q)
        {
            CirculoGrafico bala = nave.Bala();
            nave.balas.add(bala);
            v.add(bala);
        }
    
    }

    @Override
    public void keyReleased(KeyEvent e) {
    
        int tecla = e.getKeyCode();
        
        if(tecla ==  KeyEvent.VK_LEFT)
        {
 
            this.nave.mover(movimientoNulo);
        }     
        if(tecla ==  KeyEvent.VK_RIGHT)
        {
            this.nave.mover(movimientoNulo);
        }
        if(tecla ==  KeyEvent.VK_Q){}
        
    }
    
    public void refNave(NaveGrafico n)
    {
        this.nave = n;
    }
   
    public void refAst(RectanguloGrafico a,RectanguloGrafico b,
            RectanguloGrafico c,RectanguloGrafico d,RectanguloGrafico e)
    {
        ast.add(a);
        ast.add(b);
        ast.add(c);
        ast.add(d);
        ast.add(e);
    }
    
    public void RefPuntos(TextoGrafico a){
        this.puntos = a;
    }
    public void Refvida(TextoGrafico b){
        this.vidas = b;
    }
    public void RefFinal(TextoGrafico c){
        this.Final = c;       
    }
            
    
    public void Colision()
    {
        int i,j;
        for(i=0;i<nave.balas.size();i++)
        {
            CirculoGrafico bala = (CirculoGrafico) nave.balas.get(i);
            for(j=0;j<ast.size();j++)
            {
                RectanguloGrafico aste = (RectanguloGrafico) ast.get(j);
                
                Coordenada Corbala = new Coordenada(bala.getX(),bala.getY());
                
                Coordenada Derecha = new Coordenada(aste.getX()+35,aste.getY());
                Coordenada Izquierda = new Coordenada(aste.getX()-35,aste.getY());
                Coordenada medio = new Coordenada(aste.getX(),aste.getY());
                
                if((Corbala.getX() > Izquierda.getX()) && (Corbala.getX() < Derecha.getX()) 
                        && Corbala.getY() < medio.getY()  && Corbala.getY()+25 > medio.getY() )
                {
                    aste.pintar(Color.WHITE);
                    bala.pintar(Color.WHITE);
                    v.remove(bala);
                    ast.remove(aste);                   
                    bala.setY(2000);
                    aste.setY(2000);
                    nave.balas.remove(bala);
                    ast.remove(aste);
                    ContadorAsteroides--; 
                    Score+=5;
                    puntos.SetColor(Color.WHITE);
                    String NuevoScore = ""+Score;
                    TextoGrafico Nrpuntos = new TextoGrafico (NuevoScore,Color.RED,1700,350);
                    Nrpuntos.setSize(40);
                    puntos = Nrpuntos;
                    v.add(puntos);
 
                } 
                if((medio.getY() > 475 && medio.getY() < 550) && (nave.cor1.getX() < medio.getX())
                        && (nave.cor2.getX() > medio.getX()))
                {
                    Score = Score -5;
                    Vidas--;
                    String NuevoScore = ""+Score;
                    String NuevasVidas =""+Vidas;
                    puntos.SetColor(Color.WHITE);
                    vidas.SetColor(Color.WHITE);
                    TextoGrafico Nrvidas = new TextoGrafico(NuevasVidas,Color.RED, 0x6a4,150);
                    Nrvidas.setSize(40);
                    vidas = Nrvidas;
                    TextoGrafico NrPuntos = new TextoGrafico(NuevoScore,Color.RED,1700,350);
                    NrPuntos.setSize(40);
                    puntos = NrPuntos;
                    v.add(vidas);
                    v.add(puntos);        
                    ast.remove(aste);
                    aste.setY(2000);
                    ContadorAsteroides--;
                    
                }

            }
            
        }
          
    }
    
    
    public void iniciar()
    { 
        while(FinDejuego)
        {          
            try{
                if(!nave.balas.isEmpty())
                {
                    nave.Ciclo();
                }
                
           int i;
            for(i=0;i<ast.size();i++)
            {
               RectanguloGrafico rect = (RectanguloGrafico) ast.get(i);
               rect.Ciclo(Mov);
               
               if(rect.getY() > 525)
                 {
                        int rango = Aleatorio(800,50);
                        rect.setY(0);
                        rect.setX(rango);
                  }             
            }
            
            
            if(ContadorAsteroides < MAXAST)
            {             
                int rango = Aleatorio(800,50);
                Coordenada Inicio = new Coordenada(rango,0);
                RectanguloGrafico nuevo = new RectanguloGrafico(Inicio,25,25,Color.RED);
                ast.add(nuevo);
                v.add(nuevo);
                nuevo.Ciclo(Mov);
                ContadorAsteroides++;
          
            }
            int Nivel = 1;
            TextoNivel.setSize(50);
            TextoNrNivel.setSize(40);
            TextoGrafico LautaroPalacin = new TextoGrafico("Lautaro Palacin",Color.BLACK,1750,1100);
            LautaroPalacin.setSize(20);
            v.add(TextoNrNivel);
            v.add(TextoNivel);
            v.add(LautaroPalacin);
            
            if(Score >= 50 && Score < 100)
            {
                Nivel = 2;
                String NuevoNivel = ""+Nivel;
                TextoNrNivel.SetColor(Color.WHITE);
                TextoGrafico Nrnivel = new TextoGrafico(NuevoNivel,Color.RED,1700,600);
                Nrnivel.setSize(40);
                TextoNrNivel = Nrnivel;
                v.add(TextoNrNivel);
                Mov = 12;
                MAXAST = 6;
                for(i=0;i<ast.size();i++)
                {
                        RectanguloGrafico rect = (RectanguloGrafico) ast.get(i);
                        rect.pintar(Color.GREEN);
                }
            }
            
            if(Score >= 100 && Score < 150)
            {
                Nivel = 3;
                String NuevoNivel = ""+Nivel;
                TextoNrNivel.SetColor(Color.WHITE);
                TextoGrafico Nrnivel = new TextoGrafico(NuevoNivel,Color.RED,1700,600);
                Nrnivel.setSize(40);
                TextoNrNivel = Nrnivel;
                v.add(TextoNrNivel);
                Mov = 14;
                MAXAST = 7;
                for(i=0;i<ast.size();i++)
                {
                        RectanguloGrafico rect = (RectanguloGrafico) ast.get(i);
                        rect.pintar(Color.BLUE);
                }
                
            }
            
            if(Score >= 150 && Score < 200)
            {

                Nivel = 4;
                String NuevoNivel = ""+Nivel;
                TextoNrNivel.SetColor(Color.WHITE);
                TextoGrafico Nrnivel = new TextoGrafico(NuevoNivel,Color.RED,1700,600);
                Nrnivel.setSize(40);
                TextoNrNivel = Nrnivel;
                v.add(TextoNrNivel);
                Mov = 15;
                MAXAST = 8;
                for(i=0;i<ast.size();i++)
                {
                        RectanguloGrafico rect = (RectanguloGrafico) ast.get(i);
                        rect.pintar(Color.PINK);
                }
                
            }
            
            if(Score >= 200 && Score < 250)
            {
                Nivel = 5;
                String NuevoNivel = ""+Nivel;
                TextoNrNivel.SetColor(Color.WHITE);
                v.add(TextoNrNivel);
                TextoGrafico Nrnivel = new TextoGrafico(NuevoNivel,Color.RED,1700,600);
                Nrnivel.setSize(40);
                TextoNrNivel = Nrnivel;
                v.add(TextoNrNivel);
                Mov = 17;
                MAXAST = 9;
                for(i=0;i<ast.size();i++)
                {
                        RectanguloGrafico rect = (RectanguloGrafico) ast.get(i);
                        rect.pintar(Color.YELLOW);
                }
            }
            
            if(Score >= 250 && Score < 300)
            {
                Nivel = 6;
                String NuevoNivel = ""+Nivel;
                TextoNrNivel.SetColor(Color.WHITE);
                v.add(TextoNrNivel);
                TextoGrafico Nrnivel = new TextoGrafico(NuevoNivel,Color.RED,1700,600);
                Nrnivel.setSize(40);
                TextoNrNivel = Nrnivel;
                v.add(TextoNrNivel);
                Mov = 20;
                MAXAST = 11;
                for(i=0;i<ast.size();i++)
                {
                        RectanguloGrafico rect = (RectanguloGrafico) ast.get(i);
                        rect.pintar(Color.BLACK);
                }
            }
            if(Score >= 350)
            {
                Nivel = 7;
                String NuevoNivel = ""+Nivel;
                TextoNrNivel.SetColor(Color.WHITE);
                v.add(TextoNrNivel);
                TextoGrafico Nrnivel = new TextoGrafico(NuevoNivel,Color.RED,1700,600);
                Nrnivel.setSize(40);
                TextoNrNivel = Nrnivel;
                v.add(TextoNrNivel);
                Mov = 22;
                MAXAST = 13;
                for(i=0;i<ast.size();i++)
                {
                        RectanguloGrafico rect = (RectanguloGrafico) ast.get(i);
                        rect.pintar(Color.ORANGE);
                }
            }
            if(Vidas <= 0)
            {
                FinDejuego = false;
                v.add(Final);
            }
            Colision();  
            
              Thread.sleep(30);  
            }catch(InterruptedException err){System.out.println(err);}
            
            repaint();
        }
    }
    
    
    
}
