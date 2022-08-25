package com.zzy.event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

// 画板
public class MyPanel extends JPanel implements KeyListener {
    private Ball ball; // 小球

    public MyPanel() {
        ball = new Ball(100, 100);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(ball.getX(), ball.getY(), 20, 20);
    }

    // 监听键入的字符
    @Override
    public void keyTyped(KeyEvent e) {

    }

    // 监听键盘按下
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            ball.setY(ball.getY() + 4);
        } else if (e.getKeyCode() == KeyEvent.VK_UP) {
            ball.setY(ball.getY() - 4);
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            ball.setX(ball.getX() - 4);
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT){
            ball.setX(ball.getX() + 4);
        }

        repaint();

    }

    // 监听键盘松开
    @Override
    public void keyReleased(KeyEvent e) {

    }
}
