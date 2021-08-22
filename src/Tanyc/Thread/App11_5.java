package Tanyc.Thread;
//用两个线程模拟存票、售票过程，但要求每存入一张票就售出一张票，售出后，再存入，直至售完为止
public class App11_5 {
    public static void main(String[] args) {
     Tickets T = new Tickets(10);
     new producer(T).start();
     new consumer(T).start();
    }
}
class Tickets{
    protected int max;//设置最大票数
    int number=0;//第几张票
    boolean available = false;//是否有票
    public Tickets(int max){
    this.max= max;
    }
    //存票方法
    public synchronized void put(){
        if(available)//如果存票线程中有票，则存票线程等待，如果没有存票则存入一张票
            try {wait();}
        catch (Exception e){e.printStackTrace();}
        System.out.println("存入第"+(++number)+"张票");
        available = true;
        notify();//存完后把存票线程交给售票线程
    }
    //售票方法
    public synchronized void sell(){
        if(!available)//如果没有票可以售出，则售票线程等待
            try {wait();}
        catch (Exception e) {e.printStackTrace();}
        System.out.println("售出第"+number+"张票");
        available=false;
        notify();
        if(number==max)number=max+1;//结束标志
    }
}
class producer extends Thread{
    Tickets t;
    public  producer(Tickets t){//将t作为共享变量,两线程类共享
        this.t=t;
    }
    @Override
    public void run() {
        while (t.number<t.max)
            t.put();
    }
}
class consumer extends Thread{
    Tickets t ;
    public consumer(Tickets t){//将t作为共享变量，两线程类共享
        this.t=t;
    }
    @Override
    public void run() {
        while (t.number<=t.max)
            t.sell();
    }
}