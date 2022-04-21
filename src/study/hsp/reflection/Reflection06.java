package study.hsp.reflection;

import java.lang.reflect.Constructor;

public class Reflection06 {
    public static void main(String[] args) throws Exception{
        Class<?> aClass = Class.forName("study.hsp.reflection.User");

        //1. 使用newInstance 获取无参构造器实例
        Object o = aClass.newInstance();
        System.out.println(o);

        //2. 使用 getConstructor 获取public构造器实例
        Constructor<?> constructor = aClass.getConstructor(String.class);
        Object o1 = constructor.newInstance("tom");
        System.out.println(o1);

        //2. 暴力破解  +  getDeclaredConstructors 获取私有构造器实例
        Constructor<?> con = aClass.getDeclaredConstructor(String.class, int.class);
        // 反射可以暴力破解封装
        con.setAccessible(true);
        Object o2 = con.newInstance("jerry", 20);
        System.out.println(o2);
    }
}

class User {
    private int age = 10;
    public String name = "th";
    private static String xp = "";

    public User() {}

    private User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User(String name) {
        this.name = name;
    }

    public void m1() {}

    private void m2() {}

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
