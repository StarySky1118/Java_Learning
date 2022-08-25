package com.hypergraph.event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

// 画板类
public class MyPanel extends JPanel implements KeyListener {
    private Ball ball; // 画板中有个小球

    public MyPanel() {
        ball = new Ball(100, 100);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.RED);
        g.fillOval(ball.getX(), ball.getY(), 10, 10);
    }

    // 监听字符
    @Override
    public void keyTyped(KeyEvent e) {

    }

    // 监听键盘按下
    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_UP) { // 向上
            ball.setY(ball.getY() - 4);
            System.out.println("向上...");
        }
        if(e.getKeyCode() == KeyEvent.VK_DOWN) { // 向下
            ball.setY(ball.getY() + 4);
        }
        if(e.getKeyCode() == KeyEvent.VK_LEFT) { // 向左
            ball.setX(ball.getX() - 4);
        }
        if(e.getKeyCode() == KeyEvent.VK_RIGHT) { // 向右
            ball.setX(ball.getX() + 4);
        }

        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
