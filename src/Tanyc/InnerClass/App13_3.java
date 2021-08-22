package Tanyc.InnerClass;
//利用接口创建匿名内部类对象并实现接口中抽象方法
interface IShape{
    void shape();
}
class myType{
    public void outShape(IShape s){
        s.shape();
    }
}
public class App13_3 {
    public static void main(String[] args) {
        myType a = new myType();
        a.outShape(new IShape() {
            @Override
            public void shape() {
                System.out.println("i am any shape");
            }
        });
    }
}
