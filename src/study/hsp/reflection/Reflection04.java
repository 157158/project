package study.hsp.reflection;

import com.sun.javafx.collections.IntegerArraySyncer;

//了解哪些类型有class对象
public class Reflection04 {
    public static void main(String[] args) {
        //1. 类
        Class<Reflection04> cla = Reflection04.class;
        //2. 接口
        Class<IntegerArraySyncer> interfaceClass = IntegerArraySyncer.class;
        //3. 数组
        Class<Integer[]> aClass = Integer[].class;
        //4. 注解
        Class<Deprecated> deprecatedClass = Deprecated.class;
        //5. 枚举
        Class<Thread.State> stateClass = Thread.State.class;
        //6. 基本数据类型
        Class<Long> longClass = long.class;
        //7. void
        Class<Void> voidClass = void.class;

        System.out.println(cla);
        System.out.println(interfaceClass);
        System.out.println(aClass);
        System.out.println(deprecatedClass);
        System.out.println(stateClass);
        System.out.println(longClass);
        System.out.println(voidClass);
    }
}
