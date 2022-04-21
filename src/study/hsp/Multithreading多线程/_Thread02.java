package study.hsp.Multithreading多线程;

public class _Thread02 {
    public static void main(String[] args) {
        _ThreadDemo01 t = new _ThreadDemo01("thread");
        t.start();
        _ThreadDemo01 t1 = new _ThreadDemo01("thread01");
        t1.start();
    }
}

@SuppressWarnings("FieldCanBeLocal")
class _ThreadDemo01 extends Thread {
    private Thread t;
    @SuppressWarnings("FieldMayBeFinal")
    private String threadName;

    _ThreadDemo01(String name) {
        threadName = name;
    }


    @Override
    public synchronized void start() {
        System.out.println(threadName + "start");
        t = new Thread(this, threadName);
        t.start();
    }

    @Override
    public void run() {
        System.out.println("run" + threadName);
        try {
            for (int i = 0; i < 4; i++) {
                System.out.println("for" + threadName + ", " + i);
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("for退出");
    }
}
