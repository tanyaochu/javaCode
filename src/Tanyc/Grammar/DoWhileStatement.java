package Tanyc.Grammar;
import java.util.*;
public class DoWhileStatement {
    public static void main(String[] args) {
        int a=0,b=1,c;
        Scanner xxx =new Scanner(System.in);
        do {
            System.out.println("请输入一个正整数");
            c=xxx.nextInt();
        }
        while (c<=0);
        while (c>=b)
        {a+=b++;}

        System.out.println("1+2+.....+"+c+"="+a);
    }
}
