package Tanyc.IO;
import java.io.*;
public class app10_5 {
    public static void main(String[] args)
    {
        try(FileReader fr = new FileReader("D:/study/code/IOTest/Myfile.txt");)
        {
            char [] c =new char[13];
            int num =fr.read(c);//this read methods return the number of characters read
            String str = new String(c,0,num);
            System.out.println("文本中的字符有"+num+"个");
            System.out.println("文本中的内容是："+str);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("file not found");
        }
        catch (IOException e)
        {
            System.out.println("IOException");
        }
    }
}
