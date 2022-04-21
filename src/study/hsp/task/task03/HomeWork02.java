package study.hsp.task.task03;

/*
1.动物类Animal 包含了抽象方法shoutO
2.Cat类継承了Animal ,并实现方法shout ,打印“猫会噛叫
3.Dog类継承了Animal ,并实现方法shout ,打印“狗会汪汪叫
4.在测试类中实例化对象Animal cat =new Cato 并调用cat的shout?方法
5.在测试类中实例化对象Animal dog =new Dogo 并调用dog的ishout?方法*/
public class HomeWork02 {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        cat.shout();
        dog.shout();
    }
}

abstract class Animal {
    void shout() {

    }
}

class Cat extends Animal {
    @Override
    void shout() {
        System.out.println("猫会喵");
    }
}

class Dog extends Animal {
    @Override
    void shout() {
        System.out.println("狗会汪");
    }
}


