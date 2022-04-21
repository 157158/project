package study.hsp.packaging包装类;

public class Packaging01 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        int n1 = 100;
        //手动装箱
        Integer integer = new Integer(n1);
        Integer integer1 = Integer.valueOf(n1);
        //手动拆箱
        int i = integer.intValue();

        //jdk5以后， 就可以自动拆箱装箱
        //但底层仍是使用Integer.valueOf和intValue方法
        Integer integer2 = n1;
        int j = integer2;
    }
}


