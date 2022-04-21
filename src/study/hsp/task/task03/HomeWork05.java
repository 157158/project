package study.hsp.task.task03;

/*
1.有一个交通工具接口类Vehicles ,有work接口
2.有Horse 类和Boat类分别实现Vehicles
3.创建交通工具工厂类，有两个方法分别获得交通工具Horse 和Boat
4.有Person 类，有name和Vehicles 属性，在构造器中为两个属性赋值
5.实例化Person 对象“唐僧”，要求一般情况下用Horse 作为交通工具，遇到大河时用Boat 作为交通工具
6.使用代码实现上面的要求
*/

/*
   该题使用工厂方法模式 即建立一个接口
*/
interface Vehicles {
    void work();
}

class Person {
    private String name;
    private Vehicles vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }

    public void ordinary() {
        if (!(vehicles instanceof Horse)) {
            vehicles = VehicleFactory.getHorse();
        }
        vehicles.work();
    }

    public void river() {
        if (!(vehicles instanceof Boat)) {
            vehicles = VehicleFactory.getBoat();
        }
        vehicles.work();
    }

}

class VehicleFactory {
    private static final Horse horse = new Horse();

    public static Horse getHorse() {
        return horse;
    }

    private static final Boat boat = new Boat();

    public static Boat getBoat() {
        return boat;
    }

    private static final Aircraft aircraft = new Aircraft();

    public static Aircraft getAircraft() {
        return aircraft;
    }
}

class Horse implements Vehicles {
    @Override
    public void work() {
        System.out.println("骑马");
    }
}

class Boat implements Vehicles {
    @Override
    public void work() {
        System.out.println("开船");
    }
}

class Aircraft implements Vehicles {
    @Override
    public void work() {
        System.out.println("开飞机");
    }
}

public class HomeWork05 {
    public static void main(String[] args) {
        Person tang = new Person("唐僧", new Horse());
        tang.river();
        tang.ordinary();
    }
}
