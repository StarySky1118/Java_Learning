package com.zzy.event;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    private MyPanel mp; // 画板

    public MyFrame() throws HeadlessException {
        mp = new MyPanel();
        this.add(mp);
        this.setSize(800, 600);
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
