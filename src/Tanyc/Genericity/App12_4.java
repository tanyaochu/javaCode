package Tanyc.Genericity;
//利用LinkedList<E>类构造先进后出的堆栈
import java.util.*;
class StringStack{
LinkedList<String>  a = new LinkedList<>();
//入栈操作
    public void push(String name){
        a.addFirst(name);
    }
//出栈操作
    public String pop(){
        return a.removeFirst();
    }
//判断堆栈是否为空
    public boolean isEmpty(){
        return a.isEmpty();
    }
}

public class App12_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringStack stack = new StringStack();
        System.out.println("please input: (quit by 'quit')");
        //入栈
        while (true) {
            String input = sc.next();
            if(input.equals("quit"))
                break;
            stack.push(input);
        }
        //出栈
        System.out.println("按先进后出的顺序：");
        while (!stack.isEmpty())
            System.out.print(stack.pop()+" ");
    }
}
