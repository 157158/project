package study.hsp.Multithreading多线程;

// 代理模式 (简单版）
// 简单理解，
public class ThreadProxy implements Runnable {

    private Runnable target = null;

    @Override
    public void run() {
        if (target != null) {
            target.run();//动态绑定 实际使用的tek的run方法
        }
    }

    public ThreadProxy(Runnable target) {
        this.target = target;
    }

    public void start() {
    }
}

class Person {
}

//如果这个类已经继承了另外一个类 就无法继承Thread实现开启进程
//这时通过实现Runnable接口来开启进程
class Tek extends Person implements Runnable {
    @Override
    public void run() {
        System.out.println("tak...");
    }
}

class ThreadProxyTest {
    public static void main(String[] args) {
        Tek tek = new Tek();
        new ThreadProxy(tek);//动态绑定 传入tek类型的对象
    }
}
