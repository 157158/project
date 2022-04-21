package study.hsp.genericity泛型;

public class generic01 {
    public static void main(String[] args) {
        Person<String> tom = new Person<String>("tom");
        tom.name();
    }
}
// <E> 指定Person的类型 在类中的属性可以使用 E 表示自己的数据类型
class Person<E> {
    private E name;

    public Person(E name) {
        this.name = name;
    }
    public E getName() {
        return name;
    }
    public void name() {
        System.out.println("Im is " + name);
    }
    public void setName(E name) {
        this.name = name;
    }
}