package study.hsp.JavaGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class SmallBall extends JFrame {

    SmallBallPanel sbp = null;

    public static void main(String[] args) {
        SmallBall smallBall = new SmallBall();
    }

    public SmallBall() {
        sbp = new SmallBallPanel();
        this.add(sbp);
        this.setSize(600, 500);
        //窗口JFrame对象可以监听键盘事件
        this.addKeyListener(sbp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}


class SmallBallPanel extends JPanel implements KeyListener {
    private int x = 10;
    private int y = 10;

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(x, y, 20, 20);
    }


    //有字符输出 该方法被调用
    @Override
    public void keyTyped(KeyEvent e) {

    }


    //键盘按键按下 该方法调用
    @Override
    public void keyPressed(KeyEvent e) {
        //e.getKeyCode 键盘按下的键
        //KeyEvent.  是键盘对应的ASCII值

        if (e.getKeyCode() == KeyEvent.VK_W) {
            y--;
        }
        if (e.getKeyCode() == KeyEvent.VK_S) {
            y++;
        }
        if (e.getKeyCode() == KeyEvent.VK_A) {
            x--;
        }
        if (e.getKeyCode() == KeyEvent.VK_D) {
            x++;
        }
        //重新绘制画板
        repaint();
    }

    //松开键盘按键 该方法调用
    @Override
    public void keyReleased(KeyEvent e) {

    }

}
