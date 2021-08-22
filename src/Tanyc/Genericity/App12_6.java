package Tanyc.Genericity;
import java.util.*;
/*程序运行时，将在命令行方式下输入的每个字符串添加到哈希集合中，集合中已有的元素不能添加，并将重复的元素输出。
 最后再对集合进行遍历，输出所有元素*/
public class App12_6 {
    public static void main(String[] args) {//String[] args是main函数的形式参数,可以用来获取命令行用户输入进去的参数。
        HashSet<String> hs = new HashSet<>();
        for (String a:args)
            if(!hs.add(a))
                System.out.println("元素"+a+"重复");
        System.out.println("集合的容量为："+hs.size());
        System.out.println("各元素为：");
        Iterator iterator = hs.iterator();
        while (iterator.hasNext())
            System.out.print(iterator.next()+"  ");
    }
}
