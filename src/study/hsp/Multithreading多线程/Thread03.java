package study.hsp.Multithreading多线程;


public class Thread03 implements Runnable {
    private static int ticketNum = 10;
    private final String name;
    private boolean control = true;
    Thread03(String name) {
        this.name = name;
    }

    @Override
    public  void run() {
        while (control)
            control = sell();
    }

    synchronized boolean sell() {
        if (ticketNum <= 0) {
            return false;
        }

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("win:" + name + " -1, --->" + --ticketNum);
        System.out.println(ticketNum);
        return  true;
    }
}


class ThreadTest03 {
    public static void main(String[] args) {
        Thread03 t = new Thread03("1");

        new Thread(t).start();
        new Thread(t).start();

    }
}
