package study.hsp.aggregate集合;

import java.util.ArrayList;
import java.util.List;

public class List01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");

        list.add(1, "0.5");
        System.out.println(list);
        System.out.println(list.get(6));
        list.remove(1);
        list.set(5, "update");

        System.out.println(list);
    }
}
