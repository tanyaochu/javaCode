package Tanyc.Genericity;
//泛型类的限制
class GeneralType<T extends Number>{
    T obj;
    public GeneralType(T obj){
        this.obj=obj;
    }
    public T getObj(){
        return obj;
    }
}
public class App12_2 {
    public static void main(String[] args) {
        GeneralType<Integer> num = new GeneralType<>(5);
        System.out.println("给出的参数是："+num.getObj());
        /*      String不是Number类或其子类
        GeneralType<String> str = new GeneralType<>("helloWorld");
        System.out.println("给出的参数是："+str.getObj());
        */
    }
}
