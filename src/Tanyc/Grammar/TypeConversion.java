package Tanyc.Grammar;

public class TypeConversion {
    public static void main(String[] args) {
                                                        //隐形转换
        int a = 10;
        double b = a;
        System.out.println(b);
            //字节小的可赋值给数值大的，byte>short=char>int>long>float>double
        System.out.println("--------------------------");


        int c = 10;
        double d = 10.1;
        double e = c+d;
        System.out.println(e);
            //隐形运算，int c 转换成double c 后再与double d 进行运算
        System.out.println("--------------------------");


        byte f = 10;
        byte g = 10;
        int h = f + g ;
        int i = 3;
        char j = 'a';
        int k =i + j;
        System.out.println(h);
        System.out.println(k);
            //byte、short、char三种类型先要变成int类型再进行运算
        System.out.println("--------------------------");



                                                       //案例
        double L = 10+49.3;
        byte num1 = 10;
        short num2 = 20;
        int num3 = num1 + num2;
        double m = 10+'a'+12.3;
        System.out.println(L);
        System.out.println(num3);
        System.out.println(m);
        System.out.println("--------------------------");

                                                            //强制转换
        double n = 10.6;
        int o = (int)n;
        long p = 290L;
        int q = (int)p;
        System.out.println(o);
        System.out.println(q);
            //强制转换有可能造成精度的损失
        System.out.println("--------------------------");
        int r = 130;
        byte s = (byte) r;
        System.out.println(s);
            //计算机进行运算时是以补码进行的，130原码是10000010，它的反码是01111101，它的补码是01111110，01111110的十进制是-126
        System.out.println("--------------------------");


                                  //字符串型数据与整形数据的互相转换
        String myNum = "1234567";
       long myLong= Long.parseLong(myNum);
        System.out.println(myLong);
        System.out.println("--------------------------");


        int myInt = 1000;
        String myString = myInt +  "是一千";
        System.out.println(myString);

    }
}
