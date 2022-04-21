package study.hsp.enum枚举;

public class enum01 {
    public static void main(String[] args) {
        //默认调用了toString方法
        System.out.println(Season.A);
        System.out.println(Season.B);
        System.out.println(Season.C);
        System.out.println(Season.D);
    }
}

class Season {
    private final String name;
    private final String desc;

    private Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public static final Season A = new Season("chun", "a");
    public static final Season B = new Season("xia", "b");
    public static final Season C = new Season("qiu", "c");
    public static final Season D = new Season("dong", "d");


    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}

