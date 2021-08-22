package Tanyc.Grammar;
import java.util.*;
public class WhileStatement2 {
    public static void main(String[] args) {
                        //录入一个数，判断是否是斐波那契数列中的数
        System.out.println("please input a number");
        int i=0,j=1,k,num;
        Scanner xxx=new Scanner(System.in);
        num=xxx.nextInt();
        while (j<num){
            k=i+j;
            i=j;
            j=k;
        }
       if(num==j){
           System.out.println(num+"是斐波那契数");
       }
        else System.out.println(num+"不是斐波那契数");

    }
}
