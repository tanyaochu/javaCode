package Tanyc.Lambda;
//将Lambda表达式作为参数传递给方法，完成将字符串中的字符转换成大写字符、去掉中间空格。反序等功能
@FunctionalInterface//定义函数式接口
interface StringFunc{
     String func (String s);
}
public class App13_9 {
    static String sop(StringFunc sf,String s){
        return sf.func(s);
    }
    public static void main(String[] args) {
        String outStr ,inStr="Lambda 表达式 good";
        System.out.println("原字符串"+inStr);
        //转换为大写
        outStr=sop(String::toUpperCase ,inStr );//引用方法
        // outStr=sop((str)->str.toUpperCase(),inStr);
        System.out.println("转换大写后字符串："+outStr);
        //去掉空格
        outStr=sop((str)->{
            String result="";
            for(int i=0;i<str.length();i++)
                if(str.charAt(i)!=' ')
                    result+=str.charAt(i);
                return result;
                },inStr);
        System.out.println("去掉空格后字符串："+outStr);
        //反序输出
        StringFunc reverse=(str)->{
            String result="";
            for(int i=str.length()-1;i>=0;i--)
                    result+=str.charAt(i);
            return result;
        };
        System.out.println("反序输出字符串："+sop(reverse,inStr));
    }
}
