package study.hsp.oop_对象.polymorphic;

//判断输出的内容
public class PolyExercise {
    public static void main (String[] args) {
        Sub sub = new Sub();
        System.out.println(sub.count); // 20
        sub.display(); //20
        Base base = sub;
        System.out.println(base == sub); //true
        System.out.println(base.count); // 10
        base.display(); //20

    }
}

class Base {
    int count = 10;

    public void display() {
        System.out.println(this.count);
    }
}

class Sub extends Base{
    int count = 20;
    public void display () {
        System.out.println(this.count);
    }
}
