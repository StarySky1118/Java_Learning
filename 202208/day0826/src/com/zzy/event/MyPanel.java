package com.zzy.event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

// 画板类
public class MyPanel extends JPanel implements KeyListener {
    // 画板中有个小球
    private Ball ball;

    public MyPanel() {
        ball = new Ball(10, 10);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.RED);
        g.fillOval(ball.getX(), ball.getY(), 10, 10);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_UP) { // 向上
            ball.moveUp();
        }
        if(e.getKeyCode() == KeyEvent.VK_RIGHT) { // 向右
            ball.moveRight();
        }
        if(e.getKeyCode() == KeyEvent.VK_DOWN) { // 向下
            ball.moveDown();
        }
        if(e.getKeyCode() == KeyEvent.VK_LEFT) { // 向左
            ball.moveLeft();
        }

        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
