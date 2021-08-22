package Tanyc.IO;
import java.io.*;
public class app10_6 {
    public static void main(String[] args)throws IOException
    {
        FileWriter fw = new FileWriter("D:/study/code/IOTest/app10_6.txt");
        {
        char [] a = new char[1000];
        a[0] = '艹';a[1] = '了';
        char [] b ={'h','e','l','l','o','!','\r','\n'};
        String str = "i am good!\n";
            fw.write(b,0,5);
            fw.write(b[7]);
            fw.write("你好吗\n");
            fw.write(str);
            fw.write(a);
            fw.close();
        }
    }
}
