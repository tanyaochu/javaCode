package Tanyc.Genericity;
class Gen<T>{
    private T t;
    public void setObj(T t){
        this.t=t;
    }
    public <E> void display(E e){
        System.out.println("泛型类的类型参数T："+t.getClass().getName());
        System.out.println("泛型类的类型参数E："+e.getClass().getName());
    }
}
public class App12_1 {
    public static void main(String[] args) {
        Gen <Integer> gen = new Gen<>();//设置Gen泛型类的类型,5为整型int，T为Integer
        gen.setObj(5);
        System.out.println("首次输出：");
        gen.display("文本类型");//e为String类型
        System.out.println("第二次输出：");
        gen.display(8.0);//e为Double类型
    }
}
