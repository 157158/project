package study.hsp.task.task02;

public class HomeWork03 {
    public static void main(String[] args) {
        Teach teach = new professor("a", 1, "a", 10.0);
        String str = teach.introduce();
        System.out.println(str);
    }
}

/*
 * 3.编写老师类HomeworkO3.java
 * 1)要求有属性“姓名name",“年龄age",“职称post",“基本工资salary
 * 2)编写业务方法，introduce (),实现输出一个教师的信息。
 * 3)编写教师类的三个子类：教授类、副教授类、讲师类。
 *   工资级别分别为：教授为1.3、副 教授为1.2、讲师类1.1
 *   在三个子类里面都重写父类的introduce ()方法。
 * 4)定义并初始化一个老师对象，调用业务方法，实现对象基本信息的后台打印
 * */
class Teach {
    private String name;
    private int age;
    private String post;
    private double salary;

    public String introduce() {
        return "Teach{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", post='" + post + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Teach() {
    }

    public Teach(String name, int age, String post, double salary) {
        this.setAge(age);
        this.setName(name);
        this.setPost(post);
        this.setSalary(salary);
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

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

//教授
class professor extends Teach {
    public professor(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }

    @Override
    public String introduce() {
//        System.out.println("aaaa");
        return super.introduce();
    }
}

//助理教授
class associateProfessor extends Teach {

    public associateProfessor(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }

    @Override
    public String introduce() {
        return super.introduce();
    }
}

//讲师
class lecturer extends Teach {
    public lecturer(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }

    @Override
    public String introduce() {
        return super.introduce();
    }
}


