package study.hsp.oop_对象.polymorphic;

public class PloyParameterP318 {
    public static void main(String[] args) {
        OrdinaryStaff tom = new OrdinaryStaff("tom", 2500);
        Manager liLan = new Manager(2000, "liLan", 4000);

        showEmpAnnal(tom);
        showEmpAnnal(liLan);
    }

    static void showEmpAnnal (EmpPolYee e) {
        System.out.println(e.getAnnual());
    }
}


// 员工类
class EmpPolYee {
    // 属性 名字 和 月工资
    private String name;
    private double monthlySalary;

    public EmpPolYee() {
    }

    public EmpPolYee(String name, double monthlySalary) {
        setMonthlySalary(monthlySalary);
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    // 计算年工资
    public double getAnnual() {
        return monthlySalary * 12;
    }

}

// 经理类
class Manager extends EmpPolYee {

    private double bonus;

    public Manager (double bonus, String name, double monthlySalary) {
        super(name,monthlySalary);
        setBonus(bonus);
    }

    public Manager () {}

    public double getBonus () {
        return bonus;
    }

    public void setBonus (double bonus) {
        this.bonus = bonus;
    }


    public void manage () {
       System.out.println("经理" + super.getName() + "管理员工");
    }

    @Override
    // 计算年工资 加上奖金
    public double getAnnual() {
        return super.getAnnual() + this.bonus;
    }
}


class OrdinaryStaff extends EmpPolYee {
    public OrdinaryStaff (String name, double monthlySalary) {
        super(name,monthlySalary);
    }

    public OrdinaryStaff () {}

    public void work () {
        System.out.println("工人" + getName() + "正在996");
    }

    @Override
    // 计算年工资
    public double getAnnual() {
        return super.getAnnual();
    }
}
