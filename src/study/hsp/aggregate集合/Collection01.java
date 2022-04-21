package study.hsp.aggregate集合;

import java.util.ArrayList;
import java.util.HashMap;

public class Collection01 {
    public static void main(String[] args) {
        //单例集合 list
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("jack");
        arrayList.add("tom");
        System.out.println(arrayList);

        //双列集合 Map 存放 K V (即键值对)
        HashMap<Object, Object> hashMap = new HashMap<>();
        hashMap.put("1", "jack");
        hashMap.put("2", "tom");
        System.out.println(hashMap);
    }
}
