package study.hsp.project.TankBattle;

import javax.swing.*;

public class HspTankGame01 extends JFrame {
    public static void main(String[] args) {
        new HspTankGame01();
    }
    MyPanel myPanel = null;
    public HspTankGame01() {
        myPanel = new MyPanel();
        this.add(myPanel);
        this.setSize(1000, 750);
        this.addKeyListener(myPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true );
    }
}
