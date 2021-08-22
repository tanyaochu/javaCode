package Tanyc.Experiment.Experiment3;
import java.util.Random;
public class E4 {
    public static void main(String[] args) {
        int[] a = new int[5];
        int i,j,k,max;
        Random xx = new Random();
        for(j=0;j<50;j++)
        {
            k=xx.nextInt(5);
            for (i=0;i<5;i++)
            {
                if(k==i)
                    a[i]++;
            }
        }
        for(max=0 ,i=0 ;i<5;i++)
        {
            if (a[i]>max)
                max=a[i];
        }

        System.out.println("刘亦菲"+a[0]+"票");
        System.out.println("佐藤爱"+a[1]+"票");
        System.out.println("范冰冰"+a[2]+"票");
        System.out.println("巩俐"+a[3]+"票");
        System.out.println("宋祖英"+a[4]+"票");



}}
