package Tanyc.IO;
import java.io.*;
public class app10_9 {
    public static void main(String[] args)
    {
        try(
                InputStreamReader ipr = new InputStreamReader(System.in);
                BufferedReader bfr = new BufferedReader(ipr)
            )
        {
            String a ="D:"+File.separator+"study"+File.separator+"code"+File.separator+"IOTest";
            String b ="D:"+File.separator+"study"+File.separator+"code"+File.separator+"IOTest"+File.separator+"app10_9";
            String e ;
            File c = new File(a);
            if (c.exists() && c.isDirectory())
            {
                System.out.println("文件夹"+c+"已存在");
                System.out.println("该文件夹的文件列表如下");
                for (int i = 0;i<c.list().length;i++)
                    System.out.println((c.list())[i]);
                File d = new File(b);
                if(!d.exists())
                    d.mkdir();
                System.out.println();
                System.out.println("建立新文件夹后的文件列表");
                for (int i = 0;i<c.list().length;i++)
                    System.out.println((c.list())[i]);
            }
            System.out.println("请输入一个文件名:");
            e=bfr.readLine();
            File f= new File(c,e);
            if(f.isFile())
            {
                System.out.println("文件名为:"+f.getName());
                System.out.println("所在文件夹为:"+f.getPath());
                System.out.println("文件大小为:"+f.length()+"字节");
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e.toString());
        }
        catch (NullPointerException e)
        {
            System.out.println(e.toString());
        }
        catch (IOException e)
        {
            System.out.println("IO异常"+e.toString());
        }
    }
}
