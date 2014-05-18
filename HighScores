import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class HighScores {

        private static ArrayList<String> high_scores = new ArrayList();
        private static String HighScore;
        
        public static void HighScore() {
                try 
                {
                        Scanner s = new Scanner(new File("high_scores.txt")); //flux txt
                        while(s.hasNextLine())
                        {
                                high_scores.add(s.nextLine()); //remplissage du tableau
                        }
                        s.close();                        
                }
                catch (FileNotFoundException e) 
                {
                        e.printStackTrace();
                }
                
                for (int a=0 ; a<20 ; a++)
                {
                String HSSelect = high_scores.get(a); //ligne selectionné
                int firstSlash = HSSelect.indexOf(47); // int = a la premiere apparition d'un slash depuis le debut
                int secondSlash = HSSelect.indexOf(47,firstSlash+1); // int = a la premeire apparition d'un slash a compter de l'int firstSlash+1                
                
                HighScore = HSSelect.substring(firstSlash,secondSlash);
                System.out.println("The high score number" +a+ "is" + HighScore);
                }
                
        }
     
        public void setCityName(String a)
        {
        	HighScore=a;
        }
        public String getCityName()
        {
                return HighScore;
        }
        public void reset()
        {
                try 
                {
                        Scanner s = new Scanner(new File("capitale.txt")); //flux txt
                        while(s.hasNextLine())
                        {
                        	high_scores.add(s.nextLine()); //remplissage du tableau
                        }
                        s.close();                        
                }
                catch (FileNotFoundException e) 
                {
                        e.printStackTrace();
                }
                for (int a=0 ; a<20 ; a++)
                {
                String HSSelect = high_scores.get(a); //ligne selectionné
                int firstSlash = HSSelect.indexOf(47); // int = a la premiere apparition d'un slash depuis le debut
                int secondSlash = HSSelect.indexOf(47,firstSlash+1); // int = a la premeire apparition d'un slash a compter de l'int firstSlash+1                
                
                HighScore = HSSelect.substring(firstSlash,secondSlash);
                System.out.println("The high score number" +a+ "is" + HighScore);
                }
        }


}
