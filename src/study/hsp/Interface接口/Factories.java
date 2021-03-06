package study.hsp.Interface接口;

import static net.mindview.util.Print.print;

interface Service {
    void method1();

    void method2();
}

interface ServiceFactory {
    Service getService();
}

class Implementation1 implements Service {
    @Override
    public void method1() {
        print("Implementation1 methode1");
    }

    @Override
    public void method2() {
        print("Implementation1 method2");
    }
}

class Implementation1Factory implements ServiceFactory {
    @Override
    public Service getService() {
        return new Implementation1();
    }
}

class Implementation2 implements Service {
    @Override
    public void method1() {
        print("Implementation2 method1");
    }

    @Override
    public void method2() {
        print("Implementation2 method2");
    }
}

class Implementation2Factory implements ServiceFactory {
    @Override
    public Service getService() {
        return new Implementation2();
    }
}


public class Factories {
    public static void serviceConsumer(ServiceFactory fact) {
        Service service = fact.getService();
        service.method1();
        service.method2();
    }

    public static void main(String[] args) {
        serviceConsumer(new Implementation1Factory());
//        serviceConsumer();
        serviceConsumer(new Implementation2Factory());
    }
}
