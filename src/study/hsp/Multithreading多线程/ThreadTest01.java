package study.hsp.Multithreading多线程;

public class ThreadTest01 {
    public static void main(String[] args) {
        ThreadLuckDraw t = new ThreadLuckDraw("luckDraw01");
        t.start();
        ThreadLuckDraw t1 = new ThreadLuckDraw("luckDraw02");
        t1.start();
    }
}

@SuppressWarnings({"BusyWait", "ForLoopReplaceableByForEach"})
class ThreadLuckDraw extends Thread {
    int[] arr = {10, 5, 20, 50, 100, 200, 500, 800, 2, 80, 300};
    String name;

    ThreadLuckDraw(String name) {
        this.name = name;
    }


    @Override
    public void run() {
        try {
            for (int i = 0; i < arr.length; i++) {
//                int index = (int) (Math.random() * arr.length);
//                System.out.println(arr[index] + "----->" + name);
                System.out.println(arr[i] + "----->" + name);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
