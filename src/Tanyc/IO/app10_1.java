package Tanyc.IO;
import java.io.*;
public class app10_1 {
    public static void main(String[] args){
        char a;
        int b;
        try {
            FileInputStream fin = new FileInputStream(FileDescriptor.in);
            FileOutputStream fout = new FileOutputStream("D:/study/code/IOTest/Myfile.txt");
            {
                System.out.println("请输入一串字符，并以#结束：");
                while ((a=(char)fin.read())!='#')
                    fout.write(a);
            }
        }
        catch (FileNotFoundException e ){
    System.out.println("文件没找到");
}
        catch (IOException e){
            System.out.println("IO异常");
        }
        try {
            FileInputStream fin = new FileInputStream("D:/study/code/IOTest/Myfile.txt");
            FileOutputStream fout = new FileOutputStream(FileDescriptor.out);
            {
                while (fin.available()>0)
                {
                    b=fin.read();
                    fout.write(b);
                }
            }
}
        catch (IOException e){            System.out.println("IO异常");
        }
    }
}
