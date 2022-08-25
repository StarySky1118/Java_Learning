package com.hypergraph.event;

import javax.swing.*;

// 窗口类
public class MyFrame extends JFrame {
    private MyPanel mp; // 窗口中有画板

    public MyFrame() {
        mp = new MyPanel(); // 新建画板
        this.add(mp); // 添加画板
        this.addKeyListener(mp); // 添加监听器
        this.setSize(800, 600); // 设置大小
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 设置关闭选项
        this.setVisible(true); // 设置可见
    }
}
