package study.hsp.SingletonPattern单例模式;

import static net.mindview.util.Print.print;

public class test饿汉式 {
    public static void main(String[] args) {
        HungryMan hungryMan = HungryMan.getHungryMan();
        HungryMan hungryMan1 = HungryMan.getHungryMan();
        print(hungryMan.toString());
        print(hungryMan1.toString());
        //单例模式只创建了一个对象 大大节省了内存空间
        print(hungryMan == hungryMan1);
    }
}

class HungryMan {
    private String str;

    //    public hungryMan () {}
    // 构造器私有化 防止直接new对象
    private HungryMan(String str) {
        this.str = str;
    }

    // 在类内部创建静态对象
    private static HungryMan hungryMan = new HungryMan("饿汉模式");

    // 利用静态对象的get方法返回值
    public static HungryMan getHungryMan() {
        return HungryMan.hungryMan;
    }

    @Override
    public String toString() {
//        print("aaa");
        return "hungryMan{" +
                "str='" + str + '\'' +
                '}';
    }
}