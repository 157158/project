package study.hsp.reflection;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Reflection05 {
    public static void main(String[] args) {
//        test1();
//        test2();
        test3();
    }
    public static void test3() {
        Class<Test05_> cla = Test05_.class;

        Method[] methods = cla.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }

        try {
            Method m1 = cla.getMethod("m1", String.class, String.class, String.class);
            Class<?>[] types = m1.getParameterTypes();
            for (Class<?> type : types) {
                System.out.println(m1.getName() + " = " + type.getSimpleName());
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

    }

    public static void test2() {
        Class<Test05_> cla = Test05_.class;
        Field[] fields = cla.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName() +
                    "修饰符：" + field.getModifiers() +
                    "类型：" + field.getType().getSimpleName());
        }
    }

    public static void test1() {
        Class<?> cla = Test05_.class;
        //获取全类名
        System.out.println(cla.getName());
        //获取简单类名
        System.out.println(cla.getSimpleName());
        //获取public修饰的属性
        Field[] fields = cla.getFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }
        //获取所有属性
        Field[] allField = cla.getDeclaredFields();
        for (Field field : allField) {
            System.out.println(field.getName());
        }
        //获取public方法 也会获取父类方法
        Method[] methods = cla.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }
        //获取所有方法
        Method[] allMethod = cla.getDeclaredMethods();
        for (Method method : allMethod) {
            System.out.println(method.getName());
        }
        //获取public修饰的构造器
        Constructor<?>[] constructors = cla.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor.getName());
        }

        //获取所有构造器
        Constructor<?>[] allConstructor = cla.getDeclaredConstructors();
        for (Constructor<?> constructor : allConstructor) {
            System.out.println(constructor);
        }

        //返回包信息
        Package aPackage = cla.getPackage();
        System.out.println(aPackage.getName());
        //返回父类信息
        Class<?> superclass = cla.getSuperclass();
        System.out.println(superclass.getSimpleName());
        //返回接口信息
        Class<?>[] interfaces = cla.getInterfaces();
        for (Class<?> inter : interfaces) {
            System.out.println(inter.getSimpleName());
        }

    }
}

interface B {
}

class A {
    public void a() {
    }
}

class Test05_ implements B {
    public String name;
    private int memory;
    int age;
    protected String character;

    public void m1(String aa, String bb ,String name) {
    }

    private void m2() {
    }

    void m3() {
    }

    protected void m4() {
    }

    private Test05_(int memory) {
    }

    public Test05_(String name) {
    }
}