package study.hsp.Innerclass内部类.AnonymousInnerClass匿名内部类;

//匿名内部类应用
public class AnonymousInnerClass01 {
    public static void main(String[] args) {
        //直接将匿名内部类当作一个实参传递
        //相对于传统方法 使用匿名内部类更加简洁 不需要新建一个类
        fl(new IL() {
            @Override
            public void show() {
                System.out.println("show tow name start");
            }
        });
        //传统方式 先创建一个类 再实例化这个类的对象当作fl方法的实参
//        fl(new Picture());

    }

    public static void fl(IL il) {
        il.show();
    }
}

interface IL {
    void show();
}
//创建的类
//class Picture implements IL {
//    @Override
//    public void show() {
//        System.out.println("show Name start");
//    }
//}
