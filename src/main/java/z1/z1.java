package z1;

import java.lang.Object;
import java.util.Scanner;
import java.lang.String;

public class z1 {
 public static void main(String[] args){
 System.out.println("Введите строку, и мы посчитаем сумму цифр");
 int sum = 0;
 Scanner in = new Scanner(System.in);
 String str = in.nextLine();
 int dlina = str.length();
 int i;
 char b=' ';
 for(i=0; i<dlina;i++){
     if(Character.isDigit(str.charAt(i))){
            b = str.charAt(i);
            sum += (int) b-48;
     }
 }
     System.out.println(sum);
 }   
}
