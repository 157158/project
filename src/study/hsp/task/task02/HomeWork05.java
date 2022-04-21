package study.hsp.task.task02;

public class HomeWork05 {
    public static void main(String[] args) {
        Staff_1 teach = new teach_1(2000, 0, 20, "teach");
        Staff_1 scie = new scientist(4000, 20000, 0, "scie");
        Staff_1 work = new work_1(6000, 0, 0, "work");
    }
}
/*
5.设计父类一员工类。子类：工人类农民类教师类科学家类服务生类。
(1)其中工人农民服务生只有基本工资
(2)教师除基本工资外还有课酬（元/天）
(3)科学家除基本工资外还有年终奖
(4)编写一个测试类将各种类型的员工的全年工资打印出来
*/

class Staff_1 {
    private int wages;
    private int nzj;
    private int keX;
    private String name;

    public Staff_1() {
    }

    public Staff_1(int wages, int nzj, int keX, String name) {
        this.setWages(wages);
        this.setName(name);
        this.setKeX(keX);
        this.setNzj(nzj);
    }

    public int getWages() {
        return wages;
    }

    public void setWages(int wages) {
        this.wages = wages;
    }

    public int getNzj() {
        return nzj;
    }

    public void setNzj(int nzj) {
        this.nzj = nzj;
    }

    public int getKeX() {
        return keX;
    }

    public void setKeX(int keX) {
        this.keX = keX;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void wages_1(String name, int wages, int nzj, int keX) {
        System.out.println(name + " : " + (wages * 12 + nzj + (keX * 365)));
    }
}

class scientist extends Staff_1 {

    public scientist(int wages, int nzj, int keX, String name) {
        super(wages, nzj, keX, name);
        wages_1(name, wages, nzj, keX);
    }

    @Override
    public void wages_1(String name, int wages, int nzj, int keX) {
        super.wages_1(name, wages, nzj, keX);
    }
}

class teach_1 extends Staff_1 {

    public teach_1(int wages, int nzj, int keX, String name) {
        super(wages, nzj, keX, name);
        this.wages_1(name, wages, nzj, keX);
    }

    @Override
    public void wages_1(String name, int wages, int nzj, int keX) {
        super.wages_1(name, wages, nzj, keX);
    }
}

class work_1 extends Staff_1 {
    public work_1(int wages, int nzj, int keX, String name) {
        super(wages, nzj, keX, name);
        this.wages_1(name, wages, nzj, keX);
    }

    @Override
    public void wages_1(String name, int wages, int nzj, int keX) {
        super.wages_1(name, wages, nzj, keX);
    }
}