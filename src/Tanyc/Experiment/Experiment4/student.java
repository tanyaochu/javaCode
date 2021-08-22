package Tanyc.Experiment.Experiment4;
import java.util.Scanner;
     /*4.2 定义一个人员学生类Student，包括成员变量：学号、姓名、性别、是否班干部、数学、语文、英语；
  成员方法有：输入个人信息的方法，显示个人信息的方法，计算成绩总分与平均分的方法。
  在主类里面建立Student类的对象，通过键盘输入信息，并输出信息。*/
class teststudent {
    int  number;
    String name,gender,classleader;

    double math,chinese,english;


    void input()
    {
        System.out.println("please input your student number,name,gender,class leader or not," +
                "math grade,chinese grade, english grade");
     Scanner xx = new Scanner(System.in);
     number=xx.nextInt();
     name=xx.next();
     gender=xx.next();
     classleader=xx.next();
     math=xx.nextDouble();
     chinese=xx.nextDouble();
     english=xx.nextDouble();
    }

    void show()
    {
        System.out.println("your class number is :"+number);
        System.out.println("your name is :"+name);
        System.out.println("your gender is :"+gender);
        System.out.println("if you are a class leader  :"+classleader);
        System.out.println("your math grade is :"+math);
        System.out.println("your chinese grade is :"+chinese);
        System.out.println("your english grade is :"+english);
    }

    void calculate()
    {
        System.out.println("your total grade is "+(math+chinese+english));
        System.out.println("your average grade is "+(math+chinese+english)/3);

    }
}

public class student{
    public static void main(String[] args)
    {
        teststudent a = new teststudent();
    a.input();
    a.show();
    a.calculate();


    }
}