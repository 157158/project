package study.hsp.Innerclass内部类.stiticinnerclass静态内部类;

public class test {
    public static void main(String[] args) {
        test t = new test();
        Inner in = t.new Inner();
        System.out.println(in.n + "no");
    }

    class Inner  {
        public int n = 5;
    }

    public test () {
        Inner i1 = new Inner();
        i1.n = 10;
        System.out.println(i1.n);
        Inner i2 = new Inner();
        System.out.println(i2.n);
    }
}
