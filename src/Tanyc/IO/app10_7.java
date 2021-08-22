package Tanyc.IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class app10_7 {
    public static void main(String[] args)
    {
        try (
                FileReader fr = new FileReader("D:/study/code/IOTest/app10_6.txt");
                BufferedReader  br = new BufferedReader(fr);
                )
        {
            String thisLine;
            int count = 0;
            while ((thisLine=br.readLine())!=null)
            {
                count++;
                System.out.println(thisLine);
            }
            System.out.println("共读取了"+count+"行");
        }
        catch (IOException e)
        {
            System.out.println("IO异常"+e);
        }
    }
}
