package drawcircle;

import javax.swing.*;
import java.awt.*;

// 窗口
public class MyFrame extends JFrame {
    MyPanel mp;

    public MyFrame() throws HeadlessException {
        mp = new MyPanel();
        // 设置窗口大小
        this.setSize(1000, 750);
        // 添加画板
        this.add(mp);
        // 添加监听器
        this.addKeyListener(mp);
        // 关闭选项
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 设置可见
        this.setVisible(true);
    }
}
