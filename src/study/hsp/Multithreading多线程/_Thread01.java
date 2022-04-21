package study.hsp.Multithreading多线程;

class _RunnableDemo implements Runnable {
    private Thread r;
    private final String threadName;

    _RunnableDemo (String name) {
        threadName = name;
//        System.out.println("Creating" + threadName);
    }


    @Override
    public void run() {
        System.out.println("run" + threadName);
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("线程for: " + threadName + ", " + i);
                Thread.sleep(30);
            }
        } catch (InterruptedException e) {
            System.out.println(" " + threadName + "中断");
        }
        System.out.println(" " + threadName + "退出");
    }

    public void start() {
        System.out.println("start" + threadName);
        if (r == null) {
            r = new Thread(this, threadName);
            r.start();
        }
    }

}


public class _Thread01 {
    public static void main(String[] args) {
        _RunnableDemo thread = new _RunnableDemo("Thread");
        thread.start();
        _RunnableDemo thread01 = new _RunnableDemo("Thread01");
        thread01.start();
    }
}
