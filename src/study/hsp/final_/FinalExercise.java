package study.hsp.final_;
import static net.mindview.util.Print.*;
//求圆的面积 (单例模式 加 final)
public class FinalExercise {
    public static void main(String[] args) {
        Circle circle = Circle.getCircle(5.0);
        print(circle.area());
    }
}

class Circle {
    final static double PI = 3.14;
    private final static double PI1;
    private final double PI2;
    private static double area;

    static {
        PI1 = 3.14;
    }

    private Circle(double are) {
        this.PI2 = are;
    }

    private static Circle circle = new Circle(area);

    public static Circle getCircle(double are) {
        area = are;
        return Circle.circle;
    }

    public double area() {
        return PI * area * area;
    }
}
