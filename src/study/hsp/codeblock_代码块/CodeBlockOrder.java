package study.hsp.codeblock_代码块;

public class CodeBlockOrder {
    public static void main(String[] args) {
        new Number2();
    }
}

class Number1 {
    static {
        System.out.println("Number1 静态代码块被调用...");
    }

    {
        System.out.println("Number1 普通代码块被调用...");
    }

    public Number1() {
        System.out.println("Number1 构造器被调用...");
    }

}

class Number2 extends Number1 {

    static {
        System.out.println("Number2 静态代码块被调用...");
    }

    {
        System.out.println("Number2 普通代码块被调用...");
    }

    public Number2 () {
        System.out.println("Number2 构造器被调用...");
    }

}
