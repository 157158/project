package study.hsp.final_;

public class FinalTest01 {
    public static void main(String[] args) {

    }
}

final class final01 {
}

//class final02 extends final01 {} 无法继承final01

class final02 {
    public final void net() {
    }
}

class final02Ex extends final02 {
    // 无法重写父类的net方法
    //    @Override
    //    public void net() {
    //        super.net();
    //    }
}

class final03 {
    public final String data = "1";

    public void upDate() {
        //无法修改被final修饰的属性
//        this.data = "2";
    }
}

class final04 {
    public void upDate() {
        final int data = 1;
        //无法修改被修饰的局部变量
//        data = 2;
    }
}

