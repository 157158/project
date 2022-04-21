package study.hsp.project.TankBattle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

public class MyPanel extends JPanel implements KeyListener {
    Hero hero = null;
    Graphics g;
    Vector<EnemyTank> enemyTanks = new Vector<>();
    int enemyTanksSize = 3;

    public MyPanel() {
        hero = new Hero(400, 400);
        hero.setSpeed(4);
        for (int i = 0; i < enemyTanksSize; i++) {
            enemyTanks.add(new EnemyTank(100 * (i + 1), 0));
            enemyTanks.get(i).setDirection(2);
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750);
        this.g = g;
        drawTank(hero.getX(), hero.getY(), g, hero.getDirection(), 0);

        for (int i = 0; i < enemyTanks.size(); i++) {
            EnemyTank enemyTank = enemyTanks.get(i);
            drawTank(enemyTank.getX(), enemyTank.getY(), g, enemyTank.getDirection(), 1);

        }

    }

    /**
     * @param x         tank x 坐标
     * @param y         tank y 坐标
     * @param g         画笔
     * @param direction 坦克方向
     * @param type      坦克属性
     */
    public void drawTank(int x, int y, Graphics g, int direction, int type) {
        switch (type) { //判断坦克属性
            case 0:
                g.setColor(Color.cyan);
                break;
            case 1:
                g.setColor(Color.YELLOW);
                break;
        }
        // direction  (0 上, 1 右, 2 下 , 3 左)
        switch (direction) {// 判断坦克方向
            case 0: //0 上
                g.fill3DRect(x, y, 10, 60, false); //左边轮子
                g.fill3DRect(x + 30, y, 10, 60, false); //右边轮子
                g.fill3DRect(x + 10, y + 10, 20, 40, false); //坦克盖子
                g.fillOval(x + 10, y + 20, 20, 20); //圆盖子
                g.drawLine(x + 20, y + 30, x + 20, y); //炮管
                break;
            case 1: //1 右
                g.fill3DRect(x, y, 60, 10, false);//画出坦克上边轮子
                g.fill3DRect(x, y + 30, 60, 10, false);//画出坦克下边轮子
                g.fill3DRect(x + 10, y + 10, 40, 20, false);//画出坦克盖子
                g.fillOval(x + 20, y + 10, 20, 20);//画出圆形盖子
                g.drawLine(x + 30, y + 20, x + 60, y + 20);//画出炮筒
                break;
            case 2://表示向下 case 2
                g.fill3DRect(x, y, 10, 60, false);//画出坦克左边轮子
                g.fill3DRect(x + 30, y, 10, 60, false);//画出坦克右边轮子
                g.fill3DRect(x + 10, y + 10, 20, 40, false);//画出坦克盖子
                g.fillOval(x + 10, y + 20, 20, 20);//画出圆形盖子
                g.drawLine(x + 20, y + 30, x + 20, y + 60);//画出炮筒
                break;
            case 3://表示向左
                g.fill3DRect(x, y, 60, 10, false);//画出坦克上边轮子
                g.fill3DRect(x, y + 30, 60, 10, false);//画出坦克下边轮子
                g.fill3DRect(x + 10, y + 10, 40, 20, false);//画出坦克盖子
                g.fillOval(x + 20, y + 10, 20, 20);//画出圆形盖子
                g.drawLine(x + 30, y + 20, x, y + 20);//画出炮筒
                break;
            default:
                System.out.println("无法使用");
        }


    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    //按下wasd
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W) {
            hero.moveUp();
            hero.setDirection(0);
        }
        if (e.getKeyCode() == KeyEvent.VK_S) {
            hero.moveDown();
            hero.setDirection(2);
        }

        if (e.getKeyCode() == KeyEvent.VK_D) {
            hero.moveRight();
            hero.setDirection(1);
        }
        if (e.getKeyCode() == KeyEvent.VK_A) {
            hero.moveLeft();
            hero.setDirection(3);
        }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}


