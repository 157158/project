package study.hsp.packaging包装类;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays01 {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 4, 3};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer n1 = (Integer) o1;
                Integer n2 = (Integer) o2;
                double n3 = n2 - n1;
                if (n3 > 0) {
                    return -1;
                } else {
                    return 1;
                }
            }
        });
        System.out.println("-------");
        System.out.println(Arrays.toString(arr));
    }
}
