package Tanyc.Experiment.Experiment2;
import java.util.*;
public class hw3 {
    public static void main(String[] args){
        double i,reward;
        Scanner xxx=new Scanner(System.in);
        System.out.println("请输入利润i");
        i=xxx.nextDouble();
        if(i<100000)
        {
            reward=(0.1)*100000;
            System.out.println(reward);
        }
        else if(i>100000 & i<=200000)
        {
            reward=(0.1)*100000+(i-100000)*(0.075);
            System.out.println(reward);
        }
        else if(i>200000 & i<=400000)
        {
            reward=(0.1)*100000+(i-100000)*(0.075)+(i-200000)*(0.05);
            System.out.println(reward);
        }
        else if(i>400000 & i<=600000)
        {
            reward=(0.1)*100000+(i-100000)*(0.075)+(i-200000)*(0.05)+(i-400000)*(0.03);
            System.out.println(reward);

        }
        else if(i>600000 & i<=1000000)
        {
            reward=(0.1)*100000+(i-100000)*(0.075)+(i-200000)*(0.05)+(i-400000)*(0.03)+(i-600000)*(0.01);
            System.out.println(reward);

        }
    }
}


