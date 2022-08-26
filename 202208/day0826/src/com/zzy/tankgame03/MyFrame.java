package com.zzy.tankgame03;

import javax.swing.*;

// 游戏窗口
public class MyFrame extends JFrame {
    private MyPanel mp;

    public MyFrame() {
        mp = new MyPanel();
        new Thread(mp).start();
        this.add(mp);
        this.addKeyListener(mp);
        this.setSize(1000, 750);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
