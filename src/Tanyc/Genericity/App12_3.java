package Tanyc.Genericity;
class Gen2 <T> {
    T obj;
    public void setObj(T obj){
        this.obj = obj;
    }
    public T getObj(){
        return obj;
    }
    public static void show(Gen2<? extends String> a){
        System.out.println("名字："+a.getObj());
    }
}
public class App12_3 {
    public static void main(String[] args) {
        Gen2<String> b = new Gen2<>();
        b.setObj("谭先生");
        Gen2.show(b);//限制泛型类型范围

        Gen2<Integer> c = new Gen2<>();
        c.setObj(20);
        System.out.println("年龄："+c.getObj());
        // Gen2.show(c);不能调用show()
    }
}
