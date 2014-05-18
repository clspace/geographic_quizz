import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Ville 
{
        
        private int xc;
        private int yc;
        private ArrayList<String> cityList = new ArrayList();
        private String cityName;
        private int r;
        
        public Ville() {
                //r = (int)(Math.random()*177)+1;
                r=(int)(Math.random()*3)+57;
                try 
                {
                        Scanner s = new Scanner(new File("capitale.txt")); //flux txt
                        while(s.hasNextLine())
                        {
                                cityList.add(s.nextLine()); //remplissage du tableau
                        }
                        s.close();                        
                }
                catch (FileNotFoundException e) 
                {
                        e.printStackTrace();
                }
                String citySelect = cityList.get(r); //ligne selectionn�
                int firstSlash = citySelect.indexOf(47); // int = a la premiere apparition d'un slash depuis le debut
                int secondSlash = citySelect.indexOf(47,firstSlash+1); // int = a la premeire apparition d'un slash a compter de l'int firstSlash+1
                int thirdSlash = citySelect.indexOf(47,secondSlash+1);
                int lastSlash = citySelect.indexOf(47, thirdSlash+1);
                

                cityName = citySelect.substring(secondSlash+1,thirdSlash);
                xc = Integer.parseInt(citySelect.substring(thirdSlash+1,lastSlash)); //convertie en integer une partie de string
                yc = Integer.parseInt(citySelect.substring(lastSlash+1));
                System.out.println(cityName + " "+xc+" "+yc);
                
        }
        public void setXc(int a){
                xc=a;
        }
        public int getXc()
        {
                return xc;
        }
        public void setYc(int a)
        {
                yc=a;
        }
        public int getYc()
        {
                return yc;
        }
        public void setCityName(String a)
        {
                cityName=a;
        }
        public String getCityName()
        {
                return cityName;
        }
        public void reset()
        {
                r=(int)(Math.random()*3)+57;
                try 
                {
                        Scanner s = new Scanner(new File("capitale.txt")); //flux txt
                        while(s.hasNextLine())
                        {
                                cityList.add(s.nextLine()); //remplissage du tableau
                        }
                        s.close();                        
                }
                catch (FileNotFoundException e) 
                {
                        e.printStackTrace();
                }
                String citySelect = cityList.get(r); //ligne selectionn�
                int firstSlash = citySelect.indexOf(47); // int = a la premiere apparition d'un slash depuis le debut
                int secondSlash = citySelect.indexOf(47,firstSlash+1); // int = a la premeire apparition d'un slash a compter de l'int firstSlash+1
                int thirdSlash = citySelect.indexOf(47,secondSlash+1);
                int lastSlash = citySelect.indexOf(47, thirdSlash+1);
                

                cityName = citySelect.substring(secondSlash+1,thirdSlash);
                xc = Integer.parseInt(citySelect.substring(thirdSlash+1,lastSlash)); //convertie en integer une partie de string
                yc = Integer.parseInt(citySelect.substring(lastSlash+1));
                System.out.println(cityName + " "+xc+" "+yc);
        }

}
