package Tanyc.Genericity;

import java.util.*;

//先创建一个哈希集合hs，并向其中添加元素，然后再用hs创建树集合对象ts，之后利用树集合的相应方法输出某些元素。
public class App12_7 {
    public static void main(String[] args) {
       Set<String> hs = new HashSet<>();
       hs.add("唐僧");
       hs.add("孙悟空");
       hs.add("猪八戒");
       hs.add("沙僧");
       hs.add("白龙马");
       System.out.println("hash集合："+hs);
       TreeSet<String> ts = new TreeSet<>(hs);
       System.out.println("tree集合："+ts);
       System.out.println("tree集合的第一个元素："+ts.first());
       System.out.println("tree集合的第后一个元素："+ts.last());
       System.out.println("headSet(孙悟空)的元素："+ts.headSet("孙悟空"));
       System.out.println("tailSet(孙悟空)的元素："+ts.tailSet("孙悟空"));
       System.out.println("ceiling(沙僧)的元素："+ts.ceiling("沙僧"));
       System.out.println("higher(沙僧)的元素："+ts.higher("沙僧"));
    }
}
