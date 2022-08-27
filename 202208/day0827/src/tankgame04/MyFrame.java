package tankgame04;

import javax.swing.*;

// 游戏窗口
public class MyFrame extends JFrame {
    private MyPanel mp;

    public static final int DEFAULT_WIDTH = 1000; // 默认宽度
    public static final int DEFAULT_HEIGHT = 750; // 默认高度

    public MyFrame() {
        mp = new MyPanel();
        new Thread(mp).start();
        this.add(mp);
        this.addKeyListener(mp);
        this.setSize(1400, 1000);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
