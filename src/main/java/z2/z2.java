package z2;

import java.lang.Object;
import java.util.Scanner;
import java.lang.String;
import java.math.BigDecimal;

public class z2 {
    public static void main(String[] args){
         System.out.println("Введите число для разоложения на множители");
         Scanner in = new Scanner(System.in);
         String instr = in.nextLine();
         int z;
         try
         {
             z = Integer.parseInt(instr);
             int t=2;
         String vyv="";
         while (z>1){
         if(z%t==0){
             vyv+=t+"\t";
             z/=t;
             //System.out.println(z);
         } 
         else{t+=1;
         
         }
         
         }
         System.out.println(vyv);
         }
         catch(NumberFormatException nfe)
                 {
                     System.out.println("ОШИБКА ВВОДА");
                 }
         
    }
}
