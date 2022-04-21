package study.hsp.Innerclass内部类.MemberInnerclass成员内部类;

public class MemberInnerClass01 {
    public static void main(String[] args) {
        Outer08 out = new Outer08();
        out.t1();
        //1. 相当于把new Inner08 当作 out的成员
        System.out.println("================");
        Outer08.Inner08 ine = out.new Inner08();
        ine.say();
        //2. 在外部类中调用Inner08的get方法返回Inner08对象
        System.out.println("================");
        Outer08.Inner08 inner = out.getInner08Instance();
        inner.say();

    }
}

class Outer08 {
    //外部类
    private int n1 = 10;
    public String name = "张三";

    private void hi() {
        System.out.println("hi()方法...");
    }

    public class Inner08 {//成员内部类
        private double sal = 99.8;
        private int n1 = 66;

        public void say() {
            System.out.println("n1 = " + n1 + " name = " + name + " 外部类的 n1=" + Outer08.this.n1);
            hi();
        }
    }
    // 返回一个 Inner08的实例
    public Inner08 getInner08Instance() {
        return new Inner08();
    }

    public void t1() {
        Inner08 inner08 = new Inner08();
        inner08.say();
        System.out.println(inner08.sal);
    }
}

