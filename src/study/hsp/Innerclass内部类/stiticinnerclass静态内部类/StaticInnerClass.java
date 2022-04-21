package study.hsp.Innerclass内部类.stiticinnerclass静态内部类;

public class StaticInnerClass {
    public static void main(String[] args) {
        // 不建议在其他外部类中直接实例化内部类的对象
//        Outer02.Inner01 inner01 = new Outer02.Inner01();
//        inner01.say();
        //  先实例化外部类的对象 利用内部类的get方法返回对象
        Outer02 outer = new Outer02();
        Outer02.Inner01 inner01 = outer.getInner01();
        inner01.say();
        Outer02.sar();
    }
}

class Outer02 {
    private static int n1 = 10;
    private int n2 = 15;

    public static class Inner01 {
        private int n1 = 20;

        public void say() {
            //静态内部类想要使用外部类的静态成员 可以使用 类名.成员的形式
            //访问非静态成员只能创建对象进行访问
            Outer02 outer = new Outer02();
            System.out.println("static inner class:" + n1);
            System.out.println("class Outer02:" + outer.n2);
            System.out.println("class static Outer02:" + Outer02.n1);
            System.out.println("==================");
        }
    }

    //访问静态内部类 需创建对象
    public static void sar() {
        Inner01 inner = new Inner01();
        inner.say();
    }

    public Inner01 getInner01() {
        return new Inner01();
    }

}
