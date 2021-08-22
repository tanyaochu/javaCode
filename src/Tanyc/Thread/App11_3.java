package Tanyc.Thread;
//多个线程同时操作一个对象
//买火车票的例子
public class App11_3 implements Runnable {
    /*
    private int ticketNums=10;//一共10张票
    public void run() {
        while (true)//死循环，一定能抢到
        {
            if(ticketNums<0){
                break;
            }
            //模拟延时
            try{
                Thread.sleep(200);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"抢到了第"+ticketNums--+"张票");
        }
    }

    public static void main(String[] args) {
        App11_3 ticket = new App11_3();
        new Thread(ticket,"学生").start();
        new Thread(ticket,"老师").start();
        new Thread(ticket,"黄牛党").start();
    }
    发现问题，线程不安全，数据紊乱，接下来更改代码，利用互斥锁*/
    private static int ticketNums=10;//一共10张票
    public synchronized static void temp(){

        System.out.println(Thread.currentThread().getName()+"抢到了第"+ticketNums--+"张票");}

    public  void run() {
        while (true)//死循环，一定能抢到
        {           //模拟延时
            try{
                Thread.sleep(20);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
            if(ticketNums<1){
                break;
            }
            temp();

        }
    }

    public static void main(String[] args) {
        App11_3 ticket = new App11_3();
        new Thread(ticket,"学生").start();
        new Thread(ticket,"老师").start();
        new Thread(ticket,"黄牛党").start();
    }

}

