package study.hsp.task.task03;

/*
1.编一个类A,在类中定义局部内部类B,B中有一个私有final 常量name,有一个方法 show 打印常量name进行测试
2.进阶：A中也定义一个私有的变量name,在show方法中打印测试
*/
public class HomeWork04 {
    public static void main(String[] args) {
        A a = new A();
        A.B b = a.new B();
        b.show();
    }
}

class A {
    private String name = "lili";
    public class B {
        private final String name = "tom";

        public void show () {
            System.out.println(name);
            System.out.println(A.this.name);
        }

    }
}
