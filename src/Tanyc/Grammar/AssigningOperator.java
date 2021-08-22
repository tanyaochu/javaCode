package Tanyc.Grammar;

import java.util.Scanner;

public class AssigningOperator {
    public static void main(String[] args) {
                                        //扩展赋值运算符(+= -= *= /= %=)
    int a = 10;
    a -=20;
    double b = 5;
    b /=2;
    double num = 5;
    num %=2;
    System.out.println(a);
    System.out.println(b);
    System.out.println(num);
    System.out.println("---------------------------");
                                    //扩展赋值运算符(+= -= *= /= %=)，自带强转效果
    int c = 10;
    byte d = 20;
    d = (byte)(c + d);
    System.out.println(d);
    int e =  10;
    byte f = 20;
    f +=e;
    System.out.println(f);
    System.out.println("---------------------------");

                                    //关系运算符，比较运算符(结果都是boolean类型)
    System.out.println(10>20);
    System.out.println(10>=20);
    System.out.println(10<20);
    System.out.println(10<=20);
    System.out.println(10!=20);
    System.out.println(10==20);
        System.out.println("---------------------------");
                                     //LogicalOperator逻辑运算符
        int g = 10;
        System.out.println(g>5);
        System.out.println(g<15);
        System.out.println(g>5 & g<15);
        System.out.println("---------------------------");

        //并且（遇假则假）
        System.out.println(true&true);
        System.out.println(false&false);
        System.out.println(true&false);
        System.out.println(false&true);
        System.out.println("---------------------------");

        //或者（遇真则真）
        System.out.println(true|true);
        System.out.println(false|false);
        System.out.println(true|false);
        System.out.println(false|true);
        System.out.println("---------------------------");

        //异或（相同的为false，不同的为true）
        System.out.println(true^true);
        System.out.println(false^false);
        System.out.println(true ^false);
        System.out.println(false ^true);
        System.out.println("---------------------------");

        //取反
        System.out.println(!true);
        System.out.println(!!true);
                                                //案例
        //输入成绩，如果在90~100区间，输出优秀
        //输入工号，如果工号为3，5，7，输出正确
        Scanner X =new Scanner(System.in);
        System.out.println("请输入你的学号");
        int id = X.nextInt();
        if ( id==201612238 | id==201612239 | id==201612240 | id==201612241 | id==201612242){
        System.out.println("你的学号为"+id+";"+"学号正确");
        System.out.println("---------------------------");
        System.out.println("请输入你的期末数分成绩");
        double score = X.nextDouble();
        if (score>=90 & score<=100 )
        System.out.println("你的成绩是"+score+";"+"等级为A");
        else System.out.println("垃圾，才"+score+"分，"+"连90分都没有，菜！");}
        else System.out.println("学号错误");
        System.out.println("---------------------------");
                                //Short-Circuit Logical Operators(&& and ||)短路逻辑运算符
        int q = 4;
        int v = 5;
        System.out.println(++q > 4 & v-- <5);//true & false
        System.out.println("q="+q);
        System.out.println("v="+v);
        System.out.println("---------------------------");
        int r = 4;
        int t = 5;
        System.out.println(++r > 4 && t-- <5);
        System.out.println("r="+r);
        System.out.println("t="+t);
        System.out.println("---------------------------");

                                //ternary operator三元运算符
        int one = 1;
        int two = 2;
        int max =one > two ? one : two;
        System.out.println(max);
        System.out.println("---------------------------");
                                                    //案例：选出三个数中最大的值
        Scanner MMM =new Scanner(System.in);
        System.out.println("请输入三个整数");
        int num1 = MMM.nextInt();
        int num2 = MMM.nextInt();
        int num3 = MMM.nextInt();
       int temp= num1 > num2 ? num1:num2;
       int MAX = temp>num3?temp:num3;
        System.out.println(MAX);
    }
}
