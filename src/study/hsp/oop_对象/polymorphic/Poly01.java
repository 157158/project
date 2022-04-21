package study.hsp.oop_对象.polymorphic;

public class Poly01 {
    public static void main(String[] args) {
        Master tom = new Master("tom");
        Dog dog = new Dog("大黄");
        Bone bone = new Bone("骨头");
        tom.feed(bone,dog);

        System.out.println("===============");
        Cat cat = new Cat();
        cat.setName("小花");
        Fish fish = new Fish("小鱼干");
        tom.feed(fish,cat);
    }
}

class Food {
    private String name;

    public Food() {
    }

    public Food(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}


class Animal {
    private String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Cat extends Animal {
//    public Cat(String name) {
//        super(name);
//        super.toString();
//    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
}

class Fish extends Food {
    public Fish(String name) {
        super(name);
    }
}

class Bone extends Food {
    public Bone(String name) {
        super(name);
    }
}


class Master {

    private String name;

    public Master() {
    }

    public Master(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void feed (Food food , Animal animal) {
        System.out.println("主人：" + this.name + "正在给宠物 " + animal.getName() + " 喂 " + food.getName());
    }


}