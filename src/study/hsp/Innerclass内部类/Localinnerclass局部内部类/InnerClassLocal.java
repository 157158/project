package study.hsp.Innerclass内部类.Localinnerclass局部内部类;

//局部内部类
public class InnerClassLocal {
    public static void main(String[] args) {
        new Outer().m1();
    }
}

class Outer {
    private int n1 = 100;
    private int n2 = 200;
    private void m2() {
        //不能在这个方法中调用 局部内部类的作用域仅只有定义他的方法(或代码块)中
//        InnerClassLocal01 local01 =  new InnerClassLocal01();
    }

    public void m1() {
        int n2 = 300;
        //可以使用final修饰 但不可以用访问修饰符
        final class InnerClassLocal01 {
            public void local() {
                //可以访问外部类中的所有成员 包括私有成员
                //如果内部类与外部类有重名的属性 可以通过 类名.this.属性名 的方式去访问
                System.out.println("外部类的属性:" + n1 + "\n外部类的属性:" + Outer.this.n2 + "\n内部类的属性:" + n2);
            }
        }
        //在局部内部类的作用域中可以正常调用
        InnerClassLocal01 local01 = new InnerClassLocal01();
        local01.local();
    }
}

