package study.hsp.Multithreading多线程;

public class _Thread08 implements Runnable {
    public void sell() {
        //同步代码块 非静态方法中可以使用this表示 锁
        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + "----->" + (i + 1));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void staticSell() {
        //静态同步代码块 可以使用类名.class 表示锁 静态代码块被锁的是类本身
        synchronized (_Thread08.class) {
            for (int i = 0; i < 10; i++) {
                System.out.println("static -- " + Thread.currentThread().getName() + "----->" + (i + 1));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public void run() {
//        sell();
        staticSell();
    }

}

// synchronized 用来表示只有一个线程来访问这个对象
class _ThreadTest08 {
    public static void main(String[] args) throws InterruptedException {
        _Thread08 t08 = new _Thread08();
        Thread thread = new Thread(t08);
        thread.start();
        new Thread(t08).start();
//        thread.wait(1000);

    }
}
