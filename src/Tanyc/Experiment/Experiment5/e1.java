package Tanyc.Experiment.Experiment5;
/*1、定义一个矩形类（Rectangle），派生出一个正方形类（Square）;再定义一个圆类（Circle），
根据需要定义成员变量，都定义构造方法、计算周长的方法getLength()、计算面积的方法getArea()、显示的方法show()；
在主方法中，分别用前述三个类创建一个对象，并分别计算它们的周长、面积。*/
class  Rectangle {
    double length,width,circumference,area;

        Rectangle(){}
        Rectangle(double length,double width){
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

    public void show(){
        System.out.println("the length of the Rectangle is:"+this.length);
        System.out.println("the width of the Rectangle is:"+this.width);
        System.out.println("the circumference of the Rectangle is:"+getLength());
        System.out.println("the area of the Rectangle is:"+getArea());
    }
}


class Square extends Rectangle{
    Square(){}
    Square(double length){
        super.length=length;
        super.width=length;
    }
    public void show(){
        System.out.println("the length and width of the Square is:"+super.length);
        System.out.println("the circumference of the Rectangle is:"+super.getLength());
        System.out.println("the area of the Rectangle is:"+super.getArea());
    }
}


class Circle {
    double pi=3.14, radius,circumference,area;

    Circle(){}
    Circle(double radius){
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
    public void show(){
        System.out.println("the radius of the Circle is:"+this.radius);
        System.out.println("the circumference of the Circle is:"+getLength());
        System.out.println("the area of the Circle is:"+getArea());
    }
}

public class e1 {
    public static void main(String[] args){
        Rectangle rectangle = new Rectangle(3,4);
        rectangle.getLength();
        rectangle.getArea();
        rectangle.show();
        Square square = new Square(3);
        square.getLength();
        square.getArea();
        square.show();
        Circle circle = new Circle(3);
        circle.getLength();
        circle.getArea();
        circle.show();
    }
}

