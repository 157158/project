package study.hsp.Multithreading多线程;


import java.util.Scanner;

/*在main方法中启动两个线程 第1个线程循环随机打印100以内的整数 直到第2个线程从键盘读取了“Q”命令。*/
public class _ThreadWork01 {
    public static void main(String[] args) throws InterruptedException {
        Work01 work01 = new Work01();
        work01.setName("线程1");
        work01.start();
        Scanner sc = new Scanner(System.in);
        for (; ; ) {
            String str = sc.next();
            if (str.equals("q")) {
                //输入q 时使用interrupt 中断线程休眠 捕获异常并执行catch的return
                work01.interrupt();
                break;
            }
        }
    }
}

class Work01 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            //随机数
            int x = (int) (Math.random() * 100 + 1);
            System.out.println(Thread.currentThread().getName() + "-------->" + x);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
