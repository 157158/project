package study.hsp.task.task03;
/*
有一个Car01类，有属性temperature (温度)，车内有Air(空调)类，有吹风的功能flow,
Air会监视车内的温度，如果温度超过40度则吹冷气。如果温度低于0度则吹暖气，如
果在这之 间则关掉空调。实例化具有不同温度的Car01对象，调用空调的flow方法，
测试空调吹的风是否 正确体现类与类的包含关系的案例类（内部类【成员内部类】）
*/

class Car01 {
    private double temperature;

    private Car01() {
    }

    private static final Car01 Car01 = new Car01();

    public static Car01 getCar01(double temperature) {
        Car01.setTemperature(temperature);
        return Car01;
    }

    public class Air {
        public void flow() {
            if (temperature < 0)
                System.out.println("冷风模式");
            else if (temperature > 40)
                System.out.println("热风模式");
            else
                System.out.println("关闭空调");
        }
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}

public class HomeWork06 {
    public static void main(String[] args) {
        Car01.getCar01(50).new Air().flow();
        Car01.getCar01(-10).new Air().flow();
        Car01.getCar01(30).new Air().flow();
    }
}
