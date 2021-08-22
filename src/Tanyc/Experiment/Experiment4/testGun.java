package Tanyc.Experiment.Experiment4;
/*4.5在CS枪战游戏中，有Ak47和USP两种枪，每种枪弹夹的子弹数和发射子弹数都不一样。
设计一个枪战游戏程序，定义一个Gun类，该类具有枪名称的属性name，子弹数量的名称num，枪手的编号id和记录当前枪手数量的属性count(静态)，
具有num和name属性的getter和setter方法和发射的方法fire();一个构造方法为属性赋初始值，Gun.count++;// 计数器累加this.id = Gun.count；
name = "Gun";num = 12;
设计一个Ak47类，由Gun类继承而来，每发射一次消耗3发子弹，每装一个弹夹，上30发子弹；设计一个USP类，由Gun类继承而来，每发射一次消耗１发子弹，
每装一个弹夹，上12发子弹；设计一个主类，分别创建不同的Ak47和USP对象，对象调用类里面的方法，装子弹，连续发射10次，显示枪里面还有多少子弹？*/
class Gun
{
    String name;
    int num,id;
    public static int count=1;

    Gun(){}
   public Gun(String name,int num)
    {
        this.name=name;
        this.num=num;
        this.id=Gun.count++;
    }
    public void setter ()
    {
        System.out.println("枪名:"+this.name+" 子弹数:"+this.num+" 枪手ID:"+this.id);
    }
    public String getter_1()
    {
        return name;
    }
    public int getter_2()
    {
        return num;
    }
}

class AK47 extends Gun
{
    AK47(String name,int num)
    {
        super(name,num);
    }
    public void fire(int y){
    for(int x=1;x<=y;x++)
    {
        num-=3;
    }
        System.out.println("Ak47此时还剩子弹："+num);
}
}


class usp extends Gun
{
    usp(String name,int num)
    {
        super(name,num);
    }
    public void fire(int y){
        for(int x=1;x<=y;x++)
        {
            num-=1;
        }
        System.out.println("usp此时还剩子弹："+num);
    }
}

public class testGun
{
    public static void main(String [] args)
    {
        AK47 ak47=new AK47("AK47",30);
        ak47.setter();
        ak47.fire(10);
        usp usp=new usp("usp",12);
        usp.setter();
        usp.fire(10);
    }
}

