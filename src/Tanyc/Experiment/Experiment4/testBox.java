package Tanyc.Experiment.Experiment4;
import java.util.*;
class Box {
    double Long,Weight,Height,Area,Volume;
    void setLongWeightHeight()
    {
        System.out.println("please input Long,Weight,Height:");
        Scanner xx = new Scanner(System.in);
        Long=xx.nextDouble();
        Weight=xx.nextDouble();
        Height=xx.nextDouble();
    }

    double volume()
    {
        Volume=Long*Weight*Height;
        return Volume;
    }

    double area ()
    {
        Area=(Long*Weight*2)+(Height*Weight*2)+(Height*Long*2);
        return Area;
    }

    void show()
    {
        System.out.println("Long is :"+Long);
        System.out.println("Weight is :"+Weight);
        System.out.println("Height is :"+Height);
        System.out.println("area is :"+Area);
        System.out.println("volume is :"+Volume);
    }
}

public class testBox
{
    public static void main(String[] args)
    {
        Box a1=new Box();
        a1.setLongWeightHeight();
        a1.area();
        a1.volume();
        a1.show();


    }
}

