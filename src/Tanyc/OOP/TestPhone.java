package Tanyc.OOP;

public class TestPhone
{
    public static void main(String[] args) {
        Phone PHO = new Phone();
        PHO.brand="苹果";
        PHO.price=5299;
        System.out.println("手机品牌名称是："+PHO.brand);
        System.out.println("手机价格是："+PHO.price);
        System.out.println("手机的功能有：\n");
        PHO.call("谭耀楚");
        PHO.SendMessage("谭耀楚");
        int result = PHO.add(10000,9999330);
        System.out.println(result);
        System.out.println("-----------------------");

        PHO.name="tan";
        PHO.jj("谭");

    }
}
