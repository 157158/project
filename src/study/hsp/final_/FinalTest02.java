package study.hsp.final_;

public class FinalTest02 {
    public static void main(String[] args) {

    }
}

class Final05 {
    //可以直接赋值
    final int DATA01 = 1;
    final int DATA02;
    final int DATA03;
    //可以通过构造器来赋值
    public Final05() {
        this.DATA02 = 2;
    }
    //可以通过代码块来赋值
    {
        this.DATA03 = 3;
    }
}

class Final06 {
    //final修饰静态属性时可以在定义时赋值
    final static int DATA01 = 1;
    final static int DATA02;
    //final修饰静态属性时可以在静态代码块中赋值  不可以在构造器中赋值
    static {
        DATA02 = 2;
    }
//    final static int DATA03;
//    public Final06 () {
//        DATA03 = 3;
//    }
}
