package Tanyc.OOP;

public class TestStudent {
    public static void main(String[] args) {

        //创建对象
        Student stu= new Student();
        System.out.println("----------------------------");

        //引用成员变量
       stu.age=19;
       stu.name="谭耀楚";
        System.out.println(stu.age);
        System.out.println(stu.name);
        System.out.println("----------------------------");

        //引用成员方法(可调用多次)
        stu.study();
        stu.eat();
        stu.sleep();

    }
}
