package drawcircle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

// 画板
public class MyPanel extends JPanel implements KeyListener {
    Ball ball;

    public MyPanel() {
        ball = new Ball(10, 10);
    }

    @Override
    public void paint(Graphics g) {
        // 黑色背景--1000 * 750
        g.fillRect(0, 0, 1000, 750);

        // 画出小球
        g.setColor(Color.CYAN);
        g.fillOval(ball.getX(), ball.getY(), 10, 10);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_UP) {
            ball.move(0);
        }
        if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
            ball.move(1);
        }
        if(e.getKeyCode() == KeyEvent.VK_DOWN) {
            ball.move(2);
        }
        if(e.getKeyCode() == KeyEvent.VK_LEFT) {
            ball.move(3);
        }

        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
