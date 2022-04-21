package study.hsp.task.task03;

/*
枚挙类
1.创建一个Color 枚挙类
2.有RED,BLUE,BLACK ,YELLOW,GREEN 这个五个枚挙值/对象；
3.Color?有三个属性redValue,,greenValue ,blueValue ,
4.创建构造方法，参数包括这三个属性
5.每个枚挙值都要给这三个属性赋值，三个属性对应的值分别是
6.red:255,0,0blue:0,0,255black :0,00yellow :255,25,0green :0,2550
7.定义接口，里面有方法show,要求实现该接口
8.show方法中示三属性的值
9.将枚挙对象在switch 语句中匹配使用
*/

public class HomeWork07 {
    public static void main(String[] args) {
        Color color = Color.RED;
        color.show();
        switch (color) {
            case RED:
                System.out.println("红");
                break;
            case YELLOW:
                System.out.println("黄");
            default:
                System.out.println("没有匹配到");
        }
    }
}

interface FaceColor {
    void show();
}

enum Color implements FaceColor {
    RED(255, 0, 0), BLUE(0, 0, 255),
    BLACK(0, 0, 0), YELLOW(255, 255, 0),
    GREEN(0, 255, 0);
    private int redValue;
    private int greenValue;
    private int blueValue;

    Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    @Override
    public void show() {
        System.out.println("Rgd Value is:\n" +
                redValue + "\n" +
                greenValue + "\n" +
                blueValue + "\n");
    }
}




