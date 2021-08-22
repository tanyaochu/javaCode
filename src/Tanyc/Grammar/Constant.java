package Tanyc.Grammar;

public class Constant {
    public static void main(String[] args) {
        System.out.println("这是字符串常量");  //字符串常量
        System.out.println(10);             //整数常量
        System.out.println(11.9);           //小数常量
        System.out.println('a');
        System.out.println('艹');           /*字符常量 只能放一个字符
                                                */
        System.out.println(100<2000);
        System.out.println(1000<10);    //这是布尔常量
                                         //还有一个空常量：null 不能直接打印

        System.out.println("谭耀楚");
        System.out.println('男');
        System.out.println(173);
        System.out.println(63.5);
        System.out.println("19岁");
        System.out.println(19<0);//婚否


                                //定义常量
        final int NUM = 100;      //final+数据类型+大写常量名+赋值



    }
}
