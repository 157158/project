package study.hsp.oop_对象.polymorphic;

// java 动态绑定机制
public class DynamicBindingP315 {
    public static void main (String[] args) {
        A a = new B();
        System.out.println(a.sum());
//        System.out.println(a.sum1());
    }
}

class A {
    int i = 10;
    // 调用getI方法时 B类对象已经绑定了getI方法 所以调用的是 B类的getI方法;
    // 理解： 对象调用方法时, 会优先调用对象运行类型的方法 如果没有才会使用父类的方法
    public int sum (){return this.getI() + 10;}
    public int getI () {return  i;}
    // 属性没有内存绑定机制 直接使用的是本类的属性
    public int sum1 () {return i + 10;}
}

class B extends A{
    int i = 20;
//    public int sum () {return i + 20;}
//    public int sum1 () {return i + 10;}
    public int getI () {return i + 1;}
}

