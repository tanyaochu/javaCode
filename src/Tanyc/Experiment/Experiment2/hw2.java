package Tanyc.Experiment.Experiment2;
import java.util.*;
public class hw2 {
    public static void main(String[] args) {
        int x,y;
        System.out.println("please input a number");
        Scanner abc = new Scanner(System.in);
        x = abc.nextInt();
        if(x<1)
            System.out.println("y="+x);
        else if (x>=1 & x<10)
            System.out.println("y="+(x*2-1));
        else if(x>=10)
            System.out.println("y="+(x*3-11));
    }
}
