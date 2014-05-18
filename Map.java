import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;


@SuppressWarnings("serial")
public class Map extends JPanel implements MouseListener
{
                Ville capitale= new Ville();
        Flag flagP = new Flag();
        Flag flagC = new Flag();
        Boolean clic = false;
        public void paintComponent(Graphics g)
        {
                Image img;
               
                try 
                {
                        img = ImageIO.read(new File("WorldMap.png"));                         //flux pour aller chercher la carte du monde
                        g.drawImage(img, 0, 0, this.getWidth(),this.getHeight(),this);        //choisie la location du pixel de l'image confondu au pixel cliqu�
                }catch (IOException a)
                {
                        a.printStackTrace();                                                                                // sert a afficher l'erreur
                }
                try 
                {
                        img = ImageIO.read(new File("FlagPlayer2.png"));
                        g.drawImage(img,flagP.getXf()-3,flagP.getYf()-27,this);
                }catch (IOException a)
                {
                        a.printStackTrace();
                }

                try 
                {
                        img = ImageIO.read(new File("FlagCapitale2.png"));
                        System.out.println(flagC.getXf()+" "+flagC.getYf()+" jambon");
                        g.drawImage(img,flagC.getXf()-12,flagC.getYf()-27,this);
                }catch (IOException a)
                {
                        a.printStackTrace();
                }
                
                try {
                                        img = ImageIO.read(new File("menu.png"));
                                        g.drawImage(img,600, 800, 600, 200,this);
                                } catch (IOException e) {
                                        // TODO Auto-generated catch block
                                        e.printStackTrace();
                                }
               ;
                
                
                this.addMouseListener(this);
            
        }
        
        public void mouseClicked(MouseEvent e) 
        {
                
        }   
        public void mouseEntered(MouseEvent arg0)
        {
               
        }
        public void mouseExited(MouseEvent arg0) 
        {
                
        }
        public void mousePressed(MouseEvent e)
        {
            
        }
        public void reset()
        {
                capitale.reset();
                flagC.reset();
                flagP.reset();
                
        }
        public void mouseReleased(MouseEvent e) 
        {
            System.out.println("X = "+e.getX()+" et "+"Y = "+e.getY());
            double distance;
            distance =Math.sqrt((capitale.getXc()-e.getX())*(capitale.getXc()-e.getX())+(capitale.getYc()-e.getY())*(capitale.getYc()-e.getY()));
            System.out.println(distance);   
            flagC.setXf(capitale.getXc());
            flagC.setYf(capitale.getYc());
            flagP.setXf(e.getX());
            flagP.setYf(e.getY());
            clic = true;
        }
}
