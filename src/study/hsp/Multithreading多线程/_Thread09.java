package study.hsp.Multithreading多线程;

// 线程死锁 非常危险 必须避免
public class _Thread09 {
    public static void main(String[] args) {
        _ThreadTest09 t1 = new _ThreadTest09(true);
        _ThreadTest09 t2 = new _ThreadTest09(false);
        t1.setName("线程1");
        t2.setName("线程2");
        t1.start();
        t2.start();

    }
}

@SuppressWarnings("SynchronizeOnNonFinalField")
class _ThreadTest09 extends Thread {
    static Object o1 = new Object();
    static Object o2 = new Object();
    boolean flag;

    _ThreadTest09(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
       //模拟线程死锁
        if (flag) {
            synchronized (o1) {
                //线程1 拿到了o1对象并输出语句 然后需要获取o2对象才能够进入同步代码块
                //但同时运行的线程2 已经拿到o2对象 并且需要o1对象 但o1对象以及被线程1获取
                System.out.println(Thread.currentThread().getName() + " ----> 1");
                try {
                    wait(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (o2) {
                    System.out.println(Thread.currentThread().getName() + " ----> 2");
                }
            }
        } else {
            synchronized (o2) {
                System.out.println(Thread.currentThread().getName() + " ----> 3");
                synchronized (o1) {
                    System.out.println(Thread.currentThread().getName() + " ----> 4");
                }
            }
        }
    }
}