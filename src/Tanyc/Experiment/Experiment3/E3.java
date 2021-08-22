package Tanyc.Experiment.Experiment3;
import java.util.Random;
public class E3 {
    public static void main(String[] args) {
        Random xx = new Random();
        int [] a = new int[10];
        int i,sum=0,average,min,max;
        for( i=0 ; i<10 ; i++)
        {
            a[i]=xx.nextInt(100);
            sum+=a[i];
            System.out.println(a[i]);
        }
        average=sum/10;
        for(i=0,min=a[0],max=a[9] ; i<10 ; i++) {
            if (a[i]<a[0])
                min = a[i];
            if (a[i] > max)
                max = a[i];
        }


        System.out.println("max is "+max);
        System.out.println("min is "+min);
        System.out.println("sum is "+sum);
        System.out.println("average is "+average);

    }
}
