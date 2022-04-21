package study.hsp.Interface接口;

public class InterfaceValuedThing {
    public static void main(String[] args) {
        //接口不能实例化
//        IA ia = new IA();
        //调用接口中的属性
        System.out.println(IA.a);
    }
}

interface  IA {
    //接口中的属性已经被默认用public static final修饰了
    int a = 1;

    //抽象方法中默认包含public 和 abstract
     void connect();
     void close();
}

interface IA1 {
    void start();
}
//接口不能继承其他的类 但可以继承其他的接口.
interface IA2 extends IA {
    void stop();
}
//相对的 实现子接口的类必须实现父接口和子接口的所有抽象方法
class IQ implements IA2 {
    @Override
    public void connect() {}
    @Override
    public void close() {}
    @Override
    public void stop() {}
}

class IB implements IA {
    //必须实现所有的抽象方法
    @Override
    public void connect() {}

    @Override
    public void close() {}
}
//抽象类实现接口可以不必实现接口的方法
abstract class IS implements IA {}

//接口可以实现多继承 但必须实现所有接口的所有抽象方法
class IC implements IA, IA1 {
    @Override
    public void connect() {}

    @Override
    public void close() {}

    @Override
    public void start() {}
}
