package study.hsp.abstractclass抽象类;

public class Abstract01 {
    public static void main(String[] args) {
        //抽象类无法实例化
//        new A();
    }
}

abstract class A {
    public abstract void eat ();

}


class B extends A {
    //必须实现A类的eat方法
    @Override
    public void eat() {
        System.out.println("B Override A eat");
    }

    //抽象类本质还是类，可以有类的各种成员
    private String name;
    public B () {}
}