package Tanyc.Thread;
import org.apache.commons.io.FileUtils;
import java.io.*;
import java.net.URL;
//继承Thread
public class App11_1 extends Thread {
private final String url;
private final String name;

App11_1(String url, String name)
{
this.url = url;
this.name = name;
}

    public void run() {
WebDownload webDownload = new WebDownload();
webDownload.download(url,name);
        System.out.println("下载了文件名为："+name+"的文件");

    }

    public static void main(String[] args) {
        App11_1 a1 = new App11_1("https://i0.hdslb.com/bfs/archive/450610c90b1dfc64b1201eba49f508af6e9aa588.jpg@412w_232h_1c.jpg", "Tanyc/Test/1.jpg");
        App11_1 a2 = new App11_1("https://i0.hdslb.com/bfs/archive/450610c90b1dfc64b1201eba49f508af6e9aa588.jpg@412w_232h_1c.jpg", "Tanyc/Test/2.jpg");
        App11_1 a3 = new App11_1("https://i0.hdslb.com/bfs/archive/450610c90b1dfc64b1201eba49f508af6e9aa588.jpg@412w_232h_1c.jpg", "Tanyc/Test/3.jpg");
        a1.start();
        try {
            a1.join();//限制先让a1执行完
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        a2.start();
        a3.start();
    }
}

//下载器
class WebDownload
{

    public void download(String url,String name)
    {
        try {
            FileUtils.copyURLToFile(new URL(url),new File(name));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IO异常");
        }
    }

}






