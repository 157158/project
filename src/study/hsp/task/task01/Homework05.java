package study.hsp.task.task01;

//5.定义一个圆类Circle ,定义属性:半径,提供显示圆周长功能的方法,提供显示圆面积的方法Homework05.java
public class Homework05 {
    public static void main(String[] args) {
        circle circle = new circle(5.0);
        circle.into();

        circle.area();
        circle.Perimeter();

        circle.into();
    }
}

class circle {
    double radius;
    double Perimeter;
    double area;

    public circle(double radius) {
        this.radius = radius;
    }

    public void Perimeter() {
        Perimeter = 2 * 3.14 * radius;
    }

    public void area() {
        area = 3.14 * (radius * radius);
    }

    public void into() {
        System.out.println("面积为： " + area + " 周长为：" + Perimeter);
    }
}
