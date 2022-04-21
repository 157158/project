package study.hsp.Multithreading多线程;

@SuppressWarnings({"InfiniteLoopStatement", "BusyWait"})
public class _ThreadDaemon implements Runnable {
    int count;

    @Override
    public void run() {
        while (true) {
            System.out.println(Thread.currentThread().getName() + " ----run----> " + (++count));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

@SuppressWarnings({"BusyWait", "InfiniteLoopStatement"})
class _ThreadDaemon01 implements Runnable {
    int count;

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " ----run----> " + (++count));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
}

class _ThreadDaemonTest {
    public static void main(String[] args) {
        _ThreadDaemon threadDaemon = new _ThreadDaemon();
        Thread t = new Thread(threadDaemon);
        t.setDaemon(true);
        t.start();

        _ThreadDaemon01 threadDaemon01 = new _ThreadDaemon01();
        Thread t2 = new Thread(threadDaemon01);
        t2.start();
    }
}
