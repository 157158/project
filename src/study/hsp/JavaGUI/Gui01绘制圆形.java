package study.hsp.JavaGUI;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings({"NonAsciiCharacters", "FieldCanBeLocal"})
public class Gui01绘制圆形 extends JFrame {
    public static void main(String[] args) {
        new Gui01绘制圆形();
    }

    private MyPanel01 mp = null;

    public Gui01绘制圆形() {
        //初始化面板
        mp = new MyPanel01();
        //把面板放入窗口
        this.add(mp);
        //设置窗口大小
        this.setSize(500, 600);
        //点击 x 时退出程序
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //设置可以显示
        this.setVisible(true);
    }

}

class MyPanel01 extends JPanel {
//说明：
//1.MyPaneL 对象就是一个画板
//2.Graphics g 把g理解成一支画笔
//3.Graphics 提供了很多绘图的方法
//4.Graphics g


    @Override
    public void paint(Graphics g) { //绘图方法
        //调用父类方法完成初始化
        super.paint(g);
        //画出一个圆形
//        g.drawOval(10, 10, 200, 200);
        //加载图片
        Image image = Toolkit.getDefaultToolkit().getImage(Panel.class.
                getResource("/imgLoli.jpg"));
        g.drawImage(image,10, 10, 350, 210, this);
    }
}