package Tanyc.IO;

import java.io.*;

public class app10_8 {
    public static void main(String[] args)
    {
        try
        (
            BufferedReader bf =new BufferedReader(new FileReader("D:/study/code/IOTest/app10_6.txt"));
            BufferedWriter bw =new BufferedWriter(new FileWriter("D:/study/code/IOTest/app10_8.txt"));
        )
        {
            String thisline;
            while ((thisline= bf.readLine())!=null)
            {
                System.out.println(thisline);
                bw.write(thisline);
                bw.newLine();
            }
                bw.flush();
        }
        catch (IOException e )
        {
            System.out.println("IO异常"+e);
        }
    }
}
