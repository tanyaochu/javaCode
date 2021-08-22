package Tanyc.Experiment.Experiment5;
import java.util.Scanner;
public class e4 {
public static void main(String[] args){

        double password;
        System.out.println("if you want to change your password please input yes,else input no");
        Scanner reader = new Scanner(System.in);
        String abc = reader.next();
        if(abc=="yes")
        {
             password = reader.nextInt();
        }
    }
}
