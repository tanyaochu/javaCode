package Tanyc.Grammar;
import java.util.*;
import  java.io.IOException;
public class SwitchStatement {
    public static void main(String[] args) throws IOException {
                                //用户输入算法进行计算
      double a,b;
        char oper;
        Scanner xxx =new Scanner(System.in);
        System.out.println("please input two number a and b");
        a=xxx.nextDouble();
        b=xxx.nextDouble();
        System.out.println("please input a operational character");
        oper= (char)System.in.read();
        switch (oper){
            case '+' :
                System.out.println(a+"+"+b+"="+(a+b));
                break;
              case '-' :
                System.out.println(a+"-"+b+"="+(a-b));
                break;
              case '*' :
                System.out.println(a+"*"+b+"="+(a*b));
                break;
              case '/' :
                System.out.println(a+"/"+b+"="+(a/b));
            break;
            default:
                System.out.println("input error");




        }






    }
}
