package z4;

import java.lang.Object;
import java.util.Scanner;
import java.lang.String;

public class z4 {
 public static void main(String[] args){
 String[] res = {"","","","","","",""};
 String[][] num = new String[10][7];
 
 num[0][0]=" ***  ";
 num[0][1]="*   * ";
 num[0][2]="*   * ";
 num[0][3]="*   * ";
 num[0][4]="*   * ";
 num[0][5]="*   * ";
 num[0][6]=" ***  ";
 
 num[1][0]=" *   ";
 num[1][1]="**   ";
 num[1][2]=" *   ";
 num[1][3]=" *   ";
 num[1][4]=" *   ";
 num[1][5]=" *   ";
 num[1][6]="***  ";
 
 num[2][0]=" ***   ";
 num[2][1]="*   *  ";
 num[2][2]="*  *   ";
 num[2][3]="  *    ";
 num[2][4]=" *     ";
 num[2][5]="*      ";
 num[2][6]="*****  ";
 
 num[3][0]=" ***   ";
 num[3][1]="*   *  ";
 num[3][2]="   *   ";
 num[3][3]="  **   ";
 num[3][4]="   *   ";
 num[3][5]="*   *  ";
 num[3][6]=" ***   ";
 
 num[4][0]="   *   ";
 num[4][1]="  **   ";
 num[4][2]=" * *   ";
 num[4][3]="*  *   ";
 num[4][4]="*****  ";
 num[4][5]="   *   ";
 num[4][6]="   *   ";
 
 num[5][0]="*****  ";
 num[5][1]="*      ";
 num[5][2]="*      ";
 num[5][3]=" ****  ";
 num[5][4]="    *  ";
 num[5][5]="    *  ";
 num[5][6]=" ***   ";
 
 num[6][0]=" ****  ";
 num[6][1]="*      ";
 num[6][2]="*      ";
 num[6][3]="****   ";
 num[6][4]="*   *  ";
 num[6][5]="*   *  ";
 num[6][6]="****   ";
 
 num[7][0]="****  ";
 num[7][1]="    * ";
 num[7][2]="   *  ";
 num[7][3]=" ***  ";
 num[7][4]=" *    ";
 num[7][5]="*     ";
 num[7][6]="*     ";
 
 num[8][0]=" ***  ";
 num[8][1]="*   * ";
 num[8][2]=" * *  ";
 num[8][3]="  *   ";
 num[8][4]=" * *  ";
 num[8][5]="*   * ";
 num[8][6]=" ***  ";
 
 num[9][0]=" ***   ";
 num[9][1]="*   *  ";
 num[9][2]="*   *  ";
 num[9][3]=" ***   ";
 num[9][4]="    *  ";
 num[9][5]="    *  ";
 num[9][6]=" ***   ";
 
 System.out.println("Введите число");
 Scanner in = new Scanner(System.in);
 String str = in.nextLine();
 int dlina = str.length();
 int i;
 char b=' ';
 String bb = "";
 int maxn=0;
 for(i=0; i<dlina;i++){
 if(Character.isDigit(str.charAt(i))){
     b = str.charAt(i);
 if(maxn<(int)b-48){
     maxn=(int)b-48;
     bb = Integer.toString(maxn);
     
 }
     }
 }
 
 for(int j=0;j<7;j++){           
       num[maxn][j]=num[maxn][j].replace("*",bb);
    //   System.out.println(num[maxn][j]);
            }
 
 
 for(i=0; i<dlina;i++){
     if(Character.isDigit(str.charAt(i))){
            b = str.charAt(i);
            for(int j=0;j<7;j++){
            
            res[j]+=num[(int) b-48][j];
            }
     }
 }
 for(int j=0;j<7;j++){
            System.out.println(res[j]);
            }
     
 }   
}
