package study.hsp.enum枚举;

public class enum02 {
    public static void main(String[] args) {
        //enum会隐式的继承Enum类

        //name方法 返回当前对象名（常量名），子类中不能重写
        System.out.println(EnSeason.getSpring().name());
        System.out.println("=======");

        //ordinal：返回当前对象的位置号，默认从 0  开始
        System.out.println(EnSeason.getWinter().ordinal());
        System.out.println("=======");

        //values：返回当前枚举类中的所有常量
        EnSeason[] values = EnSeason.values();
        //利用 foreach 取出元素
        for (EnSeason value : values) {
            System.out.print(value + "\n");
        }
        System.out.println("=======");
        //valueOf: 简单理解为查找枚举类中的常量 输入的字符串必须是已有的常量名否则会报错
        EnSeason en = EnSeason.valueOf("SPRING");
        System.out.println(en);
        System.out.println("=======");
        //compareTo：比较两个枚举常量，比较的就是编号！
        //compareTo返回一个int值 将 SPRING的编号(0) - AUTUMN的编号(3) 即是返回的int值
        //此方法返回的是两个枚举常量编号相减的值
        System.out.println(EnSeason.SPRING.compareTo(EnSeason.AUTUMN));
    }
}

enum EnSeason {
    SPRING("春天", "温暖"), WINTER("冬天", "寒冷"), data,
    AUTUMN("秋天", "凉爽"), SUMMER("夏天", "炎热");

    private String name;
    private String desc;

    //枚举可以实现单例设计模式
    //枚举里的常量本质上符合单例模式中new的对象
    //直接使用设计常量的get方法即可
    public static EnSeason getWinter() {
        return WINTER;
    }

    public static EnSeason getSpring() {
        return SPRING;
    }

    public static EnSeason getAutumn() {
        return AUTUMN;
    }

    public static EnSeason getSummer() {
        return SUMMER;
    }

    private EnSeason() {
    }

    private EnSeason(String name, String desc) {
        this.desc = desc;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "EnSeason{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }

}

