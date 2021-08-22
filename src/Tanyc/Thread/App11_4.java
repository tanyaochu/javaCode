package Tanyc.Thread;
//模拟龟兔赛跑
public class App11_4 implements Runnable{
    //胜利者只有一个
    private static String winner;

    @Override//赛跑过程
    public void run() {
        //模拟兔子休息
        if(Thread.currentThread().getName().equals("兔子")){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for (int i = 0; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName()+"跑了"+i+"米");
            boolean flag = gameOver(i);//判断比赛是否结束
            if(flag){break;}//如果比赛结束则退出循环
        }
    }
    //判断是否完成比赛,并决定胜利者
    private boolean gameOver(int step){
        if(winner!=null){
            return true;
        }
        if(step>=100){
            winner = Thread.currentThread().getName();
            System.out.println("winner is :"+winner);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        App11_4 Race = new App11_4();//一条百米赛道龟兔一起跑，跑一步算一米
        new Thread(Race,"兔子").start();
        new Thread(Race,"乌龟").start();
    }
}
