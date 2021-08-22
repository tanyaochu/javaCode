package Tanyc.Grammar;

import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
                                                //运算符类型：+ - * / %
        System.out.println(5/2);
        System.out.println(5.0/2);//带有小数类型的数值，除法的结果才有小数
        System.out.println(5%2);//取模
        System.out.println(4%2);
        System.out.println("---------------------");

                                                //数值拆分
        Scanner abc = new Scanner(System.in);
        System.out.println("请输入一个三位数");
        int num = abc.nextInt();
        int bai = num /10 /10 %10;
        int shi = num /10 %10;
        int ge = num  %10;
        System.out.println("该整数"+num+"的百位是："+bai);
        System.out.println("该整数"+num+"的十位是："+shi);
        System.out.println("该整数"+num+"的个位是："+ge);
        System.out.println(1+99+"分！耶！");
        System.out.println("谭耀楚"+666);
        System.out.println("---------------------");

                                                //自增自减运算符(只能操作变量)
        int xyz = 10;
        xyz++;
        --xyz;
        xyz--;
        System.out.println(xyz);
        int a = 10;
        int b = ++a;
        System.out.println(a);
        System.out.println(b);
        int c = 10;
        int d = c++;
        System.out.println(c);
        System.out.println(d);//先把c的值赋给d并打印出来，c自己再进行自增并打印出来
        int e = 10;
        int f = --e;
        int g = f--;
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
    }
}
