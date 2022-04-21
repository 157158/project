package study.hsp.reflection;

import java.lang.reflect.Method;


public class reflection02 {
    public static void main(String[] args) throws Exception {
        m1();
        m2();
        m3();
    }

    //普通调用方法
    public static void m1() {
        Cat cat = new Cat();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 900000000; i++) {
            cat.hi();
        }
        long end = System.currentTimeMillis();
        System.out.println("m1() 耗时=" + (end - start));
    }

    //未关闭访问检查
    public static void m2() throws Exception {
        Class<?> cla = Class.forName("study.hsp.reflection.Cat");

        Object o = cla.newInstance();

        Method method = cla.getMethod("hi");
        long start = System.currentTimeMillis();
        for (int i = 0; i < 900000000; i++) {
            method.invoke(o);
        }
        long end = System.currentTimeMillis();
        System.out.println("m2() 耗时=" + (end - start));
    }

    //关闭访问检查后优化执行效率
    public static void m3() throws Exception {
        Class<?> cla = Class.forName("study.hsp.reflection.Cat");
        Object o = cla.newInstance();
        Method method = cla.getMethod("hi");
        //关闭访问检查
        method.setAccessible(true);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 900000000; i++) {
            method.invoke(o);
        }
        long end = System.currentTimeMillis();
        System.out.println("m2() 耗时=" + (end - start));
    }
}



