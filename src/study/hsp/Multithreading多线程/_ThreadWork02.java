package study.hsp.Multithreading多线程;

/*有2个用户分别从同一个卡上取钱（总额：10000） 每次都取1000，当余额不足时，就不能取款了 不能出现超取现象=》线程同步问题*/
public class _ThreadWork02 {
    public static void main(String[] args) throws InterruptedException {
        Work02 w1 = new Work02();
        new Thread(w1).start();
        new Thread(w1).start();

    }
}


class Work02 extends Thread{
     int price = 10000;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                if (price < 1000) {
                    System.out.println("stop...");
                    return;
                }

                price -= 1000;
                System.out.println(Thread.currentThread().getName() + "--take--" + price);
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}