package Tanyc.InnerClass;//内部类与匿名内部类
import java.util.*;
public class App13_2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("input your name:");
        (
                new Inner() {
                    void setName(String n) {
                        name = n;
                        System.out.println("your name is :" + name);
                    }
                }
        ).setName(reader.next());
    }
        static class Inner{
            String name;
        }

}
