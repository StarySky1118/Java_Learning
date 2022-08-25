package com.zzy.javadraw;

import javax.swing.*;
import java.awt.*;

// 自定义窗口
public class MyFrame extends JFrame {

    private MyPanel mp;
    public MyFrame() throws HeadlessException {
        // 新建画板
        mp = new MyPanel();
        // 向窗口添加画板
        this.add(mp);
        // 设置窗口大小
        this.setSize(400, 300);
        // 设置窗口可视
        this.setVisible(true);
        // 点击Frame叉号即可退出
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
