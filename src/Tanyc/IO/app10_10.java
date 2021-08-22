package Tanyc.IO;
import java.io.*;
public class app10_10 {
    public static void main(String[] args)throws IOException
    {
        StringBuffer a = new StringBuffer();
        char b;
        System.out.println("请输入文件的路径：");
        while ((b=(char) System.in.read())!='\n')
        a.append(b);
        File c = new File(a.toString());
        StringBuffer d = new StringBuffer();
        char e;
        System.out.println("请输入欲读取文件名：");
        while ((e=(char) System.in.read())!='\n')
        d.append(e);

        File f = new File(c,d.toString());
        if(f.isFile() && f.canRead()&&f.canWrite())
        {
            RandomAccessFile g = new RandomAccessFile(f,"rw");
            while (g.getFilePointer()<g.length())
                System.out.println(g.readLine());
            g.close();
        }
        else System.out.println("文件不可读");
    }
}
