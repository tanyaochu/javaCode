package Tanyc.OOP;

public class Student {
//创建了一个类，这个类表示学生这一群体，这个类包括属性与行为，分别称成员变量和成员方法

    //先写成员变量
    int age ;
    String name ;//不赋值用的是默认初始化值，不同类型变量的默认初始化值不相同


    //再写成员方法
    public void study(){
        //方法体
        System.out.println("先学JavaSE");
        System.out.println("再学JavaWeb");
        System.out.println("最后学JavaEE");
    }
    public void eat(){
        System.out.println("吃饭");
    }
    public void sleep(){
        System.out.println("睡觉");//方法之间是平级的，不允许嵌套
    }

}
