package study.hsp.genericity泛型;

public class Generic04 {
    public static void main(String[] args) {
        Gen<Integer> gInteger = new Gen<>();

    }
}

class Gen<T> {
    public static void show () {}

    @SafeVarargs
    public final void  show_(T... md) {
        for (T t : md) {
            System.out.println(t);
        }
    }
}
