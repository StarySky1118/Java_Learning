package com.zzy.javadraw;

import javax.swing.*;
import java.awt.*;

// 自定义面板
public class MyPanel extends JPanel {
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        // 画一个圆
//        g.drawOval(10, 10, 100, 100);

        // 画直线
//        g.drawLine(10, 10, 110, 110);

        // 画矩形边框
//        g.drawRect(10, 10, 100, 100);

        // 画填充矩形
//        g.setColor(Color.CYAN);
//        g.fillRect(10, 10, 100, 100);

        // 插入图片
//        Image image = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/OIP-C.jpg"));
//        g.drawImage(image, 10, 10, 214, 191, this);

        // 写字
        // 设置画笔的颜色和字体
        g.setColor(Color.CYAN);
        g.setFont(new Font("宋体", Font.BOLD, 50));
        g.drawString("鸡你太美", 100, 100);


    }
}
