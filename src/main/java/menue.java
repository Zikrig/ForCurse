import java.lang.Object;
import java.util.Scanner;
import java.lang.String;
import z1.*;
import z2.*;
import z3.*;
import z4.*;
import z5.*;
public class menue {

    public static void main(String[] args) {
    System.out.println("Введите номер задания");
    Scanner in = new Scanner(System.in);
    String stroka = in.nextLine();
    int z = Integer.parseInt(stroka);
    switch(z){
    case(1):{
    z1 zadanie = new z1();
    zadanie.main(args);
    break;
    }
    case(2):{
    z2 zadanie = new z2();
    zadanie.main(args);
    break;
    }
    case(3):{
    z3 zadanie = new z3();
    zadanie.main(args);
    break;
    }
    case(4):{
    z4 zadanie = new z4();
    zadanie.main(args);
    break;
    }
    case(5):{
    z5 zadanie = new z5();
    zadanie.main(args);
    break;
    }
    default:{
    System.out.println("Вы ввели что-то не так");
            break;
    }
    
    }
    
    }
    
}
