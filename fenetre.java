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
        
        
        public Fenetre() 
        {

        	
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

                contentButton.add(next);
                contentButton.add(high_scores);
                contentButton.add(language);
                contentButton.add(quit);


                next.addActionListener(new ActionListener()
                {      			 //Add action listener to play

                        public void actionPerformed(ActionEvent arg0) 
                        {
                            next2 = true;           	                //Execute when button is pressed
                                
                        }
                        
                });
                
    	        high_scores.addActionListener(new ActionListener() 
    	        {			 //Add action listener to language
    	       	 
    	            public void actionPerformed(ActionEvent e)
    	            {
    	            	HighScores.HighScore();//Execute when button is pressed
    	            }
    	        }); 
    	        
                

    	        language.addActionListener(new ActionListener() 
    	        {			 //Add action listener to language
	 
    	        	public void actionPerformed(ActionEvent e)
    	        	{
	                //Execute when button is pressed
	            
    	        	}
    	        }); 
	        
			InputMap keyMap = new ComponentInputMap(quit);			// setting the button to receive action when Alt+F4 is pressed
			keyMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_ALT+KeyEvent.VK_F4, 0), "action");

			ActionMap actionMap = new ActionMapUIResource();
			actionMap.put("action", new Quit());
			
			SwingUtilities.replaceUIActionMap(quit, actionMap);
			SwingUtilities.replaceUIInputMap(quit, JComponent.WHEN_IN_FOCUSED_WINDOW, keyMap);			// setting done

			

			
	        quit.addActionListener(new ActionListener() {			 //Add action listener to button_1
	 
	            public void actionPerformed(ActionEvent e)
	            {
	                System.exit(0);	                //Execute when button is pressed
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

}
