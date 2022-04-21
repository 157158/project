package study.hsp.Multithreading多线程;

public class _Thread06 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "output" + (i + 1));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
/*主线程每隔1s,输出hi,一共10次
当输出到hi5时，启动一个子线程（要求 实现Runnable ),每隔1s输出hello ,等 该线程输出10次hello 后，退出*/

class _ThreadTest06 {
    public static void main(String[] args) throws InterruptedException {
        _Thread06 t = new _Thread06();
        Thread th = new Thread(t);
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + "output" + (i));
            Thread.sleep(1000);
            if (i == 5) {
                th.start();
                th.join();
                System.out.println(th.getName()+ "stop...");
            }
        }
    }
}
