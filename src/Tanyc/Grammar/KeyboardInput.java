package Tanyc.Grammar;

import java.util.Scanner;

public class KeyboardInput {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        System.out.println("请输入你的年龄");
        int age = abc.nextInt();
        System.out.println("你现在"+age+"岁啊");
        if (age<=27)
            System.out.println("你还年轻");
        else System.out.println("你老了");


        System.out.println("请输入你的名字");
        String name = abc.next();
        System.out.println(name+"啊");
        System.out.println("是个好名字");





    }
}
