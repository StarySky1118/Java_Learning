package com.hypergraph.drawcircl;

import javax.swing.*;
import java.awt.*;

// 画板对象
public class MyPanel extends JPanel {
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawOval(10, 10, 100, 100);
    }
}
