package Tanyc.Grammar;
import java.util.*;
public class IfStatement {
    public static void main(String[] args) {
                                 //输入三个数，并选出其中最大的和最小的那个
        Scanner xxx=new Scanner(System.in);
        System.out.println("please input 3 numbers");
        int a,b,c,max,min;
        a=xxx.nextInt();
        b=xxx.nextInt();
        c=xxx.nextInt();
        if(a>b)
            max=a;
        else
            max = b;
        if(c>max)
                max=c;
        System.out.println("MAX IS:"+max);
        System.out.println("--------------------------------------");
        min=a<b?a:b;
        min=min<c?min:c;
        System.out.println("MIN IS:"+min);







    }
}
