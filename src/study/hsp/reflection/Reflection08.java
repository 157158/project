package study.hsp.reflection;

import java.lang.reflect.Method;

public class Reflection08 {
    public static void main(String[] args) throws Exception {
        Class<?> cal = Class.forName("study.hsp.reflection.Boss");

        Object o = cal.getConstructor().newInstance();

        //获取公开方法
        Method method = cal.getMethod("destroy", String.class);
        //传入对象，和参数列表
        method.invoke(o, "Turtle wave Going");

        //获取静态和私有方法
        Method hi = cal.getDeclaredMethod("hi");
        //爆破私有属性
        hi.setAccessible(true);
        hi.invoke(o);
    }
}

class Boss {
    private final String name = "DENGSONGXI";

    public Boss() {}

    private static void hi() {
        System.out.println("hi");
    }

    public void destroy(String skill) {
        System.out.println(name + "使用了" + skill);
    }
}
