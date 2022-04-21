package study.hsp.IO文件;

//装饰器设计模式

class Test {
    public static void main(String[] args) {
        //实例化对象 传入不同的参数
        DecoratorEnt circle = new DecoratorEnt(new Circle());
        DecoratorEnt square = new DecoratorEnt(new Square());

        //测试方法
        circle.draw(10);
        circle.setColour();

        System.out.println("===============");
        square.draw(5);
    }
}


//抽象装饰器类
public abstract class Decorator extends shape {
    //表示需要装饰的对象 (多态的对象)
    protected shape in;

    Decorator(shape in) {
        this.in = in;
    }
    // 抽象方法 定义实体装饰器类的标准
    @Override
    abstract void draw();
    // 抽象方法 重载的draw方法
    abstract void draw(int num);
}

//实体装饰类
//可在装饰类中添加功能
class DecoratorEnt extends Decorator {
    DecoratorEnt(shape in) {
        super(in);
    }
    //实现方法
    @Override
    void draw() {
        in.draw();
    }
    //实现方法
    @Override
    void draw(int num) {
        for (int i = 0; i < num; i++) {
            in.draw();
        }
    }
    // 添加功能
    protected void setColour() {
        System.out.println("set Colour...");
    }
}

//定义一个抽象类和其实现的子类
abstract class shape {
    abstract void draw();
}

class Circle extends shape {
    @Override
    void draw() {
        System.out.println("get circle...");
    }
}

class Square extends shape {
    @Override
    void draw() {
        System.out.println("get shape....");
    }
}




