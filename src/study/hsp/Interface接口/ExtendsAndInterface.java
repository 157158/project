package study.hsp.Interface接口;

public class ExtendsAndInterface {
    public static void main(String[] args) {
        LittleMonkey wuk = LittleMonkey.getLittleMonkey();
        wuk.setName("悟空");
        wuk.climbing();
        wuk.swimming();
        wuk.flying();
    }
}

class Monkey {
    private String name;


    public Monkey() {
    }

    public String getName() {
        return name;
    }

    public void climbing() {
        System.out.println(getName() + "登仙山");
    }

    public void setName(String name) {
        this.name = name;
    }
}

interface Fishable {
    void swimming();
}

interface Birdable {
    void flying();
}

class LittleMonkey extends Monkey implements Fishable, Birdable {

    private LittleMonkey() {
    }

    private static final LittleMonkey littleMonkey = new LittleMonkey();

    public static LittleMonkey getLittleMonkey() {
        return littleMonkey;
    }

    @Override
    public void swimming() {
        System.out.println(getName() + "取定海神针");
    }

    @Override
    public void flying() {
        System.out.println(getName() + "大闹天宫");
    }
}


