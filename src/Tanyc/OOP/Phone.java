package Tanyc.OOP;

public class Phone {
    String brand;
    int price;

    public void call(String name){
        System.out.println("可以给"+name+"打电话");
    }

    public void SendMessage(String name){
        System.out.println("可以给"+name+"发信息");

    }
    public int add(int a,int b){
        int c = a + b;
        return c;
    }

                             //成员变量与局部变量重名的情况
    String name ;
    public void jj(String name ){
        System.out.println("局部变量："+name);
        System.out.println("成员变量："+this.name);

    }

                            //this关键字，指当前类的对象的引用（地址）












}
