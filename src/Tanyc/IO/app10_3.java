package Tanyc.IO;
import java.io.*;
public class app10_3 {
    public static void main(String[] args)
    {
        try {
            FileOutputStream fout = new FileOutputStream("D:/study/code/IOTest/temp.txt");
            DataOutputStream dout = new DataOutputStream(fout);
                             //向数据流中写入数据,数据流连接文件流传递数据，数据被写入文件中
                dout.writeInt(9);
                dout.writeLong(12345);
                dout.writeFloat(3.123456f);
                dout.writeDouble(123456.789);
                dout.writeBoolean(true);
                dout.writeChars("goodbye!\n\r");

        }
        catch (FileNotFoundException e)
        {
            System.out.println("文件找不到");
        }
        catch (IOException e)
        {
            System.out.println("IOException");
        }

        try {
            FileInputStream fin = new FileInputStream("D:/study/code/IOTest/temp.txt");
            DataInputStream din = new DataInputStream(fin);
                         //文件中的数据被读出到文件流中，文件流连接数据流，数据被从数据流中读出到屏幕
                System.out.println(din.readInt());
                System.out.println(din.readLong());
                System.out.println(din.readFloat());
                System.out.println(din.readDouble());
                System.out.println(din.readBoolean());
                char a;
                while ((a= din.readChar())!='\0')
                    System.out.print(a);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("文件找不到");
        }catch (IOException e) {}
}}