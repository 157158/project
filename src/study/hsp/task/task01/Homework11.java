package study.hsp.task.task01;

//13.将对象作为参数传递给方法。Homework 13.java
//题目要求:
//(1)定义一个Circle 类,包含一个double 型的radius 属性代表圆的半径,findArea 方 法返回圆的面积。
//(2)定义一个类PassObject,,在类中定义一个方法printAreas(,该方法的定义如下:
// public void printAreas( Circle c, int times) 方法签名
//(3)在printAreas 方法中打印输出1到times 之间的每个整数半径值,以及对应的面积。
// 例如,times 为5,则输出半径1,2,3,4,5,以及对应的圆面积。
//(4)在main方法中调用printAreas 方法,调用完毕后输出当前半径值。
public class Homework11 {
    public static void main(String[] args) {
        PassObject PO = new PassObject();
        Ccircle circle = new Ccircle();
        PO.printAreas(circle, 5);
    }
}

class Ccircle {
    double radius;

    public double findArea() {
        double area = Math.PI * radius * radius;
        return area;
    }
}

class PassObject {
    public void printAreas(Ccircle c, int times) {
        for (int i = 1; i <= times; i++) {
            c.radius = i;
            System.out.println("面积为: " + c.findArea() + "\t\t" + "times为:" + i);
        }
    }
}
