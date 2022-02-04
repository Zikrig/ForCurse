package z5;



import java.util.*;
import java.util.Comparator;


public class z5 {

    public static void main(String[] args){
    System.out.println("Измените код программы, если хотите изменить результат");
    int sumvolum=25;
    int sumcen =0;
    int numberOfPredmets=10;
    int i;
    predmet[] predmets = new predmet[numberOfPredmets]; 
    predmets[0]= new predmet("топор",50,6);
    predmets[1]= new predmet("гвозди",5,20);
    predmets[2]= new predmet("огниво",100,3);
    predmets[3]= new predmet("батончики",90,8);
    predmets[4]= new predmet("палатка",60,12);
    predmets[5]= new predmet("Война и мир",10,5);
    predmets[6]= new predmet("Определитель грибов",70,5);
    predmets[7]= new predmet("Банка с горным воздухом",9,8);
    predmets[8]= new predmet("Сушеные гусеницы",10,3);
    predmets[9]= new predmet("Приставка",20,2);
    
    
    
    Arrays.sort(predmets,predmet.otnC);
    System.out.println("Предметы в рюкзаке");
    for(i=predmets.length-1;i>=0;i--){
    if(predmets[i].volume<sumvolum){
        sumvolum-=predmets[i].volume;
        sumcen+=predmets[i].price;
        System.out.println(predmets[i].name+" Объем "+predmets[i].volume);
    }
    }
    System.out.println("Осталось: "+sumvolum);
    System.out.println("Суммарная ценность: "+sumcen);
    }
}
