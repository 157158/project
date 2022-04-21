package study.hsp.Interface接口;

interface Animal {
    void call();

    void play();
}


class BigDog implements Animal {
    private String name;

    public BigDog() {}

    public BigDog (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void call() {
        System.out.println(name + "在狗叫");
    }

    @Override
    public void play() {

    }
}

class BigCat implements Animal {
    @Override
    public void call() {

    }

    @Override
    public void play() {

    }
}

class Factor {
    private static final BigDog dog = new BigDog();

    public static BigDog getDog() {
        return dog;
    }

    private static final BigCat cat = new BigCat();

    public static BigCat getCat() {
        return cat;
    }
}


public class FactoryAnimal {

    public static void factor(Animal animal) {
        animal.call();
        animal.play();
    }


    public static void main(String[] args) {
        factor(new BigCat());
        factor(new BigDog("送死"));
    }
}
