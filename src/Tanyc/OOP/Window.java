package Tanyc.OOP;

import javax.swing.*;

public class Window {
    public static void main(String[] args) {
        JFrame JF = new JFrame();//创建窗体对象
        JF.setSize(800,900);//调用成员方法，设置宽高
        JF.setLocationRelativeTo(null);//调用成员方法，设置居中
        JF.setAlwaysOnTop(true);//调用成员方法，设置置顶
        JF.setDefaultCloseOperation(3);//调用成员方法，设置关闭模式
        JF.setTitle("2048小游戏（作者谭耀楚）");//调用成员方法，设置标题
        JF.setVisible(true);//调用成员方法，设置窗体可见
    }



}
