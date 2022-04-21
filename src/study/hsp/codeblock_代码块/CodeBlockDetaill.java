package study.hsp.codeblock_代码块;

import static net.mindview.util.Print.print;

public class CodeBlockDetaill {
    public static void main(String[] args) {
        new AA();

    }
}

class AA {
    // 构造器调用优先级低于代码块和属性
    public AA() {
        print("AA 构造器被调用");
    }

    //普通代码块与普通属性调用优先级一样 按代码书写的顺序调用 但低于静态代码块和静态属性

    private int os = or();

    public int or() {
        print("AA os属性被调用");
        return 100;
    }

    {
        print("AA 普通代码块被调用");
    }

    //静态代码块与静态属性调用优先级一样 按代码书写的顺序调用
    static {
        print("AA 静态代码块被调用");
    }

    private static int s = ss();

    public static int ss() {
        print("AA S属性被调用");
        return 100;
    }


}

