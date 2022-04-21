package study.hsp.packaging包装类;

public class String01 {
    public static void main(String[] args) {
        String name = "jack";
        name = "tom";

        final char[] value = {'t', 'o', 'm'};
        char[] v2 = {'a', 'b', 'c'};
        value[0] = 'h';

    }
}
