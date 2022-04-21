package study.hsp.reflection;

import java.lang.reflect.Field;

public class reflection03 {
    public static void main(String[] args) throws Exception {
        Class<?> cla = Class.forName("study.hsp.reflection.Car");

        Object o = cla.newInstance();

        //反射类的class对象
        System.out.println(cla);

        //运行类型
        System.out.println(cla.getClass());

        //包名
        System.out.println(cla.getPackage());

        //全类名
        System.out.println(cla.getName());

        //获取类的所有属性
        Field[] fields = cla.getFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }
    }
}

class Car {
    public String name = "阿波罗";

    public int age = 5;

    public String color = "red";
}
