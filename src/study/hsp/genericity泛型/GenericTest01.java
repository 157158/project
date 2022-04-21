package study.hsp.genericity泛型;

import java.util.ArrayList;
import java.util.Comparator;

public class GenericTest01 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("tom", 10000, new MyDate(2000, 12, 12)));
        employees.add(new Employee("jack", 20000, new MyDate(2001, 11,11)));
        employees.add(new Employee("like", 14000, new MyDate(1997, 12,17)));

        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {

                int i = emp1.getName().compareTo(emp2.getName());
                if (i != 0) {
                    return i;
                }

                return emp1.getBirthday().compareTo(emp2.getBirthday());

            }
        });

        System.out.println(employees);
    }
}

/*定义Employee3 类
1)该类包含：private 成员变量name,sal,birthday ,其中birthday 为MyDate 类的对 象；
2)为每一个属性定义getter, setter 方法； 3)重写toString 方法输出name,sal,birthday
4)MyDate3 类包含：privateF 成员変量month ,day.year;并为每一个属性定义getter, setter 方法；
5)创建该类的3个对象，并把这些对象放入ArrayList 集合中(Array List 需使用泛 型来定义)，
对集合中的元素进行排序，并遍历输出：
排序方式：调用ArrayList I 的sort方法，传入Comparator 对象使用泛型]，
先按照 name排序，如果name相同，则按生日日期的先后排序。 即：定制排序*/

class Employee {
    private String name;
    private int sal;
    private MyDate birthday;

    public Employee(String name, int sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "\nEmployee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }
}

class MyDate implements Comparable<MyDate>{
    private int month;
    private int day;
    private int year;

    @Override
    public String toString() {
        return "MyDate{" +
                "month=" + month +
                ", day=" + day +
                ", year=" + year +
                '}';
    }

    public MyDate(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public int compareTo(MyDate o) {
        int i = year - o.getYear();
        if (i != 0) {
            return i;
        }

        int month1 = month - o.getMonth();
        if (month1 != 0) {
            return month1;
        }
        return day - o.getDay();
    }
}