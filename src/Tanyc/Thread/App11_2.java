package Tanyc.Thread;
//实现Runnable接口
public class App11_2 implements Runnable{
    public void run() {
        for (int i = 0;i<200;i++) {
            System.out.println("线程1正在运行");
        }
    }


    public static void main(String[] args) {
        App11_2 app11_2 = new App11_2();
        /*将实现接口的类作为参数创建Thread类的对象，以该对象调用start(),代理
        Thread thread = new Thread(app10_12);
        thread.start();*/
        new Thread(app11_2).start();

        for (int i = 0;i<1000;i++) {
            System.out.println("线程2正在运行");
        }

    }
}
