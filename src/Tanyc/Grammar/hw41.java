package Tanyc.Grammar;
import java.util.*;
public class hw41 {
    public static void main(String[] args) {
        Scanner xxx = new Scanner(System.in);
        System.out.println("please input your grade");
        int a;
        a = xxx.nextInt();
        if (a > 100 | a<0) {
            System.out.println("成绩输入有误");
        } else {
            a = a / 10;
            a = a - 5;

            switch (a) {
                case (-5):
                case (-4):
                case (-3):
                case (-2):
                case (-1):
                case (0):
                    System.out.println("你的成绩等级为不及格");
                    break;
                case (1):
                    System.out.println("你的成绩等级为及格");
                    break;
                case (2):
                    System.out.println("你的成绩等级为中");
                    break;
                case (3):
                    System.out.println("你的成绩等级为优");
                    break;
                case (4):
                case (5):
                    System.out.println("你的成绩等级为良");
                    break;
                default:
                    System.out.println("成绩输入有误");

            }
        }
    }
}