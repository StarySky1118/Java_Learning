package com.zzy.tankgame03;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

// 坦克绘图区域
public class MyPanel extends JPanel implements KeyListener, Runnable {
    // 定义我的坦克
    Hero hero;

    // 敌方坦克
    List<Enemy> list;

    public MyPanel() {
        hero = new Hero(100, 200, 0);
        list = new Vector<>();
        Enemy enemy1 = new Enemy(100, 300, 0);
        Enemy enemy2 = new Enemy(200, 300, 0);
        Enemy enemy3 = new Enemy(300, 300, 0);
        list.add(enemy1);
        list.add(enemy2);
        list.add(enemy3);

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750);

        // 画出坦克
        drawTank(hero.getX(), hero.getY(), g, hero.getDirection(), 0);
        for (int i = 0; i < list.size(); i++) {
            Enemy enemy = list.get(i);
            drawTank(enemy.getX(), enemy.getY(), g, enemy.getDirection(), 1);
        }

        // 画出己方全部子弹
        g.setColor(Color.CYAN);
        for (int i = 0; i < hero.getBullets().size(); i++) {
            Bullet bullet = hero.getBullets().get(i);
            if(bullet != null && bullet.isAlive()) {
                System.out.println("画出了子弹...");
                g.drawOval(bullet.getX(), bullet.getY(), 2, 2);
            }
        }

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
        // 0-向上 1-向右 2-向下 3-向左
        switch (direction) {
            case 0: // 向上
                g.fill3DRect(x, y, 10, 60, false);
                g.fill3DRect(x + 10, y + 10, 20, 40, false);
                g.fill3DRect(x + 30, y, 10, 60, false);
                g.fillOval(x + 10, y + 20, 20, 20); // 坦克盖子
                g.drawLine(x + 20, y + 30, x + 20, y); // 炮筒
                break;
            case 1: // 向右
                g.fill3DRect(x, y, 60, 10, false); // 上面轮子
                g.fill3DRect(x + 10, y + 10, 40, 20, false); // 中间舱体
                g.fill3DRect(x, y + 30, 60, 10, false); // 下面轮子
                g.fillOval(x + 20, y + 10, 20, 20); // 坦克盖子
                g.drawLine(x + 30, y + 20, x + 60, y + 20); // 炮筒
                break;
            case 2: // 向下
                g.fill3DRect(x, y, 10, 60, false);
                g.fill3DRect(x + 10, y + 10, 20, 40, false);
                g.fill3DRect(x + 30, y, 10, 60, false);
                g.fillOval(x + 10, y + 20, 20, 20); // 坦克盖子
                g.drawLine(x + 20, y + 30, x + 20, y + 60); // 炮筒
                break;
            case 3: // 向左
                g.fill3DRect(x, y, 60, 10, false); // 上面轮子
                g.fill3DRect(x + 10, y + 10, 40, 20, false); // 中间舱体
                g.fill3DRect(x, y + 30, 60, 10, false); // 下面轮子
                g.fillOval(x + 20, y + 10, 20, 20); // 坦克盖子
                g.drawLine(x + 30, y + 20, x, y + 20); // 炮筒
                break;

        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) { // 键盘按下
        if(e.getKeyCode() == KeyEvent.VK_UP) { // 向上移动
            if(hero.getDirection() != 0) {
                hero.setDirection(0);
            }
            else {
                hero.moveUp();
            }
        }

        if(e.getKeyCode() == KeyEvent.VK_RIGHT) { // 向右移动
            if(hero.getDirection() != 1) {
                hero.setDirection(1);
            }
            else {
                hero.moveRight();
            }
        }

        if(e.getKeyCode() == KeyEvent.VK_DOWN) { // 向下移动
            if(hero.getDirection() != 2) {
                hero.setDirection(2);
            }
            else {
                hero.moveDown();
            }
        }

        if(e.getKeyCode() == KeyEvent.VK_LEFT) { // 向左移动
            if(hero.getDirection() != 3) {
                hero.setDirection(3);
            }
            else {
                hero.moveLeft();
            }
        }

        if(e.getKeyCode() == KeyEvent.VK_SPACE) { // 发射子弹
            hero.shoot();
        }

        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void run() {
        // 不断对画板进行重绘
        while(true) {
            // 休眠
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            // 重绘
            repaint();
        }
    }
}
