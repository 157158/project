package study.hsp.IO文件;

import org.junit.jupiter.api.Test;

import java.io.*;

public class ObjStream {
    public static void main(String[] args) {
    }

    @Test
    public void objStream() {
        ObjectOutputStream output = null;
        ObjectInputStream input = null;
        try {
            // 实例化对象
            output = new ObjectOutputStream(new FileOutputStream("D:\\1\\student.txt"));
            input = new ObjectInputStream(new FileInputStream("D:\\1\\student.txt"));
            //将对象写入到文件中
            output.writeObject(new Student("dog", 12));
            //读取文件中的对象
            Object obj = input.readObject();
            System.out.println(obj);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (output != null) {
                    output.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

class Student implements Serializable {
    private String name;
    private int age;

    public Student(String name, int age) {
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
