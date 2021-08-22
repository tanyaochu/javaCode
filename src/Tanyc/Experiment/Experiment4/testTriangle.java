package Tanyc.Experiment.Experiment4;
import java.util.Scanner;
import java.lang.Math;
class Triangle {
   double a,b, c;
   boolean x;

   void input ()
{
   Scanner abc = new Scanner(System.in);
    a=abc.nextDouble();
    b=abc.nextDouble();
    c=abc.nextDouble();
    if(a+b>c & a+c>b & c+b>a )
    {
        System.out.println("input correct");
        x=true;
        if(a==b&b==c)
            System.out.println("this is a equilateral triangle");
        else if((a==b&a!=c)|(a==c&a!=b)|(b==c&b!=a))
            System.out.println("this is a isosceles triangle");
        else
        System.out.println("this is a arbitrarily triangle");
    }
    else
        {

            x=false;
        System.out.println("input error");
}
}

Double area()
{
    double s;
    s=(a+b+c)/2;
   return Math.sqrt(s*(s-a)*(s-b)*(s-c));
   }

   Double perimeter()
   {
       return a+b+c;
   }
}


public class testTriangle
{
    public static void main(String[] args)
    {
        System.out.println("please input 3 number as the three sides of the triangle:");
        Triangle tt = new Triangle();
        tt.input();
        if(tt.x==true){
        System.out.println("the area of triangle is:"+tt.area());
        System.out.println("the perimeter of triangle is:"+tt.perimeter());
    }

    }
}