package Tanyc.Experiment.Experiment2;
import java.util.*;
public class hw4 {
    public static void main(String[] args) {
//4.4
        int i=1,n,s=1,y=0;
        Scanner xxx = new Scanner(System.in);
        System.out.println("please input a number");
        n=xxx.nextInt();
        while (i<n)
        {
            s*=i;
            i++;
            y=y+s;
            if(i==n)
            {
                s=s*n;
                y=y+s;
            }
        }
        System.out.println("1!+2!+...+n!="+y);
    }
}


