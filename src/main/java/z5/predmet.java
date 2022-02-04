package z5;


import java.util.Comparator;

public class predmet{
    int price;
    int volume;
    int otn;
    String name;    
        public  predmet(String name,int price,int volume){
        this.name=name;
        this.price = price;
        this.volume = volume;
        this.otn = price*100/volume; 
        }
    public static Comparator<predmet> otnC = new Comparator<predmet>() {
 
        @Override
        public int compare(predmet e1, predmet e2) {
            return (int)(e1.otn - e2.otn);
        }
    };
            };