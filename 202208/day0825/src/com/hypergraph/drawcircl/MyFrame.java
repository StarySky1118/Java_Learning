package com.hypergraph.drawcircl;

import javax.swing.*;
import java.awt.*;

// 窗口对象
public class MyFrame extends JFrame {
    MyPanel mp; // 窗口中有一个画板

    public MyFrame() throws HeadlessException {
        mp = new MyPanel(); // 创建新画板
        this.add(mp); // 向窗口添加画板
        this.setSize(800, 600);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
