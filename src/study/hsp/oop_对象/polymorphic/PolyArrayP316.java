package study.hsp.oop_对象.polymorphic;

public class PolyArrayP316 {
    public static void main(String[] args) {
        Person[] persons = {
                new Person("老大", 20), new Student("小明", 16, 100),
                new Student("小宏", 18, 60), new Teacher("大明", 27, 20000),
                new Teacher("大宏", 35, 25000)
        };
        // 使用 instanceof 判断运行类型是否是需要的类型  如是则向下转型后输出

        for (int i = 0; i < persons.length; i++) {
            if (persons[i] instanceof Student) {
                // 简写
                ((Student) persons[i]).study();
            } else if (persons[i] instanceof Teacher) {
                // 全写
                Teacher teacher = (Teacher) persons[i];
                teacher.teach();
            } else {
                System.out.println(persons[i].say());
            }

        }
    }


}


class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
        setAge(age);
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String say() {
        return name + "\t" + age;
    }
}

class Student extends Person {
    private double score;

    public Student() {
    }

    public void study() {
        System.out.println("学生" + super.getName() + "正在学习");
    }

    public Student(String name, int age, double score) {
//        this.score = score;
        super(name, age);
        setScore(score);
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String say() {
        return super.say() + "score=" + score;
    }
}

class Teacher extends Person {
    private double salary;

    public Teacher() {
    }

    public void teach() {
        System.out.println("老师" + super.getName() + "正在教书");
    }

    public Teacher(String name, int age, double salary) {
        super(name, age);
        setSalary(salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String say() {
        return super.say() + "salary=" + salary;
    }
}



