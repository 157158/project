package study.hsp.Interface接口;


public class InterfaceDefine {
    public static void main(String[] args) {
        type_c.setType_c_att();
        System.out.println("==========");
        Micro.setMicro();
    }
}

//定义接口使用interface关键字
interface UsbInterface {
    //接口中的方法可以只写返回类型、方法名、参数列表
    //接口中所有方法默认都被public修饰
    void start();

    void stop();

    //接口中可以有静态方法
    static void recordState() {
    }
}

class type_c implements UsbInterface {

    private type_c() {
        this.start();
        this.stop();
    }

    private static type_c type_c_att = new type_c();

    public static void setType_c_att() {
    }

    //实现接口的抽象方法
    @Override
    public void start() {
        System.out.println(getClass().getName() + "插进了usb接口");
    }

    @Override
    public void stop() {
        System.out.println(getClass().getName() + "拔出了usb接口");
    }
}

class Micro implements UsbInterface {
    private Micro() {
        this.start();
        this.stop();
    }

    private static Micro micro = new Micro();

    public static void setMicro() {

    }

    //实现接口的抽象方法
    @Override
    public void start() {
        System.out.println(getClass().getName() + "插进usb接口");
    }

    @Override
    public void stop() {
        System.out.println(getClass().getName() + "拔出usb接口");
    }
}
