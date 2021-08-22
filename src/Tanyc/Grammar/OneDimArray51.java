package Tanyc.Grammar;
public class OneDimArray51 {
    public static void main(String[] args) {
                   //声明一个一维数组，长度为5，利用循环对数组元素进行赋值，用另一个循环逆序输出其中的值
        int i;
        int[]a=new int[5];
        for(i=0;i<5;i++)
            a[i]=i;
        for(i=a.length-1;i>=0;i--)
            System.out.print("a["+i+"]="+a[i]+"  ");
            System.out.println("\n该数组的长度为："+a.length);



    }
}
