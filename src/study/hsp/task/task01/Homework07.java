package study.hsp.task.task01;

import static net.mindview.util.Print.*;


//7.设计一个Dog类,有名字、颜色和年龄属性,定义输出方法show显示其信息。 并创建对象,进行测试、【提示this.属性】Homework07.java
public class Homework07 {
    public static void main(String[] args) {
        Dog dog = new Dog("大白", 5, "白");
        dog.show();
    }
}

class Dog {
    int age;
    String name;
    String colour;

    public Dog (String name, int age, String colour) {
       this.age = age;
       this.name = name;
       this.colour = colour;
    }

    public void show () {
        print("小狗的名字叫: " + this.name);
        print("小狗的年龄: " + this.age);
        print("小狗的颜色: " + this.colour);
    }

}
