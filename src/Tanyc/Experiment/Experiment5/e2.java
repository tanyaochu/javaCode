package Tanyc.Experiment.Experiment5;
/*2、假定要为某个公司编写雇员工资支付程序。这个公司有各种类型的雇员（Employee）抽象类，抽象方法：不同类型的雇员按不同的方式支付工资：
经理（Manager）：每月获得一份固定的工资；
销售人员（Salesman）：在基本工资的基础上每月还有销售提成；
一般工人（Worker）：则按他每月工作的天数计算工资。
 试用类的继承及相关机制描述这些功能需求，并编写一个Java Application程序，演示这些类的用法。
*/
abstract class Employee{
    public double money;
    abstract public double pay();
}
class Manager extends Employee{
    public double pay(){
        return super.money=7000;
    }
}

class Salesman extends Employee{
    public int a;
    public Salesman(int a){
        this.a=a*500;
    }
    public double pay() {
        return super.money=3000+this.a;
    }
}

class Worker extends Employee{
    public int b;
    public Worker(int b){
        this.b=b*300;
    }
    public double pay() {
        return super.money=this.b;
    }
}
public class e2 {
    public static void main(String[] args){
        Employee x = new Manager();
        System.out.println("manager's salary is :"+x.pay());
        Employee y = new Salesman(3);
        System.out.println("salesman's salary is :"+y.pay());
        Employee z = new Worker(30);
        System.out.println("worker's salary is :"+z.pay());
    }
}
