package study.hsp.enum枚举;

//声明 Week 枚举类，其中包含星期一至星期日的定义；
// MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
// 使用 values 返回所有的枚举数组, 并遍历
public class EnumWork01 {
    public static void main(String[] args) {
        Week[] weeks = Week.values();
        for (Week week : weeks) {
            System.out.println(week);
        }
    }
}

enum Week {
    MONDAY("星期一"), TUESDAY("星期二"), WEDNESDAY("星期三"),
    THURSDAY("星期四"), FRIDAY("星期五"), SATURDAY("星期六"), SUNDAY("星期天");

    private String name;

    private Week (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static Week getMonday() {
        return MONDAY;
    }

    public static Week getTuesday() {
        return TUESDAY;
    }

    public static Week getWednesday() {
        return WEDNESDAY;
    }

    public static Week getThursday() {
        return THURSDAY;
    }

    public static Week getFriday() {
        return FRIDAY;
    }

    public static Week getSaturday() {
        return SATURDAY;
    }

    public static Week getSunday() {
        return SUNDAY;
    }

    @Override
    public String toString() {
        return "Week{" +
                "name='" + name + '\'' +
                '}';
    }
}
