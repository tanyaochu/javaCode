package Tanyc.Reflect;

import java.lang.reflect.*;

class person{
    private String name;
    private int age;
    public person(String name,int age){
        this.age = age;
        this.name = name;
    }
    public void info(String prof , int score){
        System.out.println("专业："+prof+"分数："+score);
    }

    @Override
    public String toString() {
        return "姓名:"+this.name+"年龄："+this.age;
    }
}
public class App13_1 {
    public static void main(String[] args) {
        Class<person> pc = person.class;
        //返回参数类型为String和int的构造方法
        try {
            Constructor con = pc.getConstructor(String.class,int.class);
            System.out.print("构造方法名："+con.getName());
            Class[] pt = con.getParameterTypes();
            for (int i = 0; i < pt.length; i++) {
                System.out.print(",参数："+pt[i].getName());
            }
        }
        catch (NoSuchMethodException e){
            e.printStackTrace();
        }
        Field[] fields = pc.getDeclaredFields();//获取所有成员变量
        //获取修饰符
        for (Field f: fields) {
            int mod = f.getModifiers();
            System.out.println("\n成员变量修饰符："+ Modifier.toString(mod));//输出修饰符
            //获取成员变量类型
            Class type = f.getType();
            System.out.print(" 成员变量名称："+f.getName());
            System.out.print(" 成员变量类型："+type.getName());
        }
        System.out.println(" ");//获取所有成员方法
        Method[] mds = pc.getDeclaredMethods();
        for (Method m :mds) {
            System.out.println("方法名"+m.getName());//输出方法名
            System.out.println("参数个数："+m.getParameterCount());//输出参数个数
            Parameter[] par = m.getParameters();//获取方法的参数
            int index = 1;
            for (Parameter p : par) {
                System.out.println("---第"+index+"个参数的信息：");
                System.out.println("参数名："+p.getName());//输出方法参数的名称
                System.out.println("类型："+p.getType());//输出方法参数的类型
                System.out.println("泛型类型："+p.getParameterizedType());//输出泛型类型
                System.out.println("------------------");
            }
        }
    }
}
