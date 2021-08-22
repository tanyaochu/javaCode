package Tanyc.Grammar;
import java.util.*;
public class hw43 {
    public static void main(String[] args) {
    Scanner abc = new Scanner(System.in);
        System.out.println("please input a number  between 1 to 100");
        int a;
        a = abc.nextInt();
        if(a>=0 & a<=100) {
            if (a % 3 == 0 & a % 7 == 0) {
                System.out.println(a + "可以被3和7同时整除");
            } else
                System.out.println(a + "不可以被3和7同时整除");
        }
        else
            System.out.println("输入数据有误");
    }
}
