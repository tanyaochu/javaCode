package Tanyc.Experiment.Experiment5;
/*3、定义一个接口（ShapeArea），其中包含计算周长、面积的两个方法方法（getLength(),getArea()）。
上题的三个类都要求实现接口ShapeArea，自行扩充成员变量和方法。在主方法中建一数组，数组中放入一些上述类型的对象，并计算它们的面积之和。
 */
interface ShapeArea{
    public abstract double getLength();
    public abstract double getArea();
}
class  R implements ShapeArea {
    double length,width,circumference,area;

    R(){}
    R(double length,double width){
        this.length=length;
        this.width=width;
    }

    public double getLength() {
        circumference=(length+width)*2;
        return circumference;
    }

    public double getArea(){
        area=length*width;
        return area;
    }
}


class S extends R{
    S(){}
    S(double length){
        super.length=length;
        super.width=length;
    }
}


class C implements ShapeArea{
    double pi=3.14, radius,circumference,area;

    C(){}
    C(double radius){
        this.radius=radius;
    }
    public double getLength() {
        circumference=2*pi*radius;
        return circumference;
    }
    public double getArea(){
        area=pi*radius*radius;
        return area;
    }
}

public class e3 {
    public static void main(String[] args){
        ShapeArea [] str = new ShapeArea[3];
        ShapeArea rectangle = new R(3,4);
        ShapeArea square = new S(3);
        ShapeArea circle= new C(3);
        str[0]=rectangle;
        str[1]=square;
        str[2]=circle;
        System.out.println("他们面积之和是："+(str[0].getArea()+str[1].getArea()+str[2].getArea()));


    }
}