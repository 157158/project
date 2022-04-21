package study.hsp.codeblock_代码块;

import static net.mindview.util.Print.print;

public class staticCode {
    public static void main(String[] args) {
        // 实例化对象时 类的代码块会被执行
//        new B();
        // 实例化子类对象时 父类的代码块也会被执行,
        // 注意：此时B类的静态代码块以及被执行了一次 无法再次执行
        new A();
        // 调用类的静态属性或方法时也会被执行
//        print(cat.name);
    }
}

class cat {
    static String name = "玛莎拉蒂";

    static {
        print("cat 代码块被执行...");
    }


}


class B {
    static {
        print("bb 代码块被执行...");
    }

    {
        print("B 普通代码块被调用...");
    }
}

class A extends B {
    static {
        print("aa 代码块被执行...");
    }

    {
        print("A 普通代码块被调用...");
    }
}
