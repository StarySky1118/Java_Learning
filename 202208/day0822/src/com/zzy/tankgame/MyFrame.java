package com.zzy.tankgame;

import javax.swing.*;

// 游戏窗口
public class MyFrame extends JFrame {
    private MyPanel mp;

    public MyFrame() {
        mp = new MyPanel();
        this.add(mp);
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
