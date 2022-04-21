package study.hsp.task.task02;

/*
 * 1.定义一个Person 类{name,age,jb)初始化Person 对象数组，
 * 有3个person 对象，并 按照age从大到小进行排序提示，
 * 使用冒泡排序Homework 01java
 * */
public class HomeWork01 {
    public static void main(String[] args) {
        Person[] person = {
                new Person(35),
                new Person(25),
                new Person(45)
        };
        for (int i = 0; i < person.length - 1; i++) {
            for (int j = 0; j < person.length - 1; j++) {
                Person lower = person[j];
                Person upper = person[j + 1];
                if (lower.getAge() > upper.getAge()) {
                    int tmp = lower.getAge();
                    lower.setAge(upper.getAge());
                    upper.setAge(tmp);
                }
            }
        }
        for (Person person1 : person) {
            System.out.println(person1.getAge());
        }
    }
}

class Person {

    private int age;

    public Person(int age) {
        this.setAge(age);
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}



