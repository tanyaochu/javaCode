package Tanyc.Experiment.Experiment3;
import java.util.Scanner;
public class E2 {
    public static void main(String[] args) {

            int num;
            Scanner reader = new Scanner(System.in);
            System.out.print("Please enter length: ");
            num = reader.nextInt();
            System.out.print("Please enter " + num + " numbers: ");
            int[] n = new int[num];
            int i, min, max;
            for (i = 0; i < num; i++)
                n[i] = reader.nextInt();
            for (i = 0, min = n[0], max = n[num - 1]; i < num; i++) {
                if (n[i] < min)
                    min = n[i];
                if (n[i] > max)
                    max = n[i];
            }
            System.out.println("Min=" + min + "  Max=" + max);
        }}


