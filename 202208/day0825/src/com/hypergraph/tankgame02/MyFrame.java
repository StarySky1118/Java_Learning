package com.hypergraph.tankgame02;

import javax.swing.*;

// 游戏窗口
public class MyFrame extends JFrame {
    private MyPanel mp;

    public MyFrame() {
        mp = new MyPanel();
        this.add(mp);
        this.addKeyListener(mp);
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
