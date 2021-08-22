package Tanyc.Grammar;

import java.util.Scanner;

public class hw46 {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        int a,bai,ge,shi;
        System.out.println("please input a number");
        a= ab.nextInt();
        if((a/100)<10 & (a/100)>0)
        {
           bai= (a/100);
           shi=(a/10)%10;
           ge=a-(bai*100+shi*10);
            if(bai*bai*bai+shi*shi*shi+ge*ge*ge==a)
                System.out.println(a+"是水仙花数");
            else
                System.out.println("该三位数不是水仙花数");

        }
        else
            System.out.println("输入的数据有误，请重新输入");

    }
}
