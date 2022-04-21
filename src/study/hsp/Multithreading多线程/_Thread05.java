package study.hsp.Multithreading多线程;

public class _Thread05 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + " carry out -----" + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class ThreadTest05 {
    public static void main(String[] args) throws InterruptedException {
        _Thread05 t = new _Thread05();
        t.setPriority(Thread.MIN_PRIORITY);
        t.start();

        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + "carry out -----" + i);
            Thread.sleep(1000);
            if (i == 3) {
                // t 使用join 插队 需要执行完join 才能执行主线程
                // 可指定参数 millis 设置插队的时间 到了时间后退出插队
                t.join(10000);
                // 线程礼让 不一定成功 要由cpu来判断资源情况
               Thread.yield();
            }
        }
    }
}