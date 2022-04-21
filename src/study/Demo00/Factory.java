package study.Demo00;

import static net.mindview.util.Print.print;

interface Animal {
    void call();

    void play();
}

interface AnimalFactory {
    Animal getAnimal();
//    Animal getAnimal(String name);
}

class Dog implements Animal {

    public static AnimalFactory dogUse = new AnimalFactory() {
        @Override
        public Animal getAnimal() {
            return new Dog();
        }
    };

    public String getName() {
        return name;
    }

    public static void setName(String setName) {
        name = setName;
    }

    private static String name;

    @Override
    public void call() {
        print(name + "狗叫");
    }

    @Override
    public void play() {
        print("狗玩" + name);
    }

}

class Cat implements Animal {

    @Override
    public void call() {

    }

    @Override
    public void play() {

    }
}


public class Factory {
    public static void main(String[] args) {
        Animal dog = Dog.dogUse.getAnimal();
        Dog.setName("送死");
        dog.call();
        dog.play();
    }
}
