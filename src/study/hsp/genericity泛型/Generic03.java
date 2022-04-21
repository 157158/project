package study.hsp.genericity泛型;

public class Generic03 {
    public static void main(String[] args) {
        Dog<Object> tek = Dog.getDog();
        tek.walk(11, 22, 33, 44, 55);
    }
}

class Dog<T> {
    private T name;

    private Dog() {

    }

    private static final Dog<Object> dog = new Dog<>();

    public static Dog<Object> getDog() {
        return dog;
    }

    @SafeVarargs
    public final <E> void walk(E... md) {
        for (E e : md) {
            System.out.print(e + "\t");
        }
    }

    public static <T> void show (T d) {

    }
}