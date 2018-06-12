/**
 *
 * @author Viruz
 */

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import javax.swing.JFrame;
public class Carrito extends JFrame implements ComponentListener{
    private int x ;
    private int y;
   
   public Carrito(){
        super ("Viruz Blog: Carrito con ComponentEvent");
        setSize(700,500);
        addComponentListener(this);
        setLayout(null);
        //Color color = new Color(253,149,241);
        setBackground(Color.GREEN);
        setVisible(true);
        setLocationRelativeTo(null);
    }

   public void componentResized(ComponentEvent e){
        Component c = e.getComponent();
        x=c.getSize().width;
        y=c.getSize().height;
        repaint();
    }
   
    @Override
   public void paint(Graphics g){
        //g.clearRect limpia todos los dibujos para asignar nuevas coordenadas.
        g.clearRect(0, 0, x, y);

        Font f1 = new Font("Arial",Font.ITALIC,x/20);
        g.setFont(f1);
        g.drawString("Viruz Movil",300*x/700,130*y/500);

        g.setColor(new Color(62,205,234));//cuadro de arriba
        g.fillRect(350*x/700,200*y/500,100*x/700,50*y/500);
        g.setColor(new Color(73,245,139));;//cuadro esquina izquierda
        g.fillRect(500*x/700,200*y/500,50*x/700,50*y/500);
        g.setColor(new Color(252,248,70));//ovalo entre los dos cuadros
        g.fillOval(450*x/700,200*y/500,50*x/700,100*y/500);
        g.setColor(Color.BLACK);//parabirsas
        g.drawLine(350*x/700,200*y/500,200*x/700,300*y/500);
        g.setColor(new Color(62,205,234));//rectangulo
        g.fillRect(150*x/700,250*y/500,400*x/700,50*y/500);
        g.setColor(Color.BLACK);//llanta izquierda
        g.fillOval(210*x/700,270*y/500,60*x/700,60*y/500);
        g.setColor(Color.WHITE);//llanta pequena izquierda
        g.fillOval(220*x/700,280*y/500,40*x/700,40*y/500);
        g.setColor(Color.BLACK);//llanta derecha
        g.fillOval(450*x/700,270*y/500,60*x/700,60*y/500);
        g.setColor(Color.WHITE);//lanta pequena derecha
        g.fillOval(460*x/700,280*y/500,40*x/700,40*y/500);
        g.setColor(Color.BLACK);//contorno llanta izquierda
        g.drawArc(200*x/700,261*y/500,75*x/700,75*y/500,0,180);
        g.setColor(Color.BLACK);//contorno llanta derecha
        g.drawArc(443*x/700,261*y/500,75*x/700,75*y/500,0,180);
        g.setColor(Color.BLACK);//volante exterior
        g.fillArc(305*x/700,225*y/500,20*x/700,50*y/500,0,180);
        g.setColor(Color.WHITE);//volante interior
        g.fillArc(310*x/700,230*y/500,10*x/700,40*y/500,0,180);  
    }

    public void componentMoved(ComponentEvent e) {
    }

    public void componentShown(ComponentEvent e) {
    }

    public void componentHidden(ComponentEvent e) {
    }
}