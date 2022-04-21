package study.hsp.task.task01;

public class Homework10 {
    // 测试代码效果
    public static void main(String[] args) {
        Demo demo = new Demo();
        Demo d2 = demo;
        d2.m();
        System.out.println(demo.i);
        System.out.println(d2.i);
    }
}

class Demo {
    int i = 100;
    public void m () {
        int j = i++;
        System.out.println("i=" + i);
        System.out.println("j=" + j);
    }
}
