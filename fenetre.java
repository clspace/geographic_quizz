
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ActionMap;
import javax.swing.ComponentInputMap;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;


import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;
import javax.swing.plaf.ActionMapUIResource;



public class Fenetre extends JFrame
{   
        private boolean next2 = false;
        private JButton next = new JButton("Next");
        private JButton play = new JButton("Play");
        private JButton language = new JButton("Langue");
        private JButton quit = new JButton("Quit");
        private JButton high_scores = new JButton("High Scores");
        private Map monde=new Map();
        private Ville capitale;
        private JPanel contentButton = new JPanel();
        Thread timer = new Thread(new Runnable()
        {
                public void run()
                {
                        inifinitLoop();
                        
                }
        });
        
        
        public Fenetre() {

        	
                this.setTitle("Géotest");
                this.setSize(2062,1024);                                                         //dimension de la fenetre
                this.setDefaultCloseOperation(EXIT_ON_CLOSE);                 //Ferme le processus lorsque l'on clique sur la croix rouge
                this.setLocationRelativeTo(null);                                         //centre la fenetre
                this.setContentPane(monde);                                                        //choisi le Jpanel qu'il y aura en fond (mettre l'addresse a partir du dossier du jeu (dans le dossier de travaille
                this.setResizable(true);                                                         //empeche la fenetre de changer de taille
                contentButton.setOpaque(false);
                capitale = new Ville();
                monde.setLayout(new BorderLayout());
                monde.add(contentButton,BorderLayout.SOUTH);

                contentButton.add(play);
                contentButton.add(next);
                contentButton.add(high_scores);
                contentButton.add(language);
                contentButton.add(quit);

      			 //Add action listener to play
                next.addActionListener(new ActionListener(){

                        public void actionPerformed(ActionEvent arg0) 
                        {
           	                //Execute when button is pressed
                            next2 = true;
                                
                        }
                        
                });
                
                

        		
   			 //Add action listener to play
   	        play.addActionListener(new ActionListener() {
   	 
   	            public void actionPerformed(ActionEvent e)
   	            {
   	                //Execute when button is pressed
   	                
   	            }
   	        }); 
   	        

   			
			 //Add action listener to language
	        language.addActionListener(new ActionListener() {
	 
	            public void actionPerformed(ActionEvent e)
	            {
	                //Execute when button is pressed
	                
	            }
	        }); 
	        
			// setting the button to receive action when Alt+F4 is pressed
			InputMap keyMap = new ComponentInputMap(quit);
			keyMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_ALT+KeyEvent.VK_F4, 0), "action");

			ActionMap actionMap = new ActionMapUIResource();
			actionMap.put("action", new Quit());
			
			SwingUtilities.replaceUIActionMap(quit, actionMap);
			SwingUtilities.replaceUIInputMap(quit, JComponent.WHEN_IN_FOCUSED_WINDOW, keyMap);
			// setting done
			

			
			 //Add action listener to button_1
	        quit.addActionListener(new ActionListener() {
	 
	            public void actionPerformed(ActionEvent e)
	            {
	                //Execute when button is pressed
	                System.exit(0);
	            }
	        }); 
	    
   	    
                
                
                
                
                
                
                this.setVisible(true);                                                                // permet que la fenetre soit visible
                timer.start();
                
        }
        public void inifinitLoop()
        {
                do
                {
                        monde.repaint();
                        monde.clic = false;
                        while(!monde.clic)
            {
                                monde.repaint();
            }
                        next2=false;
                        while (!next2)
                        {
                                monde.requestFocus();
                        }
                        monde.reset();
                        
                }while(true);
        }
        public static void main(String[] args) {
        new Fenetre();        
        
        }
