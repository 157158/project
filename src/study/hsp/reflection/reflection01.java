package study.hsp.reflection;

import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Properties;

public class reflection01 {
    public static void main(String[] args) throws Exception {
        //Properties 读取配置文件
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/study/hsp/reflection/e.Properties"));
        String aClass = properties.get("class").toString();
        String methodName = properties.get("method").toString();

        System.out.println("study.hsp.reflection.Cat");
        System.out.println(methodName);

        //反射获取类
        Class<?> cls = Class.forName(aClass);
        //创建对象实例
        Object o = cls.newInstance();

        //反射获取方法
        //获得一个方法对象
        Method method = cls.getMethod(methodName);
        //通过 方法对象.invoke(对象) 的方式调用方法
        method.invoke(o);

        //反射获取属性
        //无法获取私有属性
        Field field = cls.getField("age");
        // 反射获取属性内容
        System.out.println(field.get(o));

        //反射获取构造器
        //反射获取无参数的构造器
        Constructor<?> constructor = cls.getConstructor();
        System.out.println(constructor);

        //获取有参数的构造器
        //有参构造器需要加上 形参类型.class
        Constructor<?> constructor1 = cls.getConstructor(String.class);
        System.out.println(constructor1);

    }

}


@SuppressWarnings("FieldMayBeFinal")
class Cat {
    private String name = "tom";
    public int age = 10;

    public Cat() {}

    public Cat(String name) {this.name = name;}

    public void hi() {
        System.out.println(name + "hi");
    }

    public void tiy() {
        System.out.println(name + "tiy");
    }
}