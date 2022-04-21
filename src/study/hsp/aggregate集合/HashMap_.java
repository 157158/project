package study.hsp.aggregate集合;

import java.util.HashMap;

public class HashMap_ {
    public static void main(String[] args) {
        HashMap<Integer, String> hash = new HashMap<>();
        hash.put(1, "一");
        hash.put(2, "san");


        System.out.println(hash.get(2));
        hash.replace(2, "二");
        System.out.println(hash);
        hash.put(3, "3");
        hash.remove(3);
        System.out.println(hash.size());

        for (String map : hash.values()) {
//            System.out.print(hash.get(map) + "\t");
            System.out.println(map);
        }

    }
}
