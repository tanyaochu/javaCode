package Tanyc.Grammar;
import java.util.*;
public class hw42 {
    public static void main(String[] args) {
        Scanner xx= new Scanner(System.in);
        System.out.println("please input your grade");
    int a ;
        a = xx.nextInt();
        if (a > 100 | a<0) {
            System.out.println("成绩输入有误");
        }
        else if (a>=0 & a<=69){
            a = a / 10;
            a = a - 5;

            switch (a) {
                case (-5):
                case (-4):
                case (-3):
                case (-2):
                case (-1):
                case (0):
                    System.out.println("你的成绩等级为D");
                    break;
                case (1):
                    System.out.println("你的成绩等级为C");
                    break;


            }
        }
        else if(a>=70 & a<=84)
        {
            a =a -70;
            a=a/14;
            switch (a){
                case (0):
                case (1):
                    System.out.println("你的成绩等级为B");
                    break;
            }
        }
        else if (a>=85 & a<=100)
        {
            a=a-85;
            a = a/15;
            switch (a){
            case (0):
            case (1):
                System.out.println("你的成绩等级为A");
                break;
        }
        }












    }
}
