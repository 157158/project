package study.hsp.Innerclass内部类.AnonymousInnerClass匿名内部类;
//匿名内部类基于不同类型的使用
public class AnonymousInnerClass {
    public static void main(String[] args) {
        new Outer01().method();
        System.out.println("==========");
        new Outer01().method01();
        System.out.println("==========");
        new Outer01().method02();
    }
}

//接口
interface IA {
    void cry();
}

//类
class Father {
    public Father(String name) {
        System.out.println("name=" + name);
    }

    public void test() {
    }
}

//抽象类
abstract class Animal {
    abstract void eat();
}


class Outer01 {
    //基于接口的匿名内部类
    public void method() {
        //创建了匿名内部类后将地址返回给tiger
        IA tiger = new IA() {
            @Override
            public void cry() {
                System.out.println("tiger \t" + "Anonymous Inner Class");
            }
        };
        System.out.println("tiger getClass \t" + tiger.getClass().getName());
        tiger.cry();
    }

    //基于类的匿名内部类
    public void method01() {
        //传值后调用了 Father 的构造器
        Father father = new Father("jack") {
            @Override
            public void test() {
                System.out.println("test Override Parent Class");
            }
        };
        father.test();
        System.out.println("father Operation Class \t" + getClass().getName());
    }

    //基于抽象类的匿名内部类
    public void method02() {
        Animal animal = new Animal() {
            @Override
            void eat() {
                System.out.println("Dog is Eat");
            }
        };
        animal.eat();

    }

}
