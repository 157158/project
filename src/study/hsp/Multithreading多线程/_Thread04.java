package study.hsp.Multithreading多线程;

public class _Thread04 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " ------> 正在执行第" + i + "次");
            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                System.out.println("中断....");
            }
        }
    }
}

class _ThreadTest04 {
    public static void main(String[] args) throws InterruptedException {
        _Thread04 t = new _Thread04();
        Thread t1 = new Thread(t);
        t1.start();

        t1.interrupt();
    }
}
