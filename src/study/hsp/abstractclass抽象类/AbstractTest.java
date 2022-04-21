package study.hsp.abstractclass抽象类;

/*
 * 编写一个Employee类，声明为抽象类，包含如下三个属性：name,id,salary..
 * 提供必要的构造器和抽象方法：work.
 * 对于Manager 类来说，他既是员工，还 具有奖金(bonus )的属性。
 * 请使用继承的思想，设计CommonEmployee 类和 Manager 类，
 * 要求类中提供必要的方法进行属性访问，实现work(),提示经理/普通员工名字工作中 ooP的继承+抽象类
 * */
public class AbstractTest {
    public static void main(String[] args) {
        Employee employee = new Manager("tom", 1, 15000.0, 10000.0);
        Employee employee1 = new CommonEmployee("jerry", 2, 4000);
        employee.work();
        employee1.work();
    }
}

abstract class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.setId(id);
        this.setName(name);
        this.setSalary(salary);
    }

    //抽象方法
    public abstract void work();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class CommonEmployee extends Employee {
    public CommonEmployee(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println("普通员工" + getName() + "工资有：" + getSalary() + "，正在当一个安安稳稳的混子");
    }
}

class Manager extends Employee {
    private double bonus;

    public Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary);
//        this.setBonus(bonus);
//        this.bonus = bonus;
        this.setBonus(bonus);
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("经理" + getName() + "拿到了奖金:" + bonus +   ",总工资有" + (bonus + getSalary()) + ",像生产的的驴一样努力干活。");
    }
}

