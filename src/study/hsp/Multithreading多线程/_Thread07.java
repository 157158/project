package study.hsp.Multithreading多线程;

public class _Thread07 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class _ThreadTest07 {
    public static void main(String[] args) throws InterruptedException {
        _Thread07 thread07 = new _Thread07();
        Thread thread01 = new Thread(thread07);
        System.out.println(thread01.getName() + " state " + thread01.getState());
        thread01.start();

        while (Thread.State.TERMINATED != thread01.getState()) {
            System.out.println(thread01.getName() + " state " + thread01.getState());
            Thread.sleep(1000);
        }
        System.out.println(thread01.getName() + " state " + thread01.getState());

    }
}
