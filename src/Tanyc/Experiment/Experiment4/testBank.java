package Tanyc.Experiment.Experiment4;
import java.util.*;
/*(选做)4.6：编写储蓄账户类及测试类，模拟存款，参考以下运行方式：
（1）新开5个储蓄账户，各储蓄账户的编号、户名在新开储蓄账户时初始化，假设每位用户新开储蓄账户时都存入了一笔钱。
（2）提示用户从键盘输入储蓄账户编号。
（3）若输入的储蓄账户编号与新开的5个储蓄账户编号之一匹配，则提示用户从键盘输入存款金额，存款金额必须大于0，否则显示错误提示，直到用户输入的存款金额大于0为止。
（4）相应储蓄账户的余额被更新。
（5）存款完成后，提示存款成功，显示该储蓄账户的编号、户名、余额。
（6）若输入的储蓄账户编号与新开的5个储蓄账户编号均无法匹配，显示错误提示，并询问是否还要继续存款。
（7）用户输入yes，继续执行步骤（2），否则显示退出信息。
最基本要求：绘制UML类图；储蓄账户的余额必须确保大于等于0。*/
 class Bank {
    public int ID;

    public String name;

    public double money=10000;

    public int yourAccount;

    Scanner read=new Scanner(System.in);

    public Bank(int ID,String name,double money) {
        this.ID=ID;

        this.name=name;

        this.money=money;

    }

//存钱

    public void saveMoney(double m) {
        if(money<=0)System.out.println("存款金额必须大于0"+"\n");

        else {
            this.money+=m;

            System.out.println("存款成功"+"\n");

            System.out.println("账号:"+this.ID+"\n"+"姓名:"+this.name+"\n"+"余额："+this.money+"\n");

        }

    }

//取钱

    public void getMoney(double m) {
        if(m>this.money) System.out.println("您的账号余额已不足"+"\n");

        else{
            System.out.println("您已经成功取出"+m+"\n");

            this.money-=m;

            System.out.println("账号:"+this.ID+"\n"+"姓名:"+this.name+"\n"+"余额："+this.money+"\n");

        }

    }

//判断两个账号是否一致

    public void display(int yourAccount,int ID) {
        if(yourAccount==ID) {
            double m;

            System.out.println("请输入您的存款"+"\n");

            m=read.nextDouble();

            this.saveMoney(m);

            System.out.println("请输入您要取出的金额"+"\n");

            m=read.nextDouble();

            this.getMoney(m);

        }

    }

}

public class testBank {
    public static void main(String []args) {
        int yourAccount;

        double money;

        int text;

        Bank A1=new Bank(1001,"陈某某",10000); //初始化五个账号类型

        Bank A2=new Bank(1002,"李某某",10000);

        Bank A3=new Bank(1003,"张某某",10000);

        Bank A4=new Bank(1004,"魏某某",10000);

        Bank A5=new Bank(1005,"吴某某",10000);

        System.out.println("请输入您的账号:"+"\n");

        Scanner read=new Scanner(System.in);

        yourAccount=read.nextInt();

        A1.display(yourAccount, 1001);

        A2.display(yourAccount, 1002);

        A3.display(yourAccount, 1003);

        A4.display(yourAccount, 1004);

        A5.display(yourAccount, 1005);

        if(yourAccount!=1001&&yourAccount!=1002&&yourAccount!=1003&&yourAccount!=1004&&yourAccount!=1005) {
            System.out.println("本银行不存在该账户。如果您想继续存款请输入1，退出请输入2！");

            text=read.nextInt();

            if(text==1){
                System.out.println("请输入您的账号:");

                yourAccount=read.nextInt();

                A1.display(yourAccount, 1001);

                A2.display(yourAccount, 1002);

                A3.display(yourAccount, 1003);

                A4.display(yourAccount, 1004);

                A5.display(yourAccount, 1005);

                System.out.println("您已经退出本系统，欢迎您下次使用！");

            }

            if(text==2) System.out.println("您已经退出本系统，欢迎您下次使用！");

        }

    }

}
