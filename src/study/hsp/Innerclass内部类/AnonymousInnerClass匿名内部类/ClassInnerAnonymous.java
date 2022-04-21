package study.hsp.Innerclass内部类.AnonymousInnerClass匿名内部类;
//匿名内部类介绍
public class ClassInnerAnonymous {
    public static void main(String[] args) {
        new Outer03().fi();
    }
}

class Person {
    public void hi() {
    }

    public void ok(String str) {
        System.out.println("Person ok()" + str);
    }
}

class Outer03 {
    private int n1 = 100;

    public void fi() {
        Person person = new Person() {
            int n1 = 200;

            @Override
            public void hi() {
                System.out.println("重写hi方法, 外部类的n1:" + Outer03.this.n1 + "\n内部类的n1:" + n1);
            }
        };
        person.hi();
    }
}
