package z3;

import java.lang.Object;
import java.util.Scanner;
import java.lang.String;
import java.math.BigDecimal;

public class z3 {
    
    
    public static short nofg(String a){
        short noch= 0;
        String alf = "аиоуэяыюеёАИОУЭЯЫЮЕЁ";
        for(int i=0;i<a.length();i++){
           
            for(int j=0;j<alf.length();j++){ 
                
            if(a.charAt(i)==alf.charAt(j)){
               
                noch++;
                //System.out.print("\t"+a.charAt(i));
                break;
                
            }
            }
        }
        return noch;
    }
    
    public static String zam(String a){
        String alf = "аиоуэяыюеёАИОУЭЯЫЮЕЁ";
        String b="";
        boolean first = true,newb=true;   
         for(int i=0;i<a.length();i++){
           newb=true;
            for(int j=0;j<alf.length();j++){ 
               
            if(a.charAt(i)==alf.charAt(j)){
                if(first && j<10){
                    //System.out.println("маленькая");
                    
                    b+=alf.charAt(j+10);
                    newb=false;
                    first=false;
                    break;
                }
                
            }
            
            
            }
            if(newb){b+=a.charAt(i);newb=false;}
        
        }
         return b;
    }
    
    public static void main(String[] args){
         System.out.println("Введите строку, и мы сделаем все остальное");
         Scanner in = new Scanner(System.in);
         String instr = in.nextLine();
         String[] words = instr.split(" ");
         short[] numbgl= new short[words.length];
         
         for(int i=0;i<words.length;i++){
             
             numbgl[i]=nofg(words[i]);
             words[i]=zam(words[i]);
                //System.out.println(words[i]);
                //System.out.println("\n"+words[i]+'\t'+numbgl[i]);
         }
         
         int maxw = -2,ii=0;
         String res="";
         while(maxw!=-1 && words.length>0){
         maxw=-1;
             for(int i=0;i<words.length;i++){
         if(numbgl[i] > maxw){
             maxw=numbgl[i];
             ii=i;
             //System.out.println(maxw);
         }
         
         
        }
            if(maxw!=-1){res+=words[ii]+" ";}
         
         numbgl[ii]=-1;
         //System.out.println(ii);
         
    }
         System.out.println(res);
}
    
}