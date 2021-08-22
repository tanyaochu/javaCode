package Tanyc.IO;
import java.io.*;
public class app10_2 {
    public static void main(String[] args)
    {
        try {
            FileInputStream fin=new FileInputStream("D:/study/code/IOTest/2.jpg");
            FileOutputStream fout=new FileOutputStream("D:/study/code/IOTest/2_1.jpg");
            {
                System.out.println("文件的大小为："+fin.available());
                byte b[]=new byte[fin.available()];
                fin.read(b);
                fout.write(b);
                System.out.println("文件已经更名并复制");
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("文件找不到");
        }
        catch (IOException e)
        {
            System.out.println("IO异常");
        }
    }
}
