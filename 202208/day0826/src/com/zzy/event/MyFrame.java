package com.zzy.event;

import javax.swing.*;
import java.awt.*;

// 窗口类
public class MyFrame extends JFrame {
    private MyPanel mp; // 窗口有个画板

    public MyFrame() throws HeadlessException {
        mp = new MyPanel();
        this.add(mp); // 将画板添加到窗口
        this.addKeyListener(mp); // 添加监听器
        this.setSize(800, 600); // 设置尺寸
        this.setVisible(true); // 设置可见
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 设置关闭方式
    }
}
