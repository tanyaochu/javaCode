package Tanyc.Experiment.Experiment3;
import java.util.Random;
public class E5 {
    public static void main(String[] args) {
        int[][] a= new int[10][10];
        int i,j,sum=0,min,max;
        Random xx = new Random();
        for(i=0; i<a.length ;i++){
            for(j=0; j<a.length ;j++)
            {
                a[i][j]=xx.nextInt(100);
                System.out.print(a[i][j]+" ");
                if(i==j)
                {
                    sum+=a[i][j];
                }
            }
            System.out.println();
        }
        for(i=0,min=a[0][0],max=a[a.length-1][a.length-1] ; i<a.length ; i++)
        {
            for(j=0;j<a.length;j++)
            {
            if (a[i][j]<a[0][0])
                min = a[i][j];
            if (a[i][j] > max)
                max = a[i][j];
            }
        }
        System.out.println("max is "+max);
        System.out.println("min is "+min);
        System.out.println("sum is "+sum);
    }
}
