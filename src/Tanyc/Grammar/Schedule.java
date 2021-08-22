package Tanyc.Grammar;

import java.util.Scanner;

public class Schedule {
    public static void main(String[] args) {
        //switch语句改进
        System.out.println("请输入你要查询的星期:");
        Scanner T=new Scanner(System.in);
        int WeekSchedule= T.nextInt();
        switch (WeekSchedule){
            case 1:
                System.out.println("14:00~15:00: 经济学C2\n" +
                        "甘小立讲师\n" +
                        "12-203\n"+
                        "19:00~20:30: Java面向对象程序设计\n" +
                        "周雪刚副教授\n" +
                        "21-301\n" );
                break;
            case 2:
                System.out.println("8:00~9:45: Java面向对象程序设计\n" +
                        "周雪刚副教授\n" +
                        "21-301\n"+
                        "14:00~15:30: 高等代数与解析几何II\n" +
                        "林奕武讲师\n" +
                        "21-204\n"+
                        "16:30~18:00: 数学分析Ⅱ\n" +
                        "林奕武讲师\n" +
                        "16-202\n");
                break;
            case 3:
                System.out.println("8:00~9:45: 数学分析Ⅱ\n" +
                        "林奕武讲师\n" +
                        "21-203\n"+
                        "10:00~11:30: 高等代数与解析几何II\n" +
                        "林奕武讲师\n" +
                        "21-204\n"+
                        "14:00~15:30: 创新思维\n" +
                        "杨娟华\n" +
                        "21-304\n"+
                        "19:00~20:30: Photoshop图像设计\n" +
                        "杨黎明其他\n" +
                        "12-201\n");
                break;
            case 4:
                System.out.println("8:00~9:45: 军事理论\n" +
                        "常铫\n" +
                        "14-302\n"+
                        "10:00~11:30: 大学英语Ⅱ\n" +
                        "丘柳珍讲师\n" +
                        "21-305\n"+
                        "14:45~16:30:体育I【跆拳道】\n" +
                        "姚凌紫\n" +
                        "19:00~20:30: 中国古代礼仪文化\n" +
                        "周秀雄其他\n" +
                        "16-202\n");
                break;
            case 5:
                System.out.println("8:00~9:45: 大学英语Ⅱ\n" +
                        "丘柳珍讲师\n" +
                        "21-305\n"+
                        "14:45~16:30: 中国近现代史纲要\n" +
                        "马炳涛\n" +
                        "21-202\n");
                break;
            case 6:
                System.out.println("14:00~15:30: 马克思主义中国化进程与青年学生使命担当\n" +
                        "李大毅\n" +
                        "21-205\n");
                break;
            case 7:
                System.out.println("没课");
                break;
            default :
                System.out.println("输入数据有误");
                break;
        }

    }
}
