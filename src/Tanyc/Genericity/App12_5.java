package Tanyc.Genericity;
//创建一个数组列表对象并向其添加元素，然后对列表的元素进行修改并遍历
import java.util.*;
public class App12_5 {
    public static void main(String[] args) {
    List<Integer> a =new ArrayList<>();
        for (int i = 1; i < 5; i++) {
            a.add(i);
        }
        System.out.println("原列表数据为："+a);
        ListIterator<Integer> listIterator = a.listIterator();
        listIterator.add(0);//此时listIterator在a[0]前   | 0 1 2 3 4
        System.out.println("添加数据后列表数据为："+a);
        if(listIterator.hasNext()){//此时listIterator在a[0]后a[1]前,准备处理a[1]    0 | 1 2 3 4
            int i = listIterator.nextIndex();//返回准备处理的序号   0 | 1 2 3 4
            listIterator.next();//此时listIterator在处理a[1]   0 1 | 2 3 4
            listIterator.set(8);//更改a[1]=8
            System.out.println("修改数据后列表的数据为："+a);
        }
        //反向遍历
        listIterator=a.listIterator(a.size());//将listIterator放到最后
        System.out.println("反向遍历列表的数据为：");
        while (listIterator.hasPrevious())
        {
            System.out.print(listIterator.previous()+" ");
        }
    }
}
