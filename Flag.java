public class Flag {

        private int xf;
        private int yf;
        
        public Flag() {
                xf = -50;
                yf = -50;
        }
        public int getXf(){
                return xf;
        }
        public void setXf(int a){
                xf=a;
        }
        public int getYf(){
                return yf;
        }
        public void setYf(int a){
                yf=a;
        }
        public void reset()
        {
                xf=-50;
                yf=-50;
        }
}
