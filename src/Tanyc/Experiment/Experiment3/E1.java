package Tanyc.Experiment.Experiment3;
import java.util.*;
public class E1 {
    public static void main(String[] args) {
        int j,k,e=0;
        Scanner abc = new Scanner(System.in);
        System.out.println("Please enter length:");
        k=abc.nextInt();
        int [] a=new int[k];
        System.out.println("Please enter " + k + " numbers: ");
        for(j=0;j<k;j++)
        {
            a[j]=abc.nextInt();
            e=a[j]+e;
        }
        e=e/k;
        for(j=0;j<k;j++) {
            if (a[j] > e)
                System.out.println(a[j]);
        }
    }
}
