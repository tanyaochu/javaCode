package Tanyc.Grammar;

public class OneDimArray52 {
    public static void main(String[] args) {
        int max, sec,i;
        int[] a={8,50,20,7,81,55,76,93};
        if(a[0]>a[1])
        {
            max=a[0];
            sec=a[1];
        }
        else
        {
            max=a[1];
            sec=a[0];
        }
        System.out.print("该数组里的元素有："+a[0]+"  "+a[1]);
        for(i=2;i<a.length;i++)
        {
            System.out.print("  "+a[i]);
            if(a[i]>max) {
                sec = max;
                max=a[i];
            }
            else if(a[i]>sec)
                sec=a[i];
        }
        System.out.println("其中最大值为"+max);
        System.out.println("其中次最大值为"+sec);
    }
}
