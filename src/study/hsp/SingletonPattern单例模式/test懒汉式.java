package study.hsp.SingletonPattern单例模式;
import static net.mindview.util.Print.*;
public class test懒汉式 {
    public static void main(String[] args) {
        Idler idler = Idler.getIdler();
        Idler idler1 = Idler.getIdler();
        print(idler.toString());
        print(idler1.toString());
        print(idler == idler1);
    }
}

class Idler {
    private String name;
    //同样定义静态属性对象 但并不赋值
    private static Idler idler;

    //同样定义构造器私有化
    private Idler(String name) {
        this.name = name;
    }

    //判断属性是否为空 即使用了此方法才会创建对象
    public static Idler getIdler() {
        if (idler == null) {
            idler = new Idler("懒汉模式");
            return Idler.idler;
        }
        return Idler.idler;
    }

    @Override
    public String toString() {
        return "Idler{" +
                "name='" + name + '\'' +
                '}';
    }
}