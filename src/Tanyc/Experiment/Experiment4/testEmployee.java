package Tanyc.Experiment.Experiment4;
import java.util.*;
class Employee
{
    String name,gender;
    int workingyears;
    double basicwage,jobsubsidy,wagesbasedonbenefits,a;
    Scanner abc = new Scanner(System.in);
Double wagespayable()
{
    double basicwage,jobsubsidy,wagesbasedonbenefits;
    System.out.println("please input your basicwage,jobsubsidy,wagesbasedonbenefits");
    basicwage=abc.nextDouble();
    jobsubsidy=abc.nextDouble();
    wagesbasedonbenefits=abc.nextDouble();
    return a=basicwage+jobsubsidy+wagesbasedonbenefits;
}

Double  individualincometax()
{
    double individualincometax=0.0;
    if(a<3500.0)
        individualincometax=0.0;
    else if(a>3500.0)
        individualincometax=a*0.03;
    return individualincometax;

}

Double takehomepay()
{
    return a-individualincometax();
}

    void show()
    {
        System.out.println("please input your name,gender,workingyears");
        name = abc.next();
        gender=abc.next();
        workingyears=abc.nextInt();
        System.out.println("your name is :"+name);
        System.out.println("your gender is :"+gender);
        System.out.println("your workingyears is :"+workingyears+" years");
        System.out.println("your wagespayable is :"+a);
        System.out.println("your takehomepay is :"+takehomepay());

    }
}


public class testEmployee {
    public static void main(String[] args)
    {
         Employee employee =new Employee();
         employee.wagespayable();
         employee.show();
    }
}
