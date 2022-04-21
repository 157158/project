package study.hsp.abstractclass抽象类;

public class Abstract {
    public static void main(String[] args) {

    }
}

abstract class Animal {
    private String name;

    public Animal (String name) {
        this.name = name;
    }

//    public void eat () {
//        System.out.println("animal eat not");
//    }
    //抽象方法
    public abstract void eat ();
}
