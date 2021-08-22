package Tanyc.Experiment.Experiment2;
import java.util.*;
public class hw5 {
    public static void main(String[] args) {
        double i=1,n,s=1,y=0;
        Scanner xx = new Scanner(System.in);
        System.out.println("please input a number");
        n=xx.nextDouble();
        while (i<n)
        {
            s*=i;
            {if(i%2==0)
            {
                s=-s;
            }
            y=y+1/s;
            i++;}
            if(i==n)
            {
                s=-(s*n);
                s=1/s;
                y=y+s;
            }
        }
        System.out.println(y);
    }
}


