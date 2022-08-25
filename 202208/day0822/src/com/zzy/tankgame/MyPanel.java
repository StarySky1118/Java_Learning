package com.zzy.tankgame;

import javax.swing.*;
import java.awt.*;

// 坦克绘图区域
public class MyPanel extends JPanel {
    // 定义我的坦克
    Hero hero;

    public MyPanel() {
        hero = new Hero(100, 200);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 800, 600);

        // 画出坦克方法
        drawTank(hero.getX(), hero.getY(), g, 0, 0);
    }

    /**
     * @param x         坦克横坐标
     * @param y         坦克纵坐标
     * @param g         画笔
     * @param direction 坦克方向
     * @param type      坦克类型
     */
    // 画坦克方法
    public void drawTank(int x, int y, Graphics g, int direction, int type) {

        // 根据type确定坦克颜色
        switch (type) {
            case 0:
                g.setColor(Color.CYAN);
                break;
            case 1:
                g.setColor(Color.yellow);
                break;
        }

        // 根据坦克方向绘制坦克
        switch (direction) {
            case 0:
                g.fill3DRect(x, y, 10, 60, false);
                g.fill3DRect(x + 10, y + 10, 20, 40, false);
                g.fill3DRect(x + 30, y, 10, 60, false);
                g.fillOval(x + 10, y + 20, 20, 20);
                g.drawLine(x + 20, y + 30, x + 20, y);
            case 1:
        }
    }
}
